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
	<a href="./">list</a>
	<a href="./add">add</a>
	<a href="./login">login</a>
	<a href="./logout">logout(${sessionScope.user })</a>
</nav>

	<table>
		<thead>
			<tr>
				<th>글번호</th>
				<th>이름</th>
				<th>download</th>
				<th>download2</th>
				<th>download3</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list }" var="bean">
				<tr>
					<td>${bean.num }</td>
					<td>${bean.name }</td>
					<td>
						<c:if test="${bean.file ne null }">
							<a href="resources/${bean.path}">${bean.file }</a>
						</c:if>
					</td>
					<td>
						<c:if test="${bean.file ne null }">
							<a href="download?o=${bean.file}&f=${bean.path}">download</a>
						</c:if>
					</td>
					<td>
						<c:if test="${bean.file ne null }">
							<a href="${bean.file}/${bean.path}">download</a>
						</c:if>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="add">입력</a>
</body>
</html>




