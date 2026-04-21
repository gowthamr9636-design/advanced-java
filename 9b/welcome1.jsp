<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head><title>Welcome Page</title></head>
<body>
    <%
        String name = request.getParameter("user_name");
        
        if (name != null && !name.trim().isEmpty()) {
            // Store name in session
            session.setAttribute("savedName", name);
            // Set session expiry to 1 minute (60 seconds)
            session.setMaxInactiveInterval(60); 
        }

        // Retrieve name from session to verify it exists
        String sessionName = (String) session.getAttribute("savedName");

        if (sessionName != null) {
    %>
            <h2>Hello <%= sessionName %>!</h2>
            <p>Your session is now active.</p>
            <p style="color:blue;">It will expire after 1 minute of inactivity.</p>
            <br>
            <a href="checkExpiry.jsp">Click here to check session status</a>
    <%
        } else {
            out.println("<h2 style='color:red;'>No active session found.</h2>");
            out.println("<a href='index.jsp'>Go Back</a>");
        }
    %>
</body>
</html>