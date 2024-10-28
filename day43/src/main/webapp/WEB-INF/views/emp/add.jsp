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
<h2 class="page-header">insert page</h2>
<form action="insert.do" method="post">
	<div class="form-group">
		<label>ename</label><span class="text-danger">${enameErr }</span>
		<input type="text" name="ename" class="form-control" value="${ename }"/>
	</div>
	<div class="form-group">
		<label>pay</label><span class="text-danger">${payErr }</span>
		<input type="text" name="pay" class="form-control" value="${pay }"/>
	</div>
	<div class="form-group">
		<button class="btn btn-primary btn-block">입력</button>
		<button type="reset" class="btn btn-default btn-block">취소</button>
		<button type="button" class="btn btn-default btn-block" onclick="history.back();">뒤로</button>
	</div>
</form>
<%@ include file="../template/footer.jspf" %>
</body>
</html>