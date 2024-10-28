package com.gimhae.day49.dept.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonFactoryBuilder;
import com.gimhae.day49.dept.model.DeptDao;
import com.gimhae.day49.dept.model.DeptVo;

@Transactional
@Service
public class DeptService {
	@Autowired
	SqlSession sqlSession;

	public List<?> list(){
		DeptDao deptDao=sqlSession.getMapper(DeptDao.class);
		return deptDao.pullList();
	}
	
	public DeptVo getOne(int deptno) {
		DeptDao deptDao=sqlSession.getMapper(DeptDao.class);
		return deptDao.getList(deptno);
	}
	
	public String add(DeptVo bean) {
		DeptDao deptDao=sqlSession.getMapper(DeptDao.class);
		return "{\"result\":"+deptDao.addList(bean)+"}";
	}
	
	public String edit(DeptVo bean) {
		DeptDao deptDao=sqlSession.getMapper(DeptDao.class);
		return "{\"result\":"+deptDao.setList(bean)+"}";
	}
	
	public String delete(int deptno) {
		DeptDao deptDao=sqlSession.getMapper(DeptDao.class);
		return "{\"result\":"+deptDao.rmList(deptno)+"}";
	}
}














