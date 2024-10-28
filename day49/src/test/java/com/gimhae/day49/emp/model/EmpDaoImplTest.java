package com.gimhae.day49.emp.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.annotation.Commit;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:/applicationContext.xml",
		"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"
		})
public class EmpDaoImplTest {
	@Autowired
	EmpDao empDao;
	private EmpVo target;
	
	@Before
	public void before() {
		target=EmpVo.builder()
				.empno(5)
				.ename("user5")
				.pay(5000)
				.deptno(1)
				.build();
	}

	@Test
	public void test() {
		assertNotNull(empDao);
	}
	@Test
	public void testPullList() {
		assertNotNull(empDao.pullList());
	}
	
	@Transactional
	@Test
	public void testAddList() {
		target.setEname("test6");
		empDao.addList(target);
	}
	
	@Test
	public void testGetList() {
		assertEquals(target, empDao.getList(target.getEmpno()));
	}
	
	@Transactional
	@Test
	public void testSetList() {
		target.setEname("tester");
		assertSame(1, empDao.setList(target));
	}

	@Transactional
	@Test
	public void testRmList() {
		assertSame(1, empDao.rmList(target.getEmpno()));
	}
}









