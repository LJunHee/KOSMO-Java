<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="../template/head.jspf" %>
</head>
<body>
<%@ include file="../template/menu.jspf" %>
<div class="container">
	<ol class="breadcrumb">
	  <li><a href="${root }/">Home</a></li>
	  <li class="active">List</li>
	</ol>
	<h2 class="page-header">list page<small>(dept)</small></h2>
	<div class="list-group">
	  <a href="#" class="list-group-item active">
	    <h4 class="list-group-item-heading">Ename</h4>
	    <p class="list-group-item-text">location</p>
	  </a>
	  <c:forEach items="${list }" var="bean">
	  <a href="${bean.deptno }" class="list-group-item">
	    <h4 class="list-group-item-heading">${bean.dname }</h4>
	    <p class="list-group-item-text">${bean.loc }</p>
	  </a>
	  </c:forEach>
	</div>
	<p><a href="add" class="btn btn-primary btn-block" role="button">입력</a></p>
</div>
</body>
</html>












