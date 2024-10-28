package com.gimhae.emp.model;

import java.util.List;

public interface EmpDao<T> {
	List<T> pullList();
	T getList(int idx);
	void addList(T t);
	int setList(T t);
	int rmList(int idx);
	int listSize();
}