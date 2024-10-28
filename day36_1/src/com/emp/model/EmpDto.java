package com.emp.model;

import java.sql.Date;

public class EmpDto {
	private int empno,pay;
	private String ename,ordfile,newfile;
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

	public EmpDto(int empno, int pay, String ename, Date hiredate, String ordfile, String newfile) {
		super();
		this.empno = empno;
		this.pay = pay;
		this.ename = ename;
		this.ordfile = ordfile;
		this.newfile = newfile;
		this.hiredate = hiredate;
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

	public String getOrdfile() {
		return ordfile;
	}

	public void setOrdfile(String ordfile) {
		this.ordfile = ordfile;
	}

	public String getNewfile() {
		return newfile;
	}

	public void setNewfile(String newfile) {
		this.newfile = newfile;
	}

	public Date getHiredate() {
		return hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	@Override
	public String toString() {
		return "EmpDto [empno=" + empno + ", pay=" + pay + ", ename=" + ename + ", ordfile="
		    + ordfile + ", newfile=" + newfile + "]";
	}
	
	
}
