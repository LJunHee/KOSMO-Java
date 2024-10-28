package com.gimhae.model;

import java.util.List;

public interface EmpDao {
	List<EmpVo> pullList();
	EmpVo getList(int idx);
	int addList(EmpVo bean);
	int setList(EmpVo bean);
	int rmList(int idx);
	int listSize();
}
