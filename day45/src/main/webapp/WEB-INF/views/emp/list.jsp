<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file = "../templates/head.jspf" %>
</head>
<body>
<%@ include file = "../templates/menu.jspf" %>
<h2 class = "page-header">목록</h2>
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
		<c:forEach items = "${list }" var = "bean">
			<tr>
				<td><a href = "detail.do?empno=${bean.empno }">${bean.empno }</a></td>
				<td><a href = "detail.do?empno=${bean.empno }">${bean.ename }</a></td>
				<td><a href = "detail.do?empno=${bean.empno }">${bean.pay }</a></td>
				<td><a href = "detail.do?empno=${bean.empno }">${bean.hiredate }</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<p><a href="add.do" class = "btn btn-primary btn-block" role="button">입력</a></p>
<%@ include file = "../templates/footer.jspf" %>
</body>
</html>