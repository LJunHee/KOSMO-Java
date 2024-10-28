package com.inje;

import java.sql.*;

public class OracleDB {
	
	private static String driver = "oracle.jdbc.driver.OracleDriver";
	private static String url = "jbdc:oracle:thin:@localhost:1521:xe";
	private static String user = "scott";
	private static String password = "tiger";
	
	private OracleDB() {}
	
	//디자인 패턴 - 싱글톤 패턴 - 강제로 객체를 하나만
	private static Connection conn;
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		if(conn ==null) {
			Class.forName(driver);
			conn=DriverManager.getConnection(url, user, password);
		}
		if(conn.isClosed()) {
			Class.forName(driver);
			conn=DriverManager.getConnection(url, user, password);
			
		}
		return conn;
	}
}
