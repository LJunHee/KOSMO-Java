<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="./" method = "post" enctype="multipart/form-data">
		<div>
			<input name = "name" placeholder="name"/>
		</div>
		<div>
			<input type = "file" name = "file"/>
		</div>
		<div>
			<button>입력</button>
		</div>
	</form>
</body>
</html>