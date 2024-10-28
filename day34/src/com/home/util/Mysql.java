package com.home.util;


import java.sql.*;
import com.mysql.cj.jdbc.Driver;

public class Mysql {
	private static Connection conn;
	private static String driver = Driver.class.getName();
	private static String url = "jdbc:mysql://localhost:3306/xe";
	private static String user = "scott";
	private static String password = "tiger";
	
	private Mysql() {
		
	}
	
	public static Connection getConnection() {
		try {
			if(conn==null||conn.isClosed()) {
				Class.forName(driver);
				conn = DriverManager.getConnection(url, user, password);
			}
		} catch (SQLException e) {
			System.out.println("url or id/pw 확인...");
		} catch (ClassNotFoundException e) {
			System.out.println("jar파일 누락...");
		}
		
		return conn;
	}
}
