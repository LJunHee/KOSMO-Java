package com.day08;

// 상속을 통한 클래스
abstract class Lec03 {
	void func01() {
		System.out.println("기능");
	}
}

public class Ex03 extends Lec03 {
	public static void main(String[] args) {
//		Lec03 lec = new Lec03();
		Ex03 me = new Ex03();
		me.func01();
	}
}
