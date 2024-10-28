package com.bbs.xml;

import java.io.IOException;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bbs.util.OracleDB;

public class BbsAdd extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String sub=req.getParameter("sub");
		String id=req.getParameter("id");
		String content=req.getParameter("content");
		
		String sql="insert into bbs02 (num,sub,id,content,nalja) values (bbs02_seq.nextval,'"
					+sub+"','"+id+"','"+content+"',sysdate)";
		
		try(
			Connection conn=OracleDB.getConnection();
			Statement stmt=conn.createStatement();	
			){
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}







