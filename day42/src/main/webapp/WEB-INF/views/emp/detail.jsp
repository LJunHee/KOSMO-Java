<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<nav>
		<a href="/index.do">home</a>
		<a href="/emp/index.do">emp</a>
	</nav>
	<div class="container">
		<div>
			<h2>상세페이지</h2>
			<form action="delete.do" method = "post">
				<div class = "form-group">
					<label>empno</label><input value = "${bean.empno }" name="empno" class="form-control"/>
				</div>
				<div class = "form-group">
					<label>ename</label><input value = "${bean.ename }" name="ename" class="form-control"/>
				</div>
				<div class = "form-group">
					<label>hiredate</label><input value = "${bean.hiredate }" name="hiredate" class="form-control"/>
				</div>
				<div class = "form-group">
					<label>pay</label><input value = "${bean.pay }" name="pay" class="form-control"/>
				</div>
				<div class = "form-group">
					<button class = "btn btn-default">삭제</button>
					<button type="button" class = "btn btn-default" onclick="history.back();">뒤로</button>
				</div>
			</form>
		</div>
	</div>
</body>
</html>