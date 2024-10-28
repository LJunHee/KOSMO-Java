package com.gimhae.emp.model;

import java.util.List;

public interface EmpDao {

	List<EmpVo> pullList();
	void addList(String ename, int pay);
	EmpVo getList(int empno);
	int setList(EmpVo bean);
	int rmList(int empno);
}