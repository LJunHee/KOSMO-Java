package com.emp.model;

import java.sql.Timestamp;

public class EmpDto {
	private int empno,pay;
	private String ename;
	private Timestamp hiredate;
	
	public EmpDto() {
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Timestamp getHiredate() {
		return hiredate;
	}

	public void setHiredate(Timestamp hiredate) {
		this.hiredate = hiredate;
	}

	@Override
	public String toString() {
		return "EmpDto [empno=" + empno + ", pay=" + pay + ", ename=" + ename + "]";
	}

	
	
	
}
