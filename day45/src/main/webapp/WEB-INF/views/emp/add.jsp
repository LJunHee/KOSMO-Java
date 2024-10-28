<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="../templates/head.jspf" %>
</head>
<body>
<c:forEach items="${errs.allErrors}" var="err" varStatus="status">
<c:if test="${status.index!=0 }">
<div class="alert alert-danger alert-dismissible" role="alert">
  <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
  <strong>ERROR!</strong>${err.defaultMessage }<br>
</div>
</c:if>
</c:forEach>

<%@ include file="../templates/menu.jspf" %>
<h2 class="page-header">입력 페이지</h2>
<form action="insert.do" method="post">
	<div class="form-group">
		<input type="text" class="form-control" name="ename" placeholder="ename" />
	</div>
	<div class="form-group">
		<input type="text" class="form-control" name="pay" placeholder="pay" />
	</div>
	<div class="form-group">
		<div class="btn-group btn-group-justified" role="group" aria-label="...">
			<div class="btn-group" role="group">
			<input type="submit" class="btn btn-primary" value="입력" />
			</div>
			<div class="btn-group" role="group">
			<input type="reset" class="btn btn-default" value="취소" />
			</div>
		</div>
	</div>
</form>
<%@ include file="../templates/footer.jspf" %>
</body>
</html>