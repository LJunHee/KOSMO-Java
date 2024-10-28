<?xml version="1.0" encoding="UTF-8"?>
<rows>
<%@ page import="java.sql.*,com.inje.OracleDB" %>
<%
response.setHeader("Access-Control-Allow-Origin", "http://127.0.0.1:5500");

	String sql="select num,sub,id,nalja from (select rownum as rn,"
				+" num,sub,id,nalja from (select num,sub,id,nalja"
				+" from bbs02 order by num desc)) where rn between 1 and 10";
	try(
			Connection conn=OracleDB.getConnection();
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery(sql);
			){
		while(rs.next()){
%>
	<row>
		<num><%=rs.getInt(1) %></num>
		<sub><%=rs.getString(2) %></sub>
		<id><%=rs.getString(3) %></id>
		<nalja><%=rs.getDate(4) %></nalja>
	</row>
<%
		}
	} 
%>
</rows>

<%@ page language="java" contentType="application/xml; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    
    
    
    
    
    
    
    