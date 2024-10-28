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
<jsp:setProperty property="sub" name="bean"/>
<jsp:setProperty property="id" name="bean"/>
<jsp:setProperty property="content" name="bean"/>
<%@ page import="java.sql.*,com.bbs.util.*" %>
<%

//insert into bbs03 (num,id,sub,content,nalja,ref) values (bbs03_seq.nextval,'tester','test5','test',sysdate,bbs03_seq.currval);
String sql="insert into bbs03 (num,sub,id,content,nalja,ref) values (bbs03_seq.nextval,'"
			+bean.getSub()+"','"+bean.getId()+"','"+bean.getContent()+"',sysdate,bbs03_seq.currval)";
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








