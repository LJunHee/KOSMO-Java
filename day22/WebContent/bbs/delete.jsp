<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%@ page import = "java.sql.*" %>
<%
String num = request.getParameter("num");
String sql = "delete from bbs01 where num = " + num;
String driver = "oracle.jdbc.driver.OracleDriver";
String url = "jdbc:oracle:thin:@localhost:1521:xe";
String user = "scott";
String password= "tiger";

Class.forName(driver);
try(
	Connection conn = DriverManager.getConnection(url, user, password);
	Statement stmt = conn.createStatement();
	) {
	stmt.executeUpdate(sql);
}

response.sendRedirect("list.jsp");
%>
</body>
</html>