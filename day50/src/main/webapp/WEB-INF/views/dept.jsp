<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file = "template/menu.jspf" %>
<div class = "container">
	<div class = "jumbotron">
		<h2>dept page</h2>
	</div>
	<table>
		<thead>
			<tr>
				<th>deptno</th>
				<th>dname</th>
				<th>loc</th>
			</tr>
		</thead>
		<tbody>
		</tbody>
	</table>
	<p><a href = "add">입력</a></p>
</div>
<script type="text/javascript">
var arr = ${list};
var table = document.querySelector('table');
var tbody = table.querySelector('tbody');
tbody.innerHTML=arr.map(
		ele=>'<tr><td><a href="'+ele.deptno+'">'+ele.deptno
		+'</a></td><td>'+ele.dname
		+'</td><td>'+ele.loc
		+'</td><tr>'
		).reduce((a,b)=>a+b);
</script>
</body>
</html>