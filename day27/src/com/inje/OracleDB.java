package com.inje;

import java.sql.*;

public class OracleDB {
	
	private static String driver = "oracle.jdbc.driver.OracleDriver";
	private static String url = "jbdc:oracle:thin:@localhost:1521:xe";
	private static String user = "scott";
	private static String password = "tiger";
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName(driver);
		return DriverManager.getConnection(url, user, password);
	}
}
