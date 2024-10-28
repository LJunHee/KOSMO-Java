package com.bbs.xml;

import java.io.IOException;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bbs.util.OracleDB;

public class BbsEdit extends HttpServlet{
	//bbsEdit.xml
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		int num=Integer.parseInt(req.getParameter("num"));
		String id=req.getParameter("id");
		String sub=req.getParameter("sub");
		String content=req.getParameter("content");
		
		String sql="update bbs02 set id='"+id+"', sub='"+sub
					+"', content='"+content+"', nalja=sysdate where num="+num;
		
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











