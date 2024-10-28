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
<script type= "text/javascript">
$(function(){
	$('form').submit($function(){
		if($('#pw').val != $('#pw').next().val()) return false;
	});
});
</script>
</head>
<body>
<jsp:include page="../template/header.jsp"></jsp:include>
<jsp:include page="../template/menu.jsp">
	<jsp:param value=".." name="path"/>
</jsp:include>
	<h2 class = "text-center">회원가입</h2>
	<form action="joinResult.jsp" method = "post">
	  <div class="form-group">
	    <label for="id">id</label>
	    <input type="text" class="form-control" name="id" id="id" placeholder="id">
	  </div>
	  <div class="form-group">
	    <label for="pw">pw</label>
	    <input type="password" class="form-control" name="pw" id="pw" placeholder="pw">
	    <input type="text" class="form-control" id="pw" placeholder="pw 재입력">
	  </div>
	  <div class="form-group">
	    <label for="name">name</label>
	    <input type="text" class="form-control" name="name" id="name" placeholder="name">
	  </div>
	  <button type="submit" class="btn btn-primary">Join</button>
	  <button type="reset" class="btn btn-default">Reset</button>
	</form>
<jsp:include page="../template/footer.jsp"></jsp:include>
</body>
</html>