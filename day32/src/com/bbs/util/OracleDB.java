package com.bbs.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import oracle.jdbc.driver.OracleDriver;

public class OracleDB {
	private static Connection conn;
	private static String driver=OracleDriver.class.getName();
	private static String url="jdbc:oracle:thin:@localhost:1521:xe";
	private static String user="scott";
	private static String password="tiger";
	
	private OracleDB() {}
	
	public static Connection getConnection() throws SQLException {
		if(conn==null || conn.isClosed()) {
			try {
				Class.forName(driver);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			conn=DriverManager.getConnection(url, user, password);
		}
		return conn;
	}
}