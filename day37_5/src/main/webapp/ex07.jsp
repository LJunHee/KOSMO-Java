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
	<h1>jstl etc</h1>
<%
String msg = "java,db,web,framework";
pageContext.setAttribute("msg",msg);
%>
<ul>
	<c:forTokens items="${msg }" delims=",">
	<li></li>
	</c:forTokens>
</ul>
</body>
</html>