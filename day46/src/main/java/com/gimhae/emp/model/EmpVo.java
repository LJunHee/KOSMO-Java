package com.gimhae.emp.model;

import java.sql.Date;
import java.time.LocalDate;

public class EmpVo {
	private int empno, pay;
	private String ename;
//	private LocalDate hiredate;
	private Date hiredate;
	
	public EmpVo() {
	}
	
	public EmpVo(int empno, int pay, String ename, Date hiredate) {
		super();
		this.empno = empno;
		this.pay = pay;
		this.ename = ename;
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
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	@Override
	public String toString() {
		return "EmpVo [empno=" + empno + ", pay=" + pay + ", ename=" + ename + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empno;
		result = prime * result + ((ename == null) ? 0 : ename.hashCode());
		result = prime * result + ((hiredate == null) ? 0 : hiredate.hashCode());
		result = prime * result + pay;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		EmpVo other = (EmpVo) obj;
		if (empno != other.empno) return false;
		if (ename == null) {
			if (other.ename != null) return false;
		} else if (!ename.equals(other.ename)) return false;
		if (hiredate == null) {
			if (other.hiredate != null) return false;
		} else if (!hiredate.equals(other.hiredate)) return false;
		if (pay != other.pay) return false;
		return true;
	}

	
}