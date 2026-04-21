<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head><title>Result Page</title></head>
<body>
    <h2>Submitted User Data</h2>
    <table border="1">
        <tr><td><b>Username:</b></td><td>${uname}</td></tr>
        <tr><td><b>Email:</b></td><td>${uemail}</td></tr>
        <tr><td><b>Designation:</b></td><td>${udesignation}</td></tr>
    </table>
    <br>
    <a href="index.jsp">Go back to Client Side (Form)</a>
</body>
</html>
