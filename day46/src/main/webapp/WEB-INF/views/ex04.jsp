<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>ex04 page</h1>
	<form action = "ex15.do" method = "post">
		<div>
			<input type = "text" name="empno" placeholder="empno"/>
		</div>
		<div>
			<input type = "text" name="ename" placeholder="ename"/>
		</div>
		<div>
			<input type = "text" name="pay" placeholder="pay"/>
		</div>
		<div>
			<input type = "date" name="hiredate" />
		</div>
		<div>
			<input type = "submit" value="전송"/>
		</div>
	</form>
</body>
</html>