<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file = "template/menu.jspf" %>
<div class = "container">
	<div class = "jumbotron">
		<h2>dept add page</h2>
	</div>
	<form action = "./" method = "post">
		<div>
			<input name="dname" placeholder="dname"/>
		</div>
		<div>
			<input name="loc" placeholder="loc"/>
		</div>
		<div>
			<button>입력</button>
			<button type = "button" onclick="history.back();">뒤로</button>
		</div>
	</form>
</div>
<script type="text/javascript">
</script>
</body>
</html>