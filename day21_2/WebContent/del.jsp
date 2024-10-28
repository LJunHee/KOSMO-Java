<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table width ="800" align = "center">
		<tr>
			<td colspan="2" align = "center">
			<h1>학생성적관리프로그램(ver 0.11.0)</h1>
			</td>
		</tr>
		<tr>
			<td valign = "top" bgcolor = "#999999" width="150" align = "center">
			<br>
				<a href ="list.jsp" style = "color:red;">보 기</a><br><br><br>
				<a href ="add.jsp" style = "color:red;">입 력</a><br><br><br>
				<a href ="edit.jsp" style = "color:red;">수 정</a><br><br><br>
				<a href ="del.jsp" style = "color:red;"	>삭 제</a>
			</td>
			<td align = "center" valign ="top">
				<!-- begin content -->
				<h2>삭제할 학생</h2>
				<form action="delete.jsp">
					<select name = "num">
					<%@ page import = "java.sql.*" %>
					<% 
					String sql = "select num from stu01 order by num";
					String driver = "oracle.jdbc.driver.OracleDriver";
					String url = "jdbc:oracle:thin:@localhost:1521:xe";
					String user = "scott";
					String password = "tiger";
					Connection conn = null;
					Statement stmt = null;
					ResultSet rs = null;
					try{
						conn = DriverManager.getConnection(url,user,password);
						stmt = conn.createStatement();
						rs = stmt.executeQuery(sql);
						while(rs.next()) {
					%>
						<option value = "<%= rs.getString(1)%>"><%= rs.getString(1)%> 학번</option>
					<%
						}
					} finally {
						if(rs!=null) rs.close();
						if(stmt!=null) stmt.close();
						if(conn!=null) conn.close();
					}
					%>
					</select>
					<input type = "submit" value = "삭 제">
				</form>
				<!-- end content -->
			</td>
		</tr>
		<tr>
			<td colspan="2" align = "center" bgcolor="gray">
			<p>김해캠퍼스 (50834) 경남 김해시 인제로 197</p>
			<p>Copyright &copy; 2024 INJE University. All rights reserved.</p>
			</td>
		</tr>
	</table>
</body>
</html>