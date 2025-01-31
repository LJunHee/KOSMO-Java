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
		width: 400px;
		margin: 0px auto;
	}
</style>
</head>
<body>
<jsp:include page="../template/header.jsp"></jsp:include>
<jsp:include page="../template/menu.jsp">
	<jsp:param value=".." name="path"/>
</jsp:include>
<h2 class="text-center">입력 페이지(답글)</h2>
<form action="reInsert.jsp">
	<input type="hidden" name="ref" value="<%=request.getParameter("ref")%>">
	<input type="hidden" name="seq" value="<%=request.getParameter("seq")%>">
	<input type="hidden" name="lev" value="<%=request.getParameter("lev")%>">
  <div class="form-group">
    <label for="sub">제목</label>
    <input type="text" class="form-control" name="sub" id="sub" placeholder="제목없음">
  </div>
  <div class="form-group">
    <label for="id">글쓴이</label>
    <input type="text" class="form-control" name="id" id="id" placeholder="작성자">
  </div>
  <div class="form-group">
    <textarea class="form-control" rows="5" name="content"></textarea>
  </div>
  <button type="submit" class="btn btn-default">Submit</button>
  <button type="reset" class="btn btn-default">Reset</button>
</form>
<jsp:include page="../template/footer.jsp"></jsp:include>
</body>
</html>












