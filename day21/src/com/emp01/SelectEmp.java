package com.emp01;

import java.sql.*;

public class SelectEmp {

	public static void main(String[] args) {
		String sql = "select * from emp01";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";
		String user = "scott";
		String password = "tiger";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user,password);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql); //select는 executeQuery
			System.out.println("사번\t이름\t금액");
			System.out.println("---------------------");
			while(rs.next()) {
				String col1 = rs.getString(1);
				String col2 = rs.getString(2);
				String col3 = rs.getString(3);
				System.out.println(col1+ "\t"+ col2 +"\t"+ col3);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
				if(stmt!=null) stmt.close();
				if(conn!=null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
