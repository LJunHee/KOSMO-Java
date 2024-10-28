<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file = "../template/head.jspf" %>
<style type="text/css">
.err{
	padding-left : 50px;
	font-weight : lighter;
	font-style : italic;
	font-size : 0.8em;
	color : red;
}
</style>
</head>
<body>
<%@ include file = "../template/menu.jspf" %>
<h2 class = "page-header text-center">입력 페이지</h2>
<form action ="add.do" method = "post">
	<div class = "form-group">
		<label>이름</label><span class = "err">${errEname }</span><input name="ename" class="form-control" value = "${ename }"/>
	</div>
	<div class = "form-group">
		<label>금액</label><span class ="err">${errPay }</span><input type = "number" name="pay" class="form-control" value = "${pay }"/>
	</div>
	<div class = "form-group">
		<button class = "btn btn-primary btn-block">입력</button>
		<button type = "reset" class = "btn btn-danger btn-block">취소</button>
		<button type = "button" class = "btn btn-default btn-block" onclick = "history.back();">뒤로</button>
	</div>
</form>
<%@ include file = "../template/footer.jspf" %>
</body>
</html>