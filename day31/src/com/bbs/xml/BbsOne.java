package com.bbs.xml;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bbs.util.OracleDB;

public class BbsOne extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int num=Integer.parseInt(req.getParameter("num"));
		String sql="select num,sub,id,nalja,content from bbs02 where num="+num;
		resp.setContentType("application/xml;charset=utf-8");
		PrintWriter out=resp.getWriter();
		out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		out.println("<bbs>");
		try(
				Connection conn=OracleDB.getConnection();
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(sql);
				){
			if(rs.next()) {
				out.println("	<row>");
				out.println("		<num>"+rs.getInt("num")+"</num>");
				out.println("		<sub>"+rs.getString("sub")+"</sub>");
				out.println("		<id>"+rs.getString("id")+"</id>");
				out.println("		<nalja>"+rs.getDate("nalja")+"</nalja>");
				out.println("		<content>"+rs.getString("content")+"</content>");
				out.println("	</row>");
			}
		} catch (SQLException e) {
					e.printStackTrace();
		}
		out.println("</bbs>");
		out.close();
	}
}







