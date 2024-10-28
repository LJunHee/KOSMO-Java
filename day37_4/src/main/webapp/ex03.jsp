<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored = "false"%>
<%@ taglib prefix= "c" uri ="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>jstl step3</h1>
	
	<ul>
	<c:forEach begin="1" end="10" var = "i">
		<li>item<c:out value="${i }"></c:out></li>
	</c:forEach>
	</ul>
	
</body>
</html>