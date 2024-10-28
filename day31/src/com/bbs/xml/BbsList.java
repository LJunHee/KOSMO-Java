package com.bbs.xml;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bbs.util.OracleDB;

public class BbsList extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("application/xml; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		out.println("<bbs>");
		String sql="select num,sub,id,nalja from ";
		sql+="(select rownum as rn, num,sub,id,nalja from ";
		sql+="(select num,sub,id,nalja from bbs02 order by num desc))";
		sql+=" where rn between 1 and 10";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		try {
			conn = OracleDB.getConnection();
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			while(rs.next()) {
				out.println("<row>");
				out.println("<num>"+rs.getInt("num")+"</num>");
				out.println("<sub>"+rs.getString("sub")+"</sub>");
				out.println("<id>"+rs.getString("id")+"</id>");
				out.println("<nalja>"+rs.getDate("nalja")+"</nalja>");
				out.println("</row>");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null)rs.close();
				if(stmt!=null)stmt.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		out.println("</bbs>");
		out.close();
	}

}













