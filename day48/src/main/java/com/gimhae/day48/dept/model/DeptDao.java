package com.gimhae.day48.dept.model;

import java.util.List;

public interface DeptDao {

	List<DeptVo> pullList();

	void addList(DeptVo deptVo);

	DeptVo getList(int deptno);

	int setList(DeptVo bean);

	int rmList(int deptno);

}