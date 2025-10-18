<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="com.ecomm.entity.User"%>
<%@page import="com.ecomm.dao.UserDao"%>
<!DOCTYPE html>
<html>
<head>
<jsp:useBean id="u" class="com.ecomm.entity.User" />
<jsp:setProperty property="*" name="u" />

<%@page import="com.ecomm.dao.UserDao"%>
</head>
<body>
	<%
	boolean r = UserDao.registerUser(u);

	if (r) {
		request.getRequestDispatcher("index.jsp").forward(request, response);
	} else {
		out.println("Error");
		request.getRequestDispatcher("Register.jsp").include(request, response);
	}
	%>
</body>
</html>