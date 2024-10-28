package com.gimhae.day49.dept.model;

import java.util.List;

public interface DeptDao {
	List<DeptVo> pullList();
	DeptVo getList(int idx);
	int addList(DeptVo bean);
	int setList(DeptVo bean);
	int rmList(int idx);
}