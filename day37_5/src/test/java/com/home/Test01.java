package com.home;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

public class Test01 {

	@Test
	public void test() {
		try {
			MySql.getConnection();
		} catch (ClassNotFoundException e) {
		fail("드라이버 파일 없음");
			e.printStackTrace();
		} catch (SQLException e) {
		fail("SQL 접속 실패");
			e.printStackTrace();
		}
	}

}
