package com.home.model;

public class EmpDto {
	private int empno,pay,deptno,mgr;
	private String ename,dname,mname;
	
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

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public int getMgr() {
		return mgr;
	}

	public void setMgr(int mgr) {
		this.mgr = mgr;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
	

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	@Override
	public String toString() {
		return "EmpDto [empno=" + empno + ", pay=" + pay + ", deptno=" + deptno + ", mgr=" + mgr
		    + ", ename=" + ename + ", dname=" + dname + ", mname=" + mname + "]";
	}

	
	
	
}
