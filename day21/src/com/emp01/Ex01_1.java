package com.emp01;


import java.util.*;
import java.sql.*;


public class Ex01_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String title = "학생성적관리프로그램(ver 0.10.0)";
		String menu = "1.보기 2.입력 3.수정 4.삭제 0.종료 >";
		String input = null;

		while (true) {
			System.out.print(menu);
			input = sc.nextLine();
			if (input.equals("0")) break;
			if (input.equals("1")) {
				String driver = "oracle.jdbc.driver.OracleDriver";
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				String user = "scott";
				String password = "tiger";
				System.out.println("-----------------------------------------");
				System.out.println("학번\t이름\t국어\t영어\t수학");
				System.out.println("-----------------------------------------");
				Connection conn = null;
				Statement stmt = null;
				ResultSet rs = null;
				String sql = "select * from stu01 order by num asc";
				try {
					Class.forName(driver);
					conn = DriverManager.getConnection(url, user, password);
					stmt = conn.createStatement();
					rs = stmt.executeQuery(sql);
					while (rs.next()) {
						System.out.print(rs.getString(1) + "\t");
						System.out.print(rs.getString(2) + "\t");
						System.out.print(rs.getString(3) + "\t");
						System.out.print(rs.getString(4) + "\t");
						System.out.println(rs.getString(5));
					}
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					try {
						if (rs != null) rs.close();
						if (stmt != null) stmt.close();
						if (conn != null) conn.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}

			} ;
			if (input.equals("2")) {
				String driver = "oracle.jdbc.driver.OracleDriver";
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				String user = "scott";
				String password = "tiger";
				String sql = "insert into stu01 (num,name,kor,eng,math) values (";
				System.out.print("학번 >");
				sql += sc.nextLine() + ",'";
				System.out.print("이름 >");
				sql += sc.nextLine() + "',";
				System.out.print("국어 >");
				sql += sc.nextLine() + ",";
				System.out.print("영어 >");
				sql += sc.nextLine() + ",";
				System.out.print("수학 >");
				sql += sc.nextLine() + ")";
				Connection conn = null;
				Statement stmt = null;
				try {
					Class.forName(driver);
					conn = DriverManager.getConnection(url, user, password);
					stmt = conn.createStatement();
					stmt.execute(sql);
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					try {
						if (stmt != null) stmt.close();
						if (conn != null) conn.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}

			};
			if(input.equals("3")) {
				String driver = "oracle.jdbc.driver.OracleDriver";
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				String user = "scott";
				String password = "tiger";
				String sql1 = "update stu01 set kor=";
				String sql2 = "where num=";
				System.out.print("수정할 학번 >");
				sql2 += sc.nextLine();
				System.out.print("국어 >");
				sql1 += sc.nextLine() +",eng=";
				System.out.print("영어 >");
				sql1 += sc.nextLine() + ",math=";
				System.out.print("수학 >");
				sql1 += sc.nextLine() +sql2;
				
				Connection conn = null;
				Statement stmt = null;
				try {
					Class.forName(driver);
					conn = DriverManager.getConnection(url, user, password);
					stmt = conn.createStatement();
					stmt.execute(sql1);
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					try {
						if (stmt != null) stmt.close();
						if (conn != null) conn.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			};
			if(input.equals("4")) {
				String sql = "delete from stu01 where num=";
				System.out.print("삭제할 학번>");
				sql += sc.nextLine();
				String driver = "oracle.jdbc.driver.OracleDriver";
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				String user = "scott";
				String password = "tiger";
				Connection conn = null;
				Statement stmt = null;
				try {
					Class.forName(driver);
					conn = DriverManager.getConnection(url, user, password);
					stmt = conn.createStatement();
					stmt.execute(sql);
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					try {
						if (stmt != null) stmt.close();
						if (conn != null) conn.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
			
		}

	}

}
