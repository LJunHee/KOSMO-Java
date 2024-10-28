package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Mysql {
	private static Connection conn;
	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost:3306/xe";
	private static String user = "scott";
	private static String password = "tiger";
	
	private Mysql() {
	}
	
	public static Connection getConnection() throws SQLException {
		if(conn ==null||conn.isClosed()) {
			try {
				Class.forName(driver);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			conn = DriverManager.getConnection(url, user, password);
		}
		return conn;
	}
}


