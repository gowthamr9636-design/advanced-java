<!DOCTYPE html>
<html>
<head><title>Session Setup</title></head>
<body>
    <h2>Custom Session Manager</h2>
    <form action="welcome.jsp" method="POST">
        Enter Your Name: <input type="text" name="user_name" required><br><br>
        Set Expiry (in seconds): <input type="number" name="expiry" value="60" required><br><br>
        <input type="submit" value="Start Session">
    </form>
</body>
</html>
