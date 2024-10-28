<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="login" class = "com.user.model.UserBean" scope="session"></jsp:useBean>
<jsp:setProperty property="*" name="login"/>

<%@ page import = "java.sql.*, com.bbs.util.*" %>
<%
	String sql = "select name from user03 where id='"+login.getId()+"' and pw='"+login.getPw()+"'";

	try(
		Connection conn = OracleDB.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		) {
		if(rs.next()) {
			if(rs.getString("name")!=null) {
				login.setResult(true);
				login.setName(rs.getString("name"));
				}
			}
		}
		response.sendRedirect("../");
%>
</body>
</html>