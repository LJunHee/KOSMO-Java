<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file = "../template/menu.jspf" %>
<h2 class = "page-header">insert page</h2>
<form action="delete.do" method="post">
	<div class="form-group">
		<label>empno</label><input value = "${bean.empno }" class = "form-control" name="empno"/>
	</div>
	<div class="form-group">
		<label>ename</label><input value = "${bean.ename }" class = "form-control" name="ename"/>
	</div>
	<div class="form-group">
		<label>pay</label><input value = "${bean.pay }" class = "form-control" name="pay"/>
	</div>
	<div class="form-group">
		<label>hiredate</label><input value = "${bean.hiredate }" class = "form-control" />
	</div>
	<div class="form-group">
		<button type = "submit">수정</button>
		<button type = "reset">삭제</button>
		<button type = "button" onclick = "history.back();">뒤로</button>
	</div>
</form>
<%@ include file = "../template/footer.jspf" %>
</body>
</html>