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
			<h2>입력페이지</h2>
			<form action="insert.do" method = "post">
				<div class = "form-group">
					<label>ename</label><input name="ename" class="form-control"/>
				</div>
				<div class = "form-group">
					<label>pay</label><input name="pay" class="form-control"/>
				</div>
				<div class = "form-group">
					<button class = "btn btn-default">입력</button>
					<button type="button" class = "btn btn-default" onclick="history.back();">뒤로</button>
				</div>
			</form>
		</div>
	</div>
</body>
</html>