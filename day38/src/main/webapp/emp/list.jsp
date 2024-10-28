<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file = "../template/head.jspf" %>
<script type="text/javascript">
$(function(){
	if(!<%=request.getParameter("success")%>)
			$('body>.alert').hide();
	
	
});
</script>
</head>
<body>
<div class="alert alert-info alert-dismissible" role="alert">
  <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
  <strong>알림!</strong>성공
</div>
<%@ include file = "../template/menu.jspf" %>
	<h2 class = "page-header text-center">리스트 페이지</h2>
	<table class = "table">
		<thead>
			<tr>
				<th>사번</th>
				<th>이름</th>
				<th>금액</th>
				<th>날짜</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items = "${alist }" var = "bean">
				<c:url value = "detail.do" var = "detail">
					<c:param name="empno" value = "${bean.empno }"/>
				</c:url>
				<tr>
					<td><a href="${detail }">${bean.empno }</a></td>
					<td><a href="${detail }">${bean.ename }</a></td>
					<td><a href="${detail }">
					<fmt:formatNumber value ="${bean.pay }" pattern = "￦###,###,###,###.00"/></a></td>
					<td><a href="${detail }">
					<fmt:formatDate value = "${bean.hiredate }" pattern = "yy/MM/dd"/>
					</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<p><a href = "add.do" class = "btn btn-primary btn-block" role = "button">입력</a></p>
<%@ include file = "../template/footer.jspf" %>
</body>
</html>