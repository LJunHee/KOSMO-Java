<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file = "../template/menu.jspf" %>
	<h2 class="page-header">list page</h2>
	<table>
		<thead>
			<tr>
				<th>사번</th>
				<th>이름</th>
				<th>금액</th>
				<th>날짜</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${alist }" var = "bean">
			<c:url value="detail.do" var = "detail">
				<c:param name="empno" value = "${bean.empno }"></c:param>
			</c:url>
			<tr>
				<td><a href = "${detail }">${bean.empno }</a></td>
				<td><a href = "${detail }">${bean.ename }</a></td>
				<td><a href = "${detail }">${bean.pay }</a></td>
				<td><a href = "${detail }">${bean.hiredate }</a></td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	<p><a href = "add.do">입력</a></p>
<%@ include file = "../template/footer.jspf" %>
</body>
</html>