package com.gimhae.emp.model;

import java.util.List;

public interface EmpDao {
	List<EmpVo> pullList();
	EmpVo getList(int pk);
	void addList(String ename,int pay);
	int setList(String ename,int pay,int pk);
	int rmList(int pk);
}
