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
<jsp:useBean id="bean" class="com.bbs.model.BbsBean"></jsp:useBean>
<jsp:setProperty property="*" name="bean"/>

	<h2 class="text-center">수정 페이지</h2>
	<form action="update.jsp">
		<input type="hidden" name="num" value='<jsp:getProperty property="num" name="bean"/>'> 
	  <div class="form-group">
	    <label for="sub">제목</label>
	    <input type="text" class="form-control" name="sub" id="sub" value='<jsp:getProperty property="sub" name="bean"/>'>
	  </div>
	  <div class="form-group">
	    <label for="id">글쓴이</label>
	    <input type="text" class="form-control" name="id" id="id" value='<jsp:getProperty property="id" name="bean"/>'>
	  </div>
	  <div class="form-group">
	    <textarea class="form-control" rows="5" name="content"><jsp:getProperty property="content" name="bean"/></textarea>
	  </div>
	  <button class="btn btn-default">수정</button>
	  <button type="reset" class="btn btn-default">취소</button>
	  <button type="button" class="btn btn-default" onclick="history.back();">뒤로</button>
	</form>	
<jsp:include page="../template/footer.jsp"></jsp:include>
</body>
</html>















