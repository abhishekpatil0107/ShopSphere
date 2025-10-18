<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CoreTag_JSPFile</title>
</head>
<body>
<c:out value="${'This is our first JSTL file' }"></c:out>
<br>

<c:set var="i" value="${28}"></c:set>
<c:out value="${i}"></c:out>
<br>

<c:set var="total" value="${75+45+85}"></c:set>
<c:set var="per" value="${total/3}"></c:set>
<c:out value="${per}"></c:out>
<br>

<%--- <c:if test="${per>=35 }">
<c:out value="${'Student is Pass'}"></c:out>
</c:if>
--%>

<c:choose>
<c:when test="${per>=35 && per<=45 }">
<c:out value="${Student is pass with D grade }"></c:out>
</c:when>

<c:when test="${per>45 && per<=55 }">
<c:out value="${Student is pass with C grade }"></c:out>
</c:when>

<c:when test="${per>55 && per<=65 }">
<c:out value="${Student is pass with B grade }"></c:out>
</c:when>

<c:when test="${per>65 && per<=75 }">
<c:out value="${Student is pass with A grade }"></c:out>
</c:when>

<c:when test="${per>75}">
<c:out value="${Student is pass with distinction grade }"></c:out>
</c:when>

<c:otherwise>
<c:out value="${Student is fail }"></c:out>
</c:otherwise>
</c:choose>
<br>

<c:forEach var="i" begin="1" end="20">
<c:out value="${i}"></c:out>
</c:forEach>
<br>

<c:catch var="theException">
<%int x=20/10;%>
<%=x %>
</c:catch>

<c:if test="${theException!=null}">
<p>The exception is :${theException}</p>
</c:if>

</body>
</html>   