<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<html>
<head>
	<meta charset = "utf-8">
	<title>Home</title>
</head>
<body>
	<h2>LIST PAGE</h2>
	<table class = "table">
		<thead>
			<tr>
				<th>deptno</th>
				<th>dname</th>
				<th>loc</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items ="${list }" var="bean">
			<tr>
				<td><a href="${bean.deptno }">${bean.deptno }</a></td>
				<td><a href="${bean.deptno }">${bean.dname }</a></td>
				<td><a href="${bean.deptno }">${bean.loc }</a></td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>
