<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head><title>Status Check</title></head>
<body>
    <%
        String user = (String) session.getAttribute("savedUser");

        if (user != null) {
            out.println("<h2 style='color:green;'>Status: Session Active</h2>");
            out.println("<p>Welcome back, " + user + "!</p>");
        } else {
            out.println("<h2 style='color:red;'>Status: Session Expired!</h2>");
            out.println("<p>The server has cleared your data due to timeout.</p>");
        }
    %>
    <br><a href="index.jsp">Restart Test</a>
</body>
</html>
