<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ControllerJSPFile</title>
</head>
<body>
<%@page import="mvc.RestoDAO" %>
<jsp:useBean id="r" class="mvc.RestoBean"></jsp:useBean>
<jsp:setProperty property="*" name="r"/>
<%
int status=RestoDAO.saveData(r);
out.println(r);
if(status>0)
{
	response.sendRedirect("insert.html");
}
else
{
	response.sendRedirect("error.html");
}
%>>
</body>
</html>