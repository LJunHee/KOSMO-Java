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
	  <li><a href="${root }/dept/">List</a></li>
	  <li class="active">Add</li>
	</ol>
	<h2 class="page-header">Add page<small>(dept)</small></h2>
	<form action="./" method="post">
		<div class="form-group">
			<input type="text" name="deptno" placeholder="부서번호" class="form-control"/>
		</div>
		<div class="form-group">
			<input type="text" name="dname" placeholder="부서명" class="form-control"/>
		</div>
		<div class="form-group">
			<input type="text" name="loc" placeholder="지역명" class="form-control"/>
		</div>
		<div class="form-group">
			<button type="submit" class="btn btn-primary">입력</button>
			<button type="reset" class="btn btn-default">취소</button>
			<button type="button" class="btn btn-default"onclick="history.back();">뒤로</button>
		</div>
	</form>
</div>
</body>
</html>












