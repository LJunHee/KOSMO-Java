<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%@ page import = "java.sql.*, java.net.*" %>
<%
String sub = request.getParameter("sub");
String id = request.getParameter("id");
String content = request.getParameter("content");
if(id.isEmpty()){
	// server.xml -> URIEncoding="EUC-KR" 
	sub = URLEncoder.encode(sub,"EUC-KR");
	content = URLEncoder.encode(content,"EUC-KR");
	response.sendRedirect("add.jsp?sub="+sub+"&content="+content);
	return;
}
String sql = "select max(num) from bbs01";

String driver = "oracle.jdbc.driver.OracleDriver";
String url = "jdbc:oracle:thin:@localhost:1521:xe";
String user = "scott";
String password = "tiger";

Connection conn = null;
Statement stmt = null;
ResultSet rs = null;
int maxNum = 0;
try{
	conn = DriverManager.getConnection(url,user,password);
	stmt = conn.createStatement();
	rs = stmt.executeQuery(sql);
	if(rs.next())
		maxNum = rs.getInt(1);
} finally {
	if(rs!=null) rs.close();
	if(stmt!=null) stmt.close();
}

sql = "insert into bbs01 (num,sub,id,nalja,content) values ("
				+(maxNum+1)+",'"+sub+"','"+id+"',sysdate,'"+content+"')";
try{
	stmt = conn.createStatement();
	stmt.executeUpdate(sql);
} finally {
	if(stmt!=null) stmt.close();
	if(conn!=null) conn.close();
}
response.sendRedirect("list.jsp");
%>
</body>
</html>