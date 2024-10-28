package com.bbs.json;

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

public class BbsList extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("application/json;charset=utf-8");
		PrintWriter out=resp.getWriter();
		out.println("{\"bbs\":[");
		String sql="select num,sub,id,nalja from ";
		sql+="(select rownum as rn, num,sub,id,nalja from ";
		sql+="(select num,sub,id,nalja from bbs02 order by num desc))";
		sql+=" where rn between 1 and 10";
		try(
				Connection conn=OracleDB.getConnection();
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(sql);
				){
			boolean boo=true;
			while(rs.next()) {
				if(boo) {boo=false;}else {out.print(",");}
				out.print("{ \"num\":"+rs.getInt("num")+",");
				out.print("\"sub\":\""+rs.getString("sub")+"\",");
				out.print("\"id\":\""+rs.getString("id")+"\",");
				out.println("\"nalja\":\""+rs.getDate("nalja")+"\"}");
			}
		} catch (SQLException e) {
					e.printStackTrace();
				}
		out.println("]}");
		out.close();
	}
	
}











