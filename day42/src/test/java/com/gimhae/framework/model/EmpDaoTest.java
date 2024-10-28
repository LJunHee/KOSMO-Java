package com.gimhae.framework.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.sql.SQLException;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.OrderWith;
import org.junit.runner.manipulation.Alphanumeric;

@OrderWith(Alphanumeric.class)
public class EmpDaoTest {
	EmpDto target;
	static EmpDao dao;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		dao=new EmpDao(true);
	}

	@Before
	public void setUp() throws Exception {
		target=new EmpDto(4,4444,"tester4",null);
//		dao=new EmpDao();
	}

	@Test
	public void test1PullList() throws SQLException {
		Object obj=dao.pullList();
		assertNotNull(obj);
		assertTrue(((List)obj).size()>0);
	}
	
	@Test
	public void test2GetList() throws SQLException {
		Object result=dao.getList(target.getEmpno());
		assertEquals(target, result);
	}
	
	@Test
	public void test3AddList() throws SQLException {
		assertSame(1, dao.addList(target));
	}

	@Test
	public void test4RmList() throws SQLException {
		assertSame(1, dao.rmList(target.getEmpno()));
	}
	
	@Test
	public void test5EditList() throws SQLException {
		target.setEname("test");
		target.setPay(4000);
		assertSame(1, dao.editList(target));
	}
}







