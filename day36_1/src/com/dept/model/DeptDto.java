package com.dept.model;

public class DeptDto {
	private int deptno;
	private String dname,loc,ordfile,newfile;
	
	public DeptDto() {
		
	}

	
	public DeptDto(int deptno, String dname, String loc) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}


	public DeptDto(int deptno, String dname, String loc, String ordfile, String newfile) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
		this.ordfile = ordfile;
		this.newfile = newfile;
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

	@Override
	public String toString() {
		return "DeptDto [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
	}
	
	
	
}
