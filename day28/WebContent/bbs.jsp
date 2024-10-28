{"bbs":[
<%@ page import="java.sql.*,com.inje.*" %>
<%
response.setHeader("Access-Control-Allow-Origin", "http://127.0.0.1:5500");

String num=request.getParameter("idx");
String sql="select num,sub,id,content,nalja from bbs02 where num="+num;
try(
		Connection conn=OracleDB.getConnection();
		Statement stmt=conn.createStatement();
		ResultSet rs=stmt.executeQuery(sql);
		){
	if(rs.next()){
%>
{"num":<%=rs.getInt(1) %>,"sub":"<%=rs.getString(2) %>","id":"<%=rs.getString(3) %>"
		,"content":"<%=rs.getString(4) %>","nalja":"<%=rs.getDate(5) %>"}
<%
	}
}
%>
]}

<%@ page language="java" contentType="application/json; charset=UTF-8"
    pageEncoding="UTF-8"%>