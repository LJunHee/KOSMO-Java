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
	<h1>jtsl etc3</h1>
	<ul>
		<li><c:url value = "./ex08.jsp"></c:url></li>
		<li><c:url value = "./ex08.jsp">
			<c:param name="id" value="한글"></c:param>
			<c:param name="pw" value="1234"></c:param>
		</c:url></li>
		<li><c:url value = "https://google.com/search" var="google">
			<c:param name="q" value="java"></c:param></c:url></li>
		<li>${google }</li>
		<li>${google }</li>
		<li>${google }</li>
	</ul>
</body>
</html>