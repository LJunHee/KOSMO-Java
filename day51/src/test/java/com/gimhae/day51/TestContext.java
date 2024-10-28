package com.gimhae.day51;

import static org.junit.Assert.*;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gimhae.day51.dept.model.DeptDao;
import com.gimhae.day51.dept.model.DeptVo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:src/main/webapp/WEB-INF/spring/root-context.xml",
		"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"
		})
public class TestContext {
	@Autowired
	SqlSessionFactory sqlSessionFactory;
//	SqlSession sqlSession;

	@Test
	public void test() {
//		assertNotNull(sqlSession.getMapper(DeptDao.class).pullList());
//		System.out.println(sqlSession.getMapper(DeptDao.class).pullList());
		try(SqlSession session=sqlSessionFactory.openSession()) {
			for(DeptVo bean:session.getMapper(DeptDao.class).pullList()) {
				log.info(bean.toString());
			}
		}
	}

}










