<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Check Session</title>
</head>
<body>
    <%
        String sessionName = (String) session.getAttribute("savedName");
        if (sessionName != null) {
            out.println("<h2>Session is still active, Hello " + sessionName + "!</h2>");
        } else {
            out.println("<h2 style='color:red;'>Session Expired!</h2>");
            out.println("<p>The user name is no longer available in the session.</p>");
        }
    %>
    <br><a href="index.jsp">Back to Start</a>
</body>
</html>
