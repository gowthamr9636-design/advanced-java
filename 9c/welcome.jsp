<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head><title>Welcome</title></head>
<body>
    <%
        String name = request.getParameter("user_name");
        String expiryStr = request.getParameter("expiry");

        if (name != null && expiryStr != null) {
            int expiryTime = Integer.parseInt(expiryStr);
            
            // Set the session attribute and custom timeout
            session.setAttribute("savedUser", name);
            session.setMaxInactiveInterval(expiryTime); 
    %>
            <h2>Hello <%= name %>!</h2>
            <p>Your session is set to expire in <b><%= expiryTime %> seconds</b>.</p>
            <hr>
            <p>Click below to check status <b>before</b> time runs out:</p>
            <a href="checkStatus.jsp">Check Session Status</a>
    <%
        } else {
            response.sendRedirect("index.jsp");
        }
    %>
</body>
</html>