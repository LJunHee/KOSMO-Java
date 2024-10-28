<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<% String path = ".."; %>
<%@ include file = "../template/head.jspf" %>
<script type = "text/javascript">
$(function(){
	$('#content form').submit(function(e){
		$(e.target).find('input').each(function(idx,ele){
			if($(ele).val().trim==''){
				e.preventDefault();
			}
		});
	});
});
</script>
</head>
<body>
<%@ include file = "../template/menu.jspf" %>
<h2 class= "text-center">입력 페이지</h2>
<form class="form-horizontal" action="insert.jsp" method="post">
  <div class="form-group">
    <label for="sub" class="col-sm-2 control-label">제목</label>
    <div class="col-sm-10">
      <input class="form-control" name="sub" id="sub" placeholder="제목">
    </div>
  </div>
  <div class="form-group">
    <label for="id" class="col-sm-2 control-label">글쓴이</label>
    <div class="col-sm-10">
      <input class="form-control" name="id" id="id" placeholder="글쓴이">
    </div>
  </div>
  <div class="form-group">
    <label class="col-sm-2 control-label"></label>
    <div class="col-sm-10">
      <textarea class="form-control" name="content" rows="6"></textarea>
    </div>
  </div>
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="btn btn-primary">입력</button>
      <button type="reset" class="btn btn-default">취소</button>
      <button type="button" class="btn btn-default" onclick="history.back();">뒤로</button>
    </div>
  </div>
</form>
<%@ include file = "../template/footer.jspf" %>

</body>
</html>