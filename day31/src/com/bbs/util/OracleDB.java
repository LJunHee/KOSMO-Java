package com.bbs.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import oracle.jdbc.driver.OracleDriver;

public class OracleDB {
	private static Connection conn;
	private static String url="jdbc:oracle:thin:@localhost:1521:orcl";
	private static String user="scott";
	private static String password="tiger";
	private OracleDB() {
	}
	
	public static Connection getConnection() throws SQLException {
		try {
			if(conn==null || conn.isClosed()) {
					Class.forName(OracleDriver.class.getName());
					conn=DriverManager.getConnection(url, user, password);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return conn;
	}
}