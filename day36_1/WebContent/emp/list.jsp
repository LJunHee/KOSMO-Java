<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file = "../template/head.jspf" %>
</head>
<body>
<%@ include file = "../template/menu.jspf" %>
<h2 class = "page-header">emp list page</h2>
<table class = "table">
	<thead>
		<tr>
			<th>empno</th>
			<th>ename</th>
			<th>pay</th>
			<th>hiredate</th>
			<th>download</th>
		</tr>	
	</thead>
	<tbody>
	<%@ page import = "java.util.*,com.emp.model.*" %>
	<%
	List<EmpDto> list =(List<EmpDto>) request.getAttribute("alist");
	for(EmpDto bean : list){
	%>
		<tr>
			<td><a href = "#"><%=bean.getEmpno() %></a></td>
			<td><a href = "#"><%=bean.getEname() %></a></td>
			<td><a href = "#"><%=bean.getPay() %></a></td>
			<td><a href = "#"><%=bean.getHiredate() %></a></td>
			 <td><a href = "download.do?ord=<%=bean.getOrdfile() %>&file=<%=bean.getNewfile() %>"><%=bean.getOrdfile() %></a></td>
		</tr>
	<%} %>
	</tbody>
</table>
<p><a href = "add.do" class = "btn btn-primary btn-block">입력</a></p>
<%@ include file = "../template/footer.jspf" %>
</body>
</html>