package com.emp01;


import java.sql.*;
import java.util.*;


public class Ex01 {

	public static void main(String[] args) {
		/*
		 * 학생성적관리프로그램(ver 0.10.0)
		 * 1.보기 2.입력 3.수정 4.삭제 0.종료 >
		 */
		// DB연동
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";
		String user = "scott";
		String password = "tiger";

		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		String selectSql = "select stunum,name,kor,eng,math from reportcard order by stunum asc";

		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();

			// 성적정보 입력
			boolean run = true;
			String menu = "1.보기 2.입력 3.수정 4.삭제 0.종료 >";
			int input;
			System.out.println("학생성적관리프로그램(ver 0.10.0)");
			while (run) {
				System.out.print(menu);
				input = sc.nextInt();
				switch (input) {
				// 보기
				case 1:
					System.out.println("학번\t\t이름\t국어\t영어\t수학");
					System.out.println("---------------------------------------------");
					rs = stmt.executeQuery(selectSql);
					while (rs.next()) {
						String col1 = rs.getString(1);
						String col2 = rs.getString(2);
						String col3 = rs.getString(3);
						String col4 = rs.getString(4);
						String col5 = rs.getString(5);
						System.out
						    .println(col1 + "\t" + col2 + "\t" + col3 + "\t" + col4 + "\t" + col5);
					}
					break;

				// 입력
				case 2:
					System.out.print("학번 >");
					String stuNum = sc.next();
					System.out.print("이름 >");
					String name = sc.next();
					System.out.print("국어 >");
					String kor = sc.next();
					System.out.print("영어 >");
					String eng = sc.next();
					System.out.print("수학 >");
					String math = sc.next();

					String insertSql = "insert into reportcard values (" + stuNum + ",'" + name
					    + "'," + kor + "," + eng + "," + math + ")";
					System.out.println(insertSql);
					System.out.println("입력완료");
					stmt.executeUpdate(insertSql);
					break;

				// 수정
				case 3:
					System.out.print("수정할 학번 >");
					stuNum = sc.next();
					System.out.print("이름 >");
					name = sc.next();
					System.out.print("국어 >");
					kor = sc.next();
					System.out.print("영어 >");
					eng = sc.next();
					System.out.print("수학 >");
					math = sc.next();

					String updateSql = "update reportcard set name = '" + name + "',kor=" + kor
					    + ",eng=" + eng + ",math=" + math + " where stunum=" + stuNum;
					System.out.println(updateSql);
					System.out.println("수정완료");
					stmt.executeUpdate(updateSql);
					break;

				// 삭제
				case 4:
					System.out.print("삭제할 학번 >");
					stuNum = sc.next();
					String deleteSql = "delete from reportcard where stunum =" + stuNum;
					System.out.println("삭제완료");
					stmt.executeUpdate(deleteSql);
					break;

				// 종료
				case 0:
					System.out.println("종료");
					run = false;
					break;

				}
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

	}

}
