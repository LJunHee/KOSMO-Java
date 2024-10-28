<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix ="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
pageContext.setAttribute("nalja",new Date());
pageContext.setAttribute("pay",10000);
%>
<p><fmt:formatDate value = "${nalja }" pattern = "yyyy-MM-dd"/></p>
<p><fmt:formatNumber value = "${pay }" pattern = "###,###"/></p>
<p><fmt:formatNumber value = "${pay }" pattern = "###,###원" var = "p"/>aaa</p>
<p>${p }</p>
<p><fmt:parseNumber value = "${'1234' }"/></p> 
<p><fmt:parseNumber value = "${pay }" var = "p2"/></p>
<p><fmt:formatNumber value = "${p2 }" pattern="###,###원"/></p>
</body>
</html>