package com.home.model;

public class DeptDto {
	private int deptno;
	private String dname;
	private String loc;
	
	public DeptDto() {
		
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "DeptDto [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
	}

	
	
	
	

}
