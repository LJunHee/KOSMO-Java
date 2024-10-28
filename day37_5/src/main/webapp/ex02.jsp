<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String msg = "문자열";
//scope
// page > request > session > application
session.setAttribute("msg","session");
application.setAttribute("msg","application");
pageContext.setAttribute("msg","page");
request.setAttribute("msg","req");

pageContext.setAttribute("nalja",new java.util.Date());
%>
<ul>
	<li>${msg }</li>
	<li>${pageScope.msg }</li>
	<li>${requestScope.msg }</li>
	<li>${sessionScope.msg }</li>
	<li>${applicationScope.msg }</li>
	<li>${nalja }</li>
	<li><%=request.getContextPath() %></li>
	<li><%=pageContext.getRequest() %></li>
	<li>${pageContext.request.contextPath }</li>
</ul>
</body>
</html>