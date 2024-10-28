<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="bean" class="com.bbs.model.BbsBean"></jsp:useBean>
<jsp:setProperty property="*" name="bean"/>
	<%@ page import="java.sql.*,com.bbs.util.*" %>
	<%
	String sql="update bbs03 set sub='"+bean.getSub()+"',id='"+bean.getId()
	+"',content='"+bean.getContent()+"',nalja=sysdate where num="+bean.getNum();
	try(
		Connection conn=OracleDB.getConnection();
		Statement stmt=conn.createStatement();
		){
		stmt.executeUpdate(sql);
	}
	response.sendRedirect("list.jsp");
	%>
</body>
</html>




