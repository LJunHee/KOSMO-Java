package com.emp01;

import java.sql.SQLException;
import java.util.*;

import oracle.jdbc.driver.OracleDriver;

public class InsertEmp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("사번 > ");
		String input1 = sc.nextLine();
		System.out.print("이름 > ");
		String input2 = sc.nextLine();
		System.out.print("금액 > ");
		String input3 = sc.nextLine();
		
		String sql = "insert into emp01 values ("+input1+",'"+input2+"',"+input3+")";
		OracleDriver driver = new oracle.jdbc.driver.OracleDriver();
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Properties info = new Properties();
		info.put("user","scott");
		info.put("password","tiger");
		
		java.sql.Connection conn = null;
		java.sql.Statement stmt = null;
		
		try {
			System.out.println(sql);
			conn = java.sql.DriverManager.getConnection(url, info);
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("입력완료");
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
