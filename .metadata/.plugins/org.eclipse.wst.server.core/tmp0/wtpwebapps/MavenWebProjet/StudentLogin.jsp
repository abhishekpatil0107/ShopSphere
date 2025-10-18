<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Login</title>
</head>
<body>
<%@page import="com.web.java.StudentDAO" %>

<%
String e=request.getParameter("email");
String p=request.getParameter("password");

boolean result=StudentDAO.login(e, p);

if(result)
{
	response.sendRedirect("Dashboard.jsp");
}
else
{
	response.sendRedirect("Error.jsp");
	%>
	<jsp:include page="LoginForm.jsp"></jsp:include>
	<%
    }
	%>
</body>
</html>