package com.gimhae.day49.emp.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import lombok.RequiredArgsConstructor;

//@RequiredArgsConstructor
@Repository
public class EmpDaoImpl implements EmpDao{
	private final SqlSession sqlSession;
	
	public EmpDaoImpl(SqlSession sqlSession) {
		this.sqlSession=sqlSession;
	}

	@Override
	public List<EmpVo> pullList() {
		return sqlSession.selectList("emp.pullList");
	}

	@Override
	public EmpVo getList(int idx) {
		return sqlSession.selectOne("emp.getList",idx);
	}

	@Override
	public void addList(EmpVo bean) {
		sqlSession.insert("emp.addList", bean);
	}

	@Override
	public int setList(EmpVo bean) {
		return sqlSession.update("emp.setList",bean);
	}

	@Override
	public int rmList(int idx) {
		return sqlSession.delete("emp.rmList",idx);
	}

	@Override
	public EmpVo getLastList() {
		return sqlSession.selectOne("emp.getLastList");
	}

}