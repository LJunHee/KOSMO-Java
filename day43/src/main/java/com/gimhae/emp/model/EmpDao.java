package com.gimhae.emp.model;


import java.sql.SQLException;
import java.util.List;


public interface EmpDao {

	List<EmpDto> pullList() throws SQLException;


	void addList(String ename, int pay) throws SQLException;


	EmpDto getList(int empno) throws SQLException;


	int editList(String ename, int pay, int empno) throws SQLException;


	int rmList(int empno) throws SQLException;

}