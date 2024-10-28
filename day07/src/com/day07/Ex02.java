package com.day07;

class Lec02 {
	int su =1111;
	public void func01() {
		System.out.println("부모의 기능");
	}
}

public class Ex02 extends Lec02 {
	int su = 2222;
	
	public void func01() {
		super.func01();
		System.out.println("자식의 기능");		
		System.out.println(super.su);		
		System.out.println(this.su);		
	}
	
	public static void main(String[] args) {		
		Ex02 me = new Ex02();
		me.func01();
		System.out.println(me.toString());
	}

}
