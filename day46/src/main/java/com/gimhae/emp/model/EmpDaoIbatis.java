package com.gimhae.emp.model;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class EmpDaoIbatis extends SqlMapClientDaoSupport implements EmpDao {

	@Override
	public List<EmpVo> pullList() {
		return getSqlMapClientTemplate().queryForList("empList");
	}

	@Override
	public void addList(String ename, int pay) {
		getSqlMapClientTemplate().insert("insertOne",new EmpVo(0,pay,ename,null));
		
	}

	@Override
	public EmpVo getList(int empno) {
		return (EmpVo) getSqlMapClientTemplate().queryForObject("oneList",empno);
	}

	@Override
	public int setList(EmpVo bean) {
		return getSqlMapClientTemplate().update("updateOne",bean);
	}

	@Override
	public int rmList(int empno) {
		return getSqlMapClientTemplate().delete("deleteOne",empno);
	}

}
