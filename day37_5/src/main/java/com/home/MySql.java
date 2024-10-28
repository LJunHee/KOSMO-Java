package com.home;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySql {
	private static Connection conn;
	
	private MySql() {
	}
	
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		if(conn==null||conn.isClosed()) {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/xe","scott","tiger");
		}
		return conn;
	}
}
