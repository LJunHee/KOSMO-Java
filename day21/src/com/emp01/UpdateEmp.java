package com.emp01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

import oracle.jdbc.driver.OracleDriver;

public class UpdateEmp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("사번 > ");
		String input1 = sc.nextLine();
		System.out.print("이름 > ");
		String input2 = sc.nextLine();
		System.out.print("금액 > ");
		String input3 = sc.nextLine();
		
		String sql = "update emp01 set name='"+input2+"',pay="+input3+ "where sabun="+input1;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Properties props = new Properties();
		props.setProperty("user", "scott");
		props.setProperty("password", "tiger");
		
		new OracleDriver();
		Connection conn = null;
		Statement stmt = null;
		try {
			System.out.println(sql);
			conn = DriverManager.getConnection(url,props);
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);
			
			if(result>0) System.out.println("성공");
			else System.out.println("실패");
			
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
