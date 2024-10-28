package com.gimhae.emp.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.OrderWith;
import org.junit.runners.MethodSorters;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmpDaoTest {
	static EmpDao<EmpVo> empDao;
	static ClassPathXmlApplicationContext context = null;
	EmpVo target;
	static int leng;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context=new ClassPathXmlApplicationContext("classpath:/applicationContext.xml");
		empDao=context.getBean(EmpDao.class);
	}

	@Before
	public void setUp() throws Exception {
		target=new EmpVo(81,7878,"test78",null);
	}

	@Test
	public void test1PullList() {
		List result=empDao.pullList();
		assertNotNull(result);
		assertTrue(result.size()>0);
		leng=empDao.listSize();
	}
	
	@Test
	public void test2AddList() {
		empDao.addList(target);
	}
	
	@Test
	public void test3GetList() {
		assertEquals(target, empDao.getList(target.getEmpno()));
	}
	
	@Test
	public void test4SetList() {
		target.setEname("edit81");
		assertSame(1, empDao.setList(target));
	}
	@Test
	public void test5rmList() {
		assertSame(1, empDao.rmList(target.getEmpno()));
	}
	
	@Test
	public void test6ListSize() {
		assertSame(leng, empDao.listSize());
	}
}












