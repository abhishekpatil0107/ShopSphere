<%@page import="com.ecomm.entity.User"%>
<%@page import="com.ecomm.dao.UserDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String e = request.getParameter("email");
	String p = request.getParameter("password");

	User user = UserDao.loginUser(e, p);

	System.out.println("User : " + user);
	
	if (user != null && user.getEmail() != null) {
		
		session.setAttribute("user", user);
		request.getRequestDispatcher("index.jsp").forward(request,response);
	} else {
		
		request.getRequestDispatcher("Login.jsp").include(request, response);
	}
	
	
	
	%>
</body>
</html>