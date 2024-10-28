<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="../templates/head.jspf" %>
<script type="text/javascript">
function deleteFunc(){
	var param=$('form').serialize();
	$.post('delete',param,data=>location.href="list");
}
</script>
</head>
<body>
<%@ include file="../templates/menu.jspf" %>
<h2 class="page-header text-center">상세 페이지</h2>
<form action="edit" method="get">
	<div class="form-group">
		<input name="empno" class="form-control" value="${bean.empno }" readonly/>
	</div>
	<div class="form-group">
		<input name="ename" class="form-control" value="${bean.ename }" readonly/>
	</div>
	<div class="form-group">
		<input name="pay" class="form-control" value="${bean.pay }" readonly/>
	</div>
	<div class="form-group">
		<input class="form-control" value="${bean.hiredate }" readonly/>
	</div>
	<div class="btn-group-vertical btn-block" role="group" aria-label="...">
		<div class="btn-group">
			<button class="btn btn-primary">수정</button>
		</div>
		<div class="btn-group">
			<button type="button" class="btn btn-danger" onclick="deleteFunc();">삭제</button>
		</div>
		<div class="btn-group">
			<button type="button" class="btn btn-default"onclick="history.back();">뒤로</button>
		</div>
	</div>
</form>
<%@ include file="../templates/footer.jspf" %>
</body>
</html>