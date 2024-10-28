<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file = "../template/head.jspf" %>
</head>
<body>
<%@ include file = "../template/menu.jspf" %>
<h2 class = "page-header text-center">수정 페이지</h2>
<form method = "post">
	<div class = "form-group">
		<label>사번</label><input name ="empno" value = "${bean.empno }" class = "form-control" readonly/>
	</div>
	<div class = "form-group">
		<label>이름</label><input name ="ename" value = "${bean.ename }" class = "form-control" />
	</div>
	<div class = "form-group">
		<label>금액</label><input name ="pay" value = "${bean.pay }" class = "form-control" />
	</div>
	<div class = "form-group">
		<label>날짜</label><input name ="hiredate" value = "${bean.hiredate }" class = "form-control" disabled="disabled"/>
	</div>
	<div class = "form-group">
		<button type = "submit" class = "btn btn-primary btn-block" >수정</button>
		<button type = "reset" class = "btn btn-danger btn-block" >취소</button>
		<button type = "button" class = "btn btn-default btn-block" onclick = "history.back();">뒤로</button>
	</div>

</form>
<%@ include file = "../template/footer.jspf" %>

</body>
</html>