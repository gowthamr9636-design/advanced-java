<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head><title>Student Result</title></head>
<body>
    <h2>Student Performance Report</h2>
    <table border="1">
        <tr><td>Roll No:</td><td>${roll}</td></tr>
        <tr><td>Student Name:</td><td>${name}</td></tr>
        <tr><td>Average Marks:</td><td>${avg}%</td></tr>
        <tr><td>Final Result:</td>
            <td style="color: ${status == 'PASS' ? 'green' : 'red'}; font-weight: bold;">
                ${status}
            </td>
        </tr>
    </table>
    <br>
    <a href="index.jsp">Back to Data Entry</a>
</body>
</html>
