<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<jsp:include page="../template/head.jsp">
	<jsp:param value=".." name="path"/>
</jsp:include>
<style type="text/css">
	#content form{
		width: 300px;
		margin: 0px auto;
	}
</style>
</head>
<body>
<jsp:include page="../template/header.jsp"></jsp:include>
<jsp:include page="../template/menu.jsp">
	<jsp:param value=".." name="path"/>
</jsp:include>
	<h2 class="text-center">로그인 페이지</h2>
	<form action="result.jsp" method="post">
	  <div class="form-group">
	    <label for="id">id</label>
	    <input type="text" class="form-control" name="id" id="id" placeholder="id">
	  </div>
	  <div class="form-group">
	    <label for="pw">pw</label>
	    <input type="password" class="form-control" name="pw" id="pw" placeholder="pw">
	  </div>
	  <button type="submit" class="btn btn-primary">Login</button>
	  <button type="reset" class="btn btn-default">Reset</button>
	  <a href="join.jsp" class="btn btn-default" role="button">Join</a>
	</form>
<jsp:include page="../template/footer.jsp"></jsp:include>
</body>
</html>








