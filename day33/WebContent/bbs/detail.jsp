<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<% String path = ".."; %>
<%@ include file = "../template/head.jspf" %>
<script type="text/javascript">
$(function(){
	$('#content form a').last().click(function(e){
		e.preventDefault();
		$('#popup').modal('show');
	$('#popup').find('button').last().one('click',function(){
		var param = $(e.target).attr('href').split('?')[1];
		$.post('delete.jsp',param,function(){
			location.href = './';
		});
		});		
	});
});
</script>
</head>
<body>
<%@ page import = "com.bbs.model.*" %>
<%
int num = Integer.parseInt(request.getParameter("num"));
BbsDao dao = new BbsDao();
dao.countUp(num);
BbsDto bean = dao.getOne(num);
%>
<%@ include file = "../template/menu.jspf" %>
<h2 class = "text-center">상세 페이지</h2>
<form class="form-horizontal" action="edit.jsp" method="post">
  <div class="form-group">
    <label for="sub" class="col-sm-2 control-label">제목</label>
    <div class="col-sm-10">
      <input class="form-control" name="sub" id="sub" value = "<%=bean.getSub()%>" readonly>
    </div>
  </div>
  <div class="form-group">
    <label for="id" class="col-sm-2 control-label">글쓴이</label>
    <div class="col-sm-10">
      <input class="form-control" name="id" id="id" value = "<%=bean.getId()%>" readonly>
    </div>
  </div>
  <div class="form-group">
    <label for="nalja" class="col-sm-2 control-label">날짜</label>
    <div class="col-sm-10">
      <input class="form-control" value = "<%=bean.getNalja()%>" readonly>
    </div>
  </div>
  <div class="form-group">
    <label for="cnt" class="col-sm-2 control-label">조회수</label>
    <div class="col-sm-10">
      <input class="form-control" value = "<%=bean.getCnt()%>" readonly>
    </div>
  </div>
  <div class="form-group">
    <label class="col-sm-2 control-label"></label>
    <div class="col-sm-10">
      <textarea class="form-control" name="content" rows="6" readonly><%=bean.getContent()%></textarea>
    </div>
  </div>
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
    	<a href = "edit.jsp?num=<%=bean.getNum() %>" class = "btn btn-default" role = "button">수정</a>
    	<a href = "delete.jsp?num=<%=bean.getNum() %>" class = "btn btn-danger" role = "button">삭제</a>
      	<button type="button" class="btn btn-default" onclick="history.back();">뒤로</button>
    </div>
  </div>
</form>
<%@ include file = "../template/footer.jspf" %>
<div id = "popup" class="modal fade" tabindex="-1" role="dialog">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title">확인</h4>
      </div>
      <div class="modal-body">
        <p>삭제 하시겠습니까?</p>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">취소</button>
        <button type="button" class="btn btn-primary" data-dismiss="modal">확인</button>
      </div>
    </div><!-- /.modal-content -->
  </div><!-- /.modal-dialog -->
</div><!-- /.modal -->
</body>
</html>