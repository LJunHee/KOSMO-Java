package com.gimhae.module;

public class Module04 implements Module {
	String[] arr1;
	
	public void setArr1(String[] arr1) {
		this.arr1 = arr1;
	}
	
	@Override
	public void func01() {
		for(String msg:arr1) {
			System.out.println(msg);
		}
	}

}
