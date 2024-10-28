package com.emp01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DeleteEmp {

	public static void main(String[] args) {
		String sql = "delete from emp01 where sabun=1111";
		String url = "jdbc:oracle:thin:scott/tiger@localhost:1521:xe";
		Connection conn = null;
		Statement stmt = null;
//		Properties props = new Properties();
//		props.setProperty("user", "scott");
//		props.setProperty("password", "tiger");
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url);
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);
			if(result >0) System.out.println("성공");
			else System.out.println("실패");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(stmt!=null) stmt.close();
				if(conn!=null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
