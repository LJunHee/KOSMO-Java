<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>jstl 조건문</h1>
	<c:set value="0" var="su"></c:set>
	<c:if test="${su ge 0 }">
		<p>양수</p>
	</c:if>
	<c:if test="${su lt 0 }">
		<p>음수</p>
	</c:if>
	<hr/>
	<c:choose>
		<c:when test="${su gt 0 }">양수</c:when>
		<c:when test="${su lt 0 }">음수</c:when>
		<c:otherwise>0</c:otherwise>
	</c:choose>
</body>
</html>








