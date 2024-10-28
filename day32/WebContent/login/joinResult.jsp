<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body> 
<jsp:useBean id="bean" class="com.user.model.UserBean"></jsp:useBean>
<jsp:setProperty property="*" name="bean"/>
	<%@ page import="java.sql.*,com.bbs.util.*" %>
	<%
	//request.setCharacterEncoding("utf-8");
	String sql = "insert into user03 (idx,id,pw,name) values ((select nvl(max(idx)+1,1) from user03),'"
				+bean.getId()+"','"+bean.getPw()+"','"+bean.getName()+"')";
	try(
		Connection conn = OracleDB.getConnection();
		Statement stmt = conn.createStatement();
		) {
		stmt.executeUpdate(sql);
	}
	response.sendRedirect("./");
	%>
</body>
</html>