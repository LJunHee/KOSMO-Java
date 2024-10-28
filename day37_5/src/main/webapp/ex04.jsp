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
	<h1>jstl</h1>
	<ul>
		<li><c:out value="${1234 }"></c:out></li>
		<li><c:out value="${3.14 }"></c:out></li>
		<li><c:out value="${'abcd' }"></c:out></li>
		<li><c:out value="${null }">abcd</c:out></li>
		<li><c:set var="a1" value="${1234 }"></c:set></li>
		<li>${a1>1111 }</li>
		<li><c:set var="a2">${1234 }</c:set></li>
		<li>${a2<1111 }</li>
	</ul>
</body>
</html>











