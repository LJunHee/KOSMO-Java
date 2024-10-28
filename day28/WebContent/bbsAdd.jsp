<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>

<%@ page import="java.sql.*, com.inje.OracleDB"%>
<%
response.setHeader("Access-Control-Allow-Origin", "http://127.0.0.1:5500");

String sub=request.getParameter("sub");
String id=request.getParameter("id");
String content=request.getParameter("content");
String sql="insert into bbs02 (num,sub,id,content,nalja) values "
		+"(bbs02_seq.nextval,'"+sub+"','"+id+"','"+content+"',sysdate)";
	try(
			Connection conn=OracleDB.getConnection();
			Statement stmt=conn.createStatement();
			){
		stmt.executeUpdate(sql);
	}
%>







