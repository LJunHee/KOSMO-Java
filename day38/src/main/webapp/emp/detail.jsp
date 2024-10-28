<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="../template/head.jspf" %>
<script type="text/javascript">
	$(function(){
		$('#content form a').last().click(function(e){
				if(confirm('삭제하시겠습니까?')){
					var url=$(e.target).attr('href').split('?')[0];
					var param=e.target.href.split('?')[1];
					$.post(url,param,function(){
						location.href='./';
					});
				}
				return false;
		});
	});
</script>
</head>
<body>
<%@ include file="../template/menu.jspf" %>
<h2 class="page-header text-center">상세 페이지</h2>
<form method="post">
	<div class="form-group">
		<label>사번</label><input name="empno" value="${bean.empno }" class="form-control" readonly/>
	</div>
	<div class="form-group">
		<label>이름</label><input name="ename" value="${bean.ename }" class="form-control" readonly/>
	</div>
	<div class="form-group">
		<label>금액</label><input name="pay" value="${bean.pay }" class="form-control" readonly/>
	</div>
	<div class="form-group">
		<label>날짜</label><input name="hiredate" value="${bean.hiredate }" class="form-control" readonly/>
	</div>
	<div class="form-group">
		<c:url var="edit" value="edit.do">
			<c:param name="empno" value="${bean.empno }"/>
		</c:url>
		<c:url var="del" value="delete.do">
			<c:param name="empno" value="${bean.empno }"/>
		</c:url>
		<a href="${edit }" class="btn btn-primary btn-block" role="button">수정</a>
		<a href="${del }" class="btn btn-danger btn-block" role="button">삭제</a>
		<button type="button" class="btn btn-default btn-block" onclick="history.back();">뒤로</button>
	</div>
</form>
<%@ include file="../template/footer.jspf" %>
</body>
</html>