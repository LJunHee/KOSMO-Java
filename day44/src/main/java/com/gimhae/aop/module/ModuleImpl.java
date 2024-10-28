package com.gimhae.aop.module;

public class ModuleImpl implements Module {
	int su=1234;

	public void afunc01() {
		System.out.println("func01 run...");
	}
	public void bfunc02(String msg) {
		System.out.println(msg+this.su);
		System.out.println(this);
	}
	public void bfunc03(String msg, int su) {
		System.out.println(msg+su);
	}
	public String afunc04() {
		System.out.println("func04..");
		return "success...";
	}
	public void bfunc05(int a, int b) {
		System.out.println("func05 before..");
		int su=a/b;
		System.out.println("func05 after.."+su);
	}

}