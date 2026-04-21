<!DOCTYPE html>
<html>
<head>
    <title>Student Mark Entry</title>
    <script>
        function validate() {
            let fields = ["roll", "name", "s1", "s2", "s3", "s4", "s5"];
            for (let id of fields) {
                let val = document.getElementById(id).value;
                if (val === "") {
                    alert("Please fill all fields");
                    return false;
                }
            }
            return true;
        }
    </script>
</head>
<body>
    <h2>Student Result System</h2>
    <form action="ResultServlet" method="POST" onsubmit="return validate()">
        Roll No: <input type="text" name="rollno" id="roll"><br><br>
        Name: <input type="text" name="studentname" id="name"><br><br>
        Subject 1: <input type="number" name="sub1" id="s1"><br><br>
        Subject 2: <input type="number" name="sub2" id="s2"><br><br>
        Subject 3: <input type="number" name="sub3" id="s3"><br><br>
        Subject 4: <input type="number" name="sub4" id="s4"><br><br>
        Subject 5: <input type="number" name="sub5" id="s5"><br><br>
        <input type="submit" value="Calculate Result">
    </form>
</body>
</html>