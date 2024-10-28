<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>BBS</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.4.1/dist/css/bootstrap.min.css" integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">

  </head>
  <body>
  	<div>
  		<div class = "bg-info">
  			<a href = "../">HOME</a>&nbsp;&nbsp;&nbsp;
  			<a href = "../intro.jsp">INTRO</a>&nbsp;&nbsp;&nbsp;
  			<a href = "../bbs/">BBS</a>&nbsp;&nbsp;&nbsp;
  			<a href = "../login/">LOGIN</a>
  		</div>
  		<div>
  			<!-- begin content -->
  			<center>
  			<h1>게시판</h1>
  			<table width = "80%">
  				<tr>
  					<th width = "80">NUM</th>
  					<th>SUBJECT</th>
  					<th width ="100">ID</th>
  					<th width ="100">DATE</th>
  				</tr>
  				<%@ page import = "java.sql.*, com.gimhae.OracleInfo" %>
  				<%
  				String p = request.getParameter("p");
  				if(p==null) p="1";
  				//1 1~10 -1 0~9
  				//2 11~20 -1 10~19
  				//3 21~30 -1 20~29
  				int begin = (Integer.parseInt(p)-1)*10+1;
  				String sql = "select * from (select rownum as rn, num,sub,id,nalja  ";
  				sql += ",(select count(*) from bbs02) from (select * from bbs02 order by num desc))";
  				sql += "where rn between "+begin+" and "+(begin+9);
  				Connection conn = null;
  				Statement stmt = null;
  				ResultSet rs = null;
  				int total = 0;
  				try{
					Class.forName(OracleInfo.driver);
					conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.99.100:1521:xe", OracleInfo.user, OracleInfo.password);
					stmt = conn.createStatement();
					rs = stmt.executeQuery(sql);
					while(rs.next()){ %>
  				<tr>
  					<td><%= rs.getInt(2)%></td>
  					<td><%= rs.getString(3)%></td>
  					<td><%= rs.getString(4)%></td>
  					<td><%= rs.getDate(5)%></td>
  				</tr>
  				<%
  				total = rs.getInt(6);
  				%>
  				<% }
  					}finally {
  						if(rs!=null) rs.close();
  						if(stmt!=null) stmt.close();
  						if(conn!=null) conn.close();
  					}
  					%>
  			</table>
  			<p>
  			<%
  			int limit2=(total-1)/10+1;
			int	limit = ((Integer.parseInt(p)-1)/10+1)*10;
			int begin2 = limit-10;
			if(begin2!=0){
  			%>
  			<a href="./?p=<%=begin2%>">[prev]</a>
  			<%
  			}
  			for (int i=begin2; i<limit; i++) {
  			%>
  				<a href="./?p=<%=i+1%>">[<%=i+1 %>]</a>
  			<%
  			}
  			if (limit2>limit) {
  			%>
  			<a href="./?p=<%=limit+1%>">[next]</a>
  			<%
  			}
  			%>
  			</p>
  			</center>
  			<!-- end content -->
  		</div>
  		<div>
  		<center>
  			<p>김해캠퍼스 (50834) 경남 김해시 인제로 197</p>
			<p>Copyright&copy; 1996-2022 INJE University. All rights reserved.</p>
  		</center>
  		</div>
  	</div>
  </body>

</body>
</html>