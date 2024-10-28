package com.emp.model;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.List;

import org.junit.Test;
import org.junit.runner.OrderWith;
import org.junit.runner.manipulation.Alphanumeric;

import junit.framework.Assert;

@OrderWith(Alphanumeric.class)
public class EmpDaoTest {
	EmpDto target=new EmpDto(3,3333,"tester3",null);

	@Test
	public void test1PullList() throws SQLException {
		EmpDao dao=new EmpDao();
		List<EmpDto> list = dao.pullList();
		Assert.assertNotNull(list);
		Assert.assertNotSame(0, list.size());
	}
	
	@Test
	public void test2GetList() throws SQLException {
		//EmpDto [empno=1, pay=1111, ename=tester1]

		EmpDao dao=new EmpDao();
		EmpDto result=dao.getList(target.getEmpno());
		
		Assert.assertNotNull(result);
		Assert.assertEquals(target,result);
	}

	@Test
	public void test3PushList() throws SQLException {
		EmpDto target=new EmpDto(6,6666,"test6",null);
		
		EmpDao dao=new EmpDao();
		int result=dao.pushList(target);
		Assert.assertSame(1, result);
	}
	
	@Test
	public void test4EditList() throws SQLException {
		
		EmpDao dao=new EmpDao();
		int result=dao.editList(target);
		Assert.assertSame(1, result);
	}
	
	@Test
	public void test5RemoveList() throws SQLException {
		EmpDao dao=new EmpDao();
		int result=dao.removeList(target.getEmpno());
		Assert.assertSame(1, result);
	}
}






