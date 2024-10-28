<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href ="../css/frame.css">
<style type="text/css">
#content {}

#content>h1{
	margin-top : 50px;
	text-align : center;
}

#content>table{
	width: 80%;
	margin : 50px auto;
}

#content>table,th,td {
	border-collapse: collapse;
	border: 1px solid gray;	
}

#content>table th:first-child {
	width : 80px;
}

#content>table th:first-child+th+th,
#content>table th:last-child {
	width : 100px;
}

#content>table td:first-child,
#content>table td:first-child+td+td,
#content>table td:last-child {
	text-align : center;
}

#content>table td>a {
	display:block;
	height : 40px;
	line-height : 40px;
	text-decoration : none;
	color : #333333	;
}

#content>table td:first-child+td {
	padding-left: 20px;
}

#content>table+p>a{
	background-color: #2E8B57;
	display:block;
	color:white;
	width: 80%;
	height : 50px;
	text-align : center;
	line-height : 50px;
	margin : 10px auto;
	border-radius : 10px;
	text-decoration : none;
}

</style>
<script type="text/javascript"></script>
</head>
<body>
	<div>
		<div class="header">
			<h1>인제대학교</h1>

			<div>
				<form action="login/">
					<input type="text" id="" name = "id" />
					<input type="text" pw="" name = "pw" />
					<button type="submit">login</button>
					<button type="button">join</button>
				</form>
			</div>
		</div>
		<div id="menu">
			<ul>
				<li><a href="../">home</a></li>
				<li><a href="../intro.jsp">intro</a></li>
				<li><a href="../bbs/">bbs</a></li>
				<li><a href="../login/">login</a></li>
			</ul>
		</div>
		<div id="content">
		<!-- content begin -->
			<h1>게시판</h1>
			<table>
				<thead>
					<tr>
						<th>글번호</th>
						<th>제목</th>
						<th>글쓴이</th>
						<th>날짜</th>
					</tr>
				</thead>
				<tbody>
				<%@ page import = "java.sql.*,com.inje.OracleDB"%>
				<%
				String sql = "select num,sub,id,nalja from (select rownum as rn,num,sub,id,nalja from (select num,sub,id,nalja from bbs02 order by num desc)) where rn between 1 and 20";
				try(
					Connection conn = OracleDB.getConnection();
					Statement stmt = conn.createStatement();
					ResultSet rs = stmt.executeQuery(sql);
					){
					while(rs.next()){
				 %>
					<tr>
						<td><a href = "#"><%=rs.getInt(1) %></a></td>
						<td><a href = "detail.jsp?num=<%=rs.getInt(1) %>"><%=rs.getString(2) %></a></td>
						<td><a href = ""><%=rs.getString(3) %></a></td>
						<td><a href = ""><%=rs.getDate(4) %></a></td>
					</tr>
					<% }
					} finally {
						
					}
					%>
				</tbody>
			</table>
			<p><a href="add.jsp">입력</a></p>
		<!-- content end -->
		</div>
		<div id="footer">
			<p>김해캠퍼스 (50834) 경남 김해시 인제로 197</p>
			<p>Copyright&copy; 1996-2022 INJE University. All rights
				reserved.</p>
		</div>
	</div>
</body>
</html>