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
<%@ page import="java.sql.*, com.bbs.util.*" %>
<%
if(bean.getLev()==0){
	String sql="insert into bbs03 (num,id,sub,content,nalja,ref,seq,lev) values (bbs03_seq.nextval,'"
		+bean.getId()+"','"+bean.getSub()+"','"+bean.getContent()+"',sysdate,"+bean.getRef()
		+",(select max(seq)+1 from bbs03 where ref="+bean.getRef()+"),"+bean.getLev()+"+1)";
	
	try(
			Connection conn=OracleDB.getConnection();
			Statement stmt=conn.createStatement();
			){
		stmt.executeUpdate(sql);
	}
}else{
	Connection conn=null;
	Statement stmt=null;
	try{
		conn=OracleDB.getConnection();
		conn.setAutoCommit(false);
		stmt=conn.createStatement();
	String sql="update bbs03 set seq=seq+1 where ref="+bean.getRef()+" and seq>"+bean.getSeq();
		stmt.executeUpdate(sql);
		if(stmt!=null)stmt.close();
		stmt=conn.createStatement();		
	sql="insert into bbs03 (num,id,sub,content,nalja,ref,seq,lev) values (bbs03_seq.nextval,'"
			+bean.getId()+"','"+bean.getSub()+"','"+bean.getContent()+"',sysdate,"+bean.getRef()
			+","+(bean.getSeq()+1)+","+(bean.getLev()+1)+")";
		stmt.executeUpdate(sql);		
		if(stmt!=null)stmt.close();
		conn.commit();
	}catch(SQLException e){
		conn.rollback();
	}finally{
		conn.setAutoCommit(true);
		if(conn!=null)conn.close();
	}
}
response.sendRedirect("list.jsp");
%>
</body>
</html>





















