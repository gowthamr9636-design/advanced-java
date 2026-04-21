<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head><title>Verify Session</title></head>
<body>
    <%
        String sessionName = (String) session.getAttribute("savedName");

        if (sessionName != null) {
            out.println("<h2 style='color:green;'>Session is still ACTIVE!</h2>");
            out.println("<p>Welcome back, " + sessionName + "</p>");
        } else {
            out.println("<h2 style='color:red;'>Session EXPIRED!</h2>");
            out.println("<p>The user data has been cleared from the server.</p>");
        }
    %>
    <br><a href="index.jsp">Back to Home</a>
</body>
</html>