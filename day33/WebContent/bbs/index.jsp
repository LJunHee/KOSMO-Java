<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<% String path = ".."; %>
<%@ include file = "../template/head.jspf" %>
<style type = "text/css">
	table tr>td:first-child{
		width : 80px;
		text-align : center;
	}
	table tr>td:nth-child(3),
	table tr>td:last-child{
		width : 100px;
	}
	
</style>
</head>
<body>
<%@ include file = "../template/menu.jspf" %>
<h1 class="text-center">게시판</h1>
<table class = "table table-striped">
	<thead>
		<tr>
			<th>글번호</th>
			<th>제목</th>
			<th>글쓴이</th>
			<th>조회수</th>
		</tr>
	</thead>
	<tbody>
	<%@ page import = "java.util.*, com.bbs.model.*" %>
	<%
	BbsDao dao = new BbsDao();
	List<BbsDto> list = dao.getList();
	for(BbsDto bean : list) { //jdk 1.5~, list.iterator()
	%>
		<tr>
			<td><a href = "detail.jsp?num=<%=bean.getNum() %>"><%=bean.getNum() %></a></td>
			<td><a href = "detail.jsp?num=<%=bean.getNum() %>"><%=bean.getSub() %></a></td>
			<td><a href = "detail.jsp?num=<%=bean.getNum() %>"><%=bean.getId() %></a></td>
			<td><a href = "detail.jsp?num=<%=bean.getNum() %>"><%=bean.getCnt() %></a></td>
		</tr>
	<%
	}
	%>
	</tbody>
</table>
<p><a href ="add.jsp" class = "btn btn-primary btn-block" role = "button">입력</a></p>
<%@ include file = "../template/footer.jspf" %>
</body>
</html>