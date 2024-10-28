<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<% String path = "."; %>
<%@ include file = "template/head.jspf" %>
<script type = "text/javascript">

</script>
</head>
<body>
<%@ include file = "template/menu.jspf" %>
<div class= "jumbotron">
	<h1>Welcome My Site!</h1>
	<p>자주 이용바랍니다</p>
	<p><a class="btn btn-primary btn-lg" href = "<%=path %>/bbs/" role = "button">게시판으로</a><p>
</div>
<%@ include file = "template/footer.jspf" %>

</body>
</html>