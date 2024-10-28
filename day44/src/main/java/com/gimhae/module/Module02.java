package com.gimhae.module;

public class Module02 implements Module {
	int su1;
	double su2;
	char su3;
	boolean su4;
	String msg;
	
	public void setSu1(int su1) {
		this.su1 = su1;
	}

	public void setSu2(double su2) {
		this.su2 = su2;
	}

	public void setSu3(char su3) {
		this.su3 = su3;
	}

	public void setSu4(boolean su4) {
		this.su4 = su4;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "Module02 [su1=" + su1 + ", su2=" + su2 + ", su3=" + su3 + ", su4=" + su4 + ", msg="
		    + msg + "]";
	}

	@Override
	public void func01() {
		System.out.println(this.toString());
	}

}
