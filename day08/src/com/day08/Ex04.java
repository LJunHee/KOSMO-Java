package com.day08;

abstract class Lec04 {
	final int su;
	
	public Lec04(int su) {
		this.su = su;
	}
	
	abstract void func01();
}

public class Ex04 extends Lec04 {
	
	public Ex04() {
		super(4321);
	}
	
	public static void main(String[] args) {
		Ex04 me = new Ex04();
		me.func01();
	}
	
	@Override
	void func01() {
		System.out.println("su = " + super.su);
	}
}
