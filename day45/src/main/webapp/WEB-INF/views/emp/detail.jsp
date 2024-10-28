<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="../templates/head.jspf" %>
<script type="text/javascript">
	$(function(){
		$('form input:button').click(e=>$('form+form').submit());
	});
</script>
</head>
<body>

<%@ include file="../templates/menu.jspf" %>
<h2 class="page-header">상세 페이지</h2>
<form action="update.do" method="post">
	<div class="form-group">
		<input type="text" class="form-control" name="empno" value="${bean.empno }" />
	</div>
	<div class="form-group">
		<input type="text" class="form-control" name="ename" value="${bean.ename }" />
	</div>
	<div class="form-group">
		<input type="text" class="form-control" name="hiredate" value="${bean.hiredate }" />
	</div>
	<div class="form-group">
		<input type="text" class="form-control" name="pay" value="${bean.pay }" />
	</div>
	<div class="form-group">
		<div class="btn-group btn-group-justified" role="group" aria-label="...">
			<div class="btn-group" role="group">
			<input type="submit" class="btn btn-primary" value="수정" />
			</div>
			<div class="btn-group" role="group">
			<input type="button" class="btn btn-danger" value="삭제" />
			</div>
			<div class="btn-group" role="group">
			<input type="reset" class="btn btn-default" value="취소" />
			</div>
		</div>
	</div>
</form>
<form action = "delete.do" method = "post">
	<input type="hidden" name="empno" value="${bean.empno }" />
</form>
<%@ include file="../templates/footer.jspf" %>
</body>
</html>