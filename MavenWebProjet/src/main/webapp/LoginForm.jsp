<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Form</title>
</head>
<body>
<form action="StudentLogin.jsp" method="post">
<label>Enter Email ID: </label><br><br>
<input type="email" name="email"><br><br>
<label>Enter password: </label><br><br>
<input type="password" name="password"><br><br>
<input type="submit" value="Submit">  &nbsp;&nbsp;&nbsp;
<input type="reset" value="Reset"> &nbsp;&nbsp;&nbsp;
<br>
Create an account <a href="Reg.jsp">Register here</a>

</form>

</body>
</html>