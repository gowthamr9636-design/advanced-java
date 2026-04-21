<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Welcome Page</title>
</head>
<body>
    <%
        String name = request.getParameter("user_name");
        if (name != null) {
            // Set session attribute
            session.setAttribute("savedName", name);
            // Set session expiry to 60 seconds (1 minute)
            session.setMaxInactiveInterval(60); 
        }
        
        // Retrieve name from session
        String sessionName = (String) session.getAttribute("savedName");

        if (sessionName != null) {
    %>
            <h2>Hello <%= sessionName %>!</h2>
            <p>Your session is active. It will expire after 1 minute of inactivity.</p>
            <p><a href="checkSession.jsp">Verify Session Status</a></p>
    <%
        } else {
            out.println("<h2>Session has expired or no name was entered.</h2>");
            out.println("<a href='index.jsp'>Try Again</a>");
        }
    %>
</body>
</html>