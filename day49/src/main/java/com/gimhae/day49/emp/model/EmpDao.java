package com.gimhae.day49.emp.model;

import java.util.List;

public interface EmpDao {
	List<EmpVo> pullList();
	EmpVo getList(int idx);
	void addList(EmpVo bean);
	int setList(EmpVo bean);
	int rmList(int idx);
	EmpVo getLastList();
}