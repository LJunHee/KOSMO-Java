package com.emp.model;

import java.util.Date;

public class EmpDto {
	private int empno,pay;
	private String ename;
	private Date hiredate;
	
	public EmpDto() {
	}

	public EmpDto(int empno, int pay, String ename, Date hiredate) {
		super();
		this.empno = empno;
		this.pay = pay;
		this.ename = ename;
		this.hiredate = hiredate;
	}

	public int getEmpno() {
		return empno+2;
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

	public Date getHiredate() {
		return hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	@Override
	public String toString() {
		return "EmpDto [empno=" + empno + ", pay=" + pay + ", ename=" + ename + "]";
	}

	
	

}
