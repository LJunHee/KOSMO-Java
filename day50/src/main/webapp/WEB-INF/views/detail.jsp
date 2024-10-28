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
	<form action = "./${bean.deptno }" method = "post">
		<div>
			<input name="deptno" value="${bean.deptno }" readonly="readonly"/>
		</div>
		<div>
			<input name="dname" value="${bean.dname }"/>
		</div>
		<div>
			<input name="loc" value="${bean.loc }" />
		</div>
		<div>
			<button>수정</button>
			<button type = "button" onclick="history.back();">뒤로</button>
		</div>
	</form>
</div>
<script type="text/javascript">
</script>
</body>
</html>