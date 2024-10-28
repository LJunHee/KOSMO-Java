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

	String sql = "delete from stu01 where num="+num;
	Connection conn = null;
	Statement stmt = null;
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "scott";
	String password = "tiger";
	try{
		Class.forName(driver);
		conn = DriverManager.getConnection(url,user,password);
		stmt = conn.createStatement();
		stmt.executeUpdate(sql);
		
	}finally{
		if(stmt!=null) stmt.close();
		if(conn!=null) conn.close();
		
	}
	
	response.sendRedirect("list.jsp");
	%>
</body>
</html>