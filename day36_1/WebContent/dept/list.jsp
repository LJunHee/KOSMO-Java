<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file = "../template/head.jspf" %>
<style type="text/css">
	#content table{}
	#content table tr>td:first-child,
	#content table tr>td:nth-child(4){
		width : 100px;
	}
</style>
</head>
<body>
<%@ include file = "../template/menu.jspf" %>
	<h2 class= "page-header" >dept List page</h2>
	<table class= "table">
		<thead>
			<tr>
				<th>deptno</th>
				<th>dname</th>
				<th>loc</th>
				<th>file</th>
			</tr>
		</thead>
		<tbody>
		<%@ page import = "java.util.*,com.dept.model.*" %>
		<%
		List<DeptDto> list = (List<DeptDto>)request.getAttribute("alist");
		for(DeptDto bean: list) {
		%>
			<tr>
				<td><%=bean.getDeptno() %></td>
				<td><%=bean.getDname() %></td>
				<td><%=bean.getLoc() %></td>
				<td><%if(bean.getOrdfile()!=null){ %>
				<a href = "/day36_1/upload/<%=bean.getNewfile() %>"  class="glyphicon glyphicon-file" aria-hidden="true"><%=bean.getOrdfile() %></a>
				<%} %></td>
			</tr>
		<% }%>
		</tbody>
	</table>
	<p><a href = "add.do" class = "btn btn-primary btn-block" role = "button">입력</a></p>
<%@ include file = "../template/footer.jspf" %>
</body>
</html>