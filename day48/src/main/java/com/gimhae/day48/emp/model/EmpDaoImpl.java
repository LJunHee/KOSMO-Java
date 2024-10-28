package com.gimhae.day48.emp.model;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class EmpDaoImpl {
	@Autowired
	SqlSessionTemplate sqlSession;	
	
	public List<EmpVo> pullList(){
		return sqlSession.selectList("emp.pullList");
	}
	
	@Override
	public int setList(EmpVo bean) {
		return sqlSession.update("emp)
	}
}
