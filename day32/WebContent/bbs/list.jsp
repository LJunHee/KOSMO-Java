<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<jsp:include page="../template/head.jsp">
	<jsp:param value=".." name="path"/>
</jsp:include>
<style type="text/css">
	table td:nth-child(1){
		width: 80px;
	}
	table td:nth-child(3),
	table td:nth-child(4){
		width: 100px;
	}
	table td>a{
		display: block;
	}
</style>
</head>
<body>
<jsp:include page="../template/header.jsp"></jsp:include>
<jsp:include page="../template/menu.jsp">
	<jsp:param value=".." name="path"/>
</jsp:include>
<h1 class="text-center">list page</h1>
<p class="text-right"><a href="add.jsp" class="btn btn-primary" role="button">입력</a></p>
<table class="table">
	<thead>
		<tr>
			<th>글번호</th>
			<th>제목</th>
			<th>글쓴이</th>
			<th>날짜</th>
		</tr>
	</thead>
	<tbody>
		<%@ page import="java.sql.*,com.bbs.util.OracleDB" %>
		<%
		String sql="select * from bbs03 order by ref desc, seq asc";
		try(
				Connection conn=OracleDB.getConnection();
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(sql);
				){
		while(rs.next()){ 
		%>
		<tr>
			<td><a href="detail.jsp?num=<%=rs.getInt("num") %>"><%=rs.getInt("num") %></a></td>
			<td><a href="detail.jsp?num=<%=rs.getInt("num") %>"><%
			for(int i=0; i<rs.getInt("lev");i++){
				out.print("&nbsp;&nbsp;&nbsp;&nbsp;");
			}
			if(rs.getInt("lev")!=0) out.print("└ ");
			out.print(rs.getString("sub")); 
			%></a></td>
			<td><a href="detail.jsp?num=<%=rs.getInt("num") %>"><%=rs.getString("id") %></a></td>
			<td><a href="detail.jsp?num=<%=rs.getInt("num") %>"><%=rs.getTimestamp("nalja") %></a></td>
		</tr>
		<%}
		} %>
	</tbody>
</table>

<jsp:include page="../template/footer.jsp"></jsp:include>
</body>
</html>







