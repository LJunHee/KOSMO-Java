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
<script type="text/javascript">
$(function(){
	$('.modal').modal('show');
});
</script>
</head>
<body>
<jsp:useBean id="bean" class="com.bbs.model.BbsBean"></jsp:useBean>
<jsp:setProperty property="num" name="bean"/>
<%@ page import="java.sql.*,com.bbs.util.*" %>
<%
if(request.getMethod().equals("POST")){
	String sql="delete from bbs03 where num="+bean.getNum();
	try(
		Connection conn=OracleDB.getConnection();
		Statement stmt=conn.createStatement();
			){
		stmt.executeUpdate(sql);
	}
	response.sendRedirect("list.jsp");
}
%>
<jsp:include page="../template/header.jsp"></jsp:include>
<jsp:include page="../template/menu.jsp">
	<jsp:param value=".." name="path"/>
</jsp:include>
<div class="modal fade" tabindex="-1" role="dialog">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title">경고</h4>
      </div>
      <div class="modal-body">
        <H3>잘못된 접근입니다</H3>
        <p>다시 확인하고 접속바랍니다.</p>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-primary" onclick="location.replace('list.jsp');">리스트로 돌아가기</button>
      </div>
    </div><!-- /.modal-content -->
  </div><!-- /.modal-dialog -->
</div><!-- /.modal -->
<jsp:include page="../template/footer.jsp"></jsp:include>
</body>
</html>









