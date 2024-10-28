<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<nav>
		<a href="/index.do">home</a>
		<a href="/emp/index.do">emp</a>
	</nav>
	<div class="container">
		<div>
			<h2>리스트페이지</h2>
			<table class="table">
				<thead>
					<tr>
						<th>사번</th>
						<th>이름</th>
						<th>금액</th>
						<th>날짜</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${list }" var="bean">
					<tr>
						<td><a href="detail.do?idx=${bean.empno }">${bean.empno }</a></td>
						<td><a href="detail.do?idx=${bean.empno }">${bean.ename }</a></td>
						<td><a href="detail.do?idx=${bean.empno }">${bean.pay }</a></td>
						<td><a href="detail.do?idx=${bean.empno }">${bean.hiredate }</a></td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
			<p><a href = "add.do">입력</a></p>
		</div>
	</div>
</body>
</html>