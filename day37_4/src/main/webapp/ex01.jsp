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
	<h1>jstl step1</h1>
	<ul>
		<li><c:out value = "abcd"></c:out></li>
		<li><c:out value = "abcd">ABCD</c:out></li>
		<li><c:out value = "<%=null %>">ABCD</c:out></li>
		<li><c:set var="a1" value="abcd"></c:set></li>
		<li><c:out value = "${a1 }">ABCD</c:out></li>
		<li><c:set var="a2" >aaaa</c:set></li>
		<li><c:out value = "${a2 }">ABCD</c:out></li>
		<%-- <li><c:set var="a3" value="bbbb">cccc</c:set></li> --%>
		<li><c:set var="a3" value="1111"></c:set></li>
		<li><c:out value = "${a3+1 }">ABCD</c:out></li>
		<li></li>
		<li></li>
		<li></li>
	</ul>
</body>
</html>