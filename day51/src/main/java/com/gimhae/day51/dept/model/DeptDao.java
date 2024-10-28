package com.gimhae.day51.dept.model;

import java.util.List;

public interface DeptDao {
	List<DeptVo> pullList();
	DeptVo getList(int deptno);
	int setList(DeptVo bean);
	int rmList(int deptno);
	void addList(DeptVo bean);
}