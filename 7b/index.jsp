<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Cookie Manager</title>
</head>
<body>
    <h2>Add a New Cookie</h2>
    <form action="index.jsp" method="POST">
        Cookie Name: <input type="text" name="cname" required><br><br>
        Cookie Value: <input type="text" name="cvalue" required><br><br>
        Domain: <input type="text" name="cdomain" placeholder="localhost"><br><br>
        Max Expiry Age (sec): <input type="number" name="cage" required><br><br>
        <input type="submit" name="add" value="Add Cookie">
    </form>

    <%
        if(request.getParameter("add") != null) {
            String name = request.getParameter("cname");
            String value = request.getParameter("cvalue");
            String domain = request.getParameter("cdomain");
            int age = Integer.parseInt(request.getParameter("cage"));

            Cookie userCookie = new Cookie(name, value);
            userCookie.setMaxAge(age);
            if(domain != null && !domain.isEmpty()) {
                userCookie.setDomain(domain);
            }
            
            response.addCookie(userCookie);
            out.println("<p style='color:green;'><b>Cookie Set:</b> Name=" + name + ", Age=" + age + "s</p>");
        }
    %>
    
    <br>
    <a href="showCookies.jsp">Go to the active cookie list</a>
</body>
</html>