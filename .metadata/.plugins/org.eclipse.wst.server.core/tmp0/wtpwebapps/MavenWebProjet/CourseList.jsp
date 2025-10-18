<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Course List</title>
<style>
table
{
border-collapse:collapse;
}
th,tr,td
{
border:solid 2px black;
cellspacing:1px;
cellpadding:2px;
}
</style>
</head>
<body>

<%@page import="com.web.java.CourseDAO" %>
<%@page import="com.web.java.Course" %>
<%@page import="java.util.*" %>

<%
  List<Course>clist=CourseDAO.getallCourses();
%>

<nav>
<a href="Dashboard.jsp">Home</a> &nbsp; &nbsp; &nbsp;
<a href="ProfileUpdate.jsp">Profile Edit</a> &nbsp; &nbsp; &nbsp;
<a href="CourseList.jsp">Course List</a> &nbsp; &nbsp; &nbsp;
<a href="Logout.jsp">Logout</a> &nbsp; &nbsp; &nbsp;
</nav>

<hr>
<table>
<tr>
<th>Course Id</th>
<th>Course Name</th>
<th>Course Description</th>
<th>Course Price</th>
<th>Action</th>

<%
for(Course c:clist)
{
%>
<tr>
<td><%=c.getCid() %></td>
<td><%=c.getCname() %></td>
<td><%=c.getCdesc() %></td>
<td><%=c.getCprice() %></td>
<td><button>Enroll</button></td>
<%
}
%>
</table>
</body>
</html>