<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student_Reg</title>
</head>
<body>
<
<%@page import="com.web.java.StudentDAO" %>
<jsp:useBean id="s" class="com.web.java.Student"></jsp:useBean>
<jsp:setProperty property="*" name="s"/>

<%= s %>
<%
StudentDAO.addStudent(s);
Thread.sleep(1000);
response.sendRedirect("register.jsp");
%>
</body>
</html>