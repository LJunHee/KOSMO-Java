package com.gimhae.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;

public class EmpDaoTest {
	static ApplicationContext ac;
	EmpDao empDao;
	EmpVo target;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ac=new ClassPathXmlApplicationContext("/applicationContext.xml");
		
	}

	@Before
	public void setUp() throws Exception {
		empDao=ac.getBean(EmpDao.class);
		//EmpVo [empno=4, pay=4444, ename=tester4];
		target=EmpVo.Builder()
					.empno(4)
					.pay(4444)
					.ename("tester4")
					.build();

		PlatformTransactionManager manager=ac.getBean(PlatformTransactionManager.class);
		manager.getTransaction(ac.getBean(TransactionDefinition.class)).setRollbackOnly();
	}

	@Test
	public void testPullList() {
		List<EmpVo> list=empDao.pullList();
		assertNotNull(list);
		assertTrue(list.size()>0);
	}

	@Test
	public void testGetList() {
		assertEquals(target, empDao.getList(target.getEmpno()));
	}

	@Test
	public void testAddList() {
		target.setEname("new4");
		target.setPay(4444);
		assertSame(1, empDao.addList(target));
	}
	@Test
	public void testListSize() {
		assertNotSame(0, empDao.listSize());
	}
	

	@Test
	public void testSetList() {
		target.setEname("tester4");
		assertSame(1, empDao.setList(target));
	}

	@Test
	public void testRmList() {
		assertSame(1, empDao.rmList(2));
	}

}