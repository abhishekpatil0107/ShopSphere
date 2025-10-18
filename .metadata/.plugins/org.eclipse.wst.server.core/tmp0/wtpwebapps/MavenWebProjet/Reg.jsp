<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registation</title>
</head>
<body>
<form action="StudReg.jsp" method="post">
<label>Enter student full name: </label><br><br>
<input type="text" name="sname"><br><br>
<label>Enter student Email ID: </label><br><br>
<input type="email" name="email"><br><br>
<label>Enter student password: </label><br><br>
<input type="password" name="password"><br><br>
<label>Enter Mobile Number: </label><br><br>
<input type="text" name="mobno"><br><br>
<input type="submit" value="Submit">  &nbsp;&nbsp;&nbsp;
<input type="reset" value="Reset"><br><br>
</form>

Already Register? <a href="LoginForm.jsp">Login here</a>
</body>
</html>