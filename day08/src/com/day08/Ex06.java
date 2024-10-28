package com.day08;

interface Inter02 {
	void func01();
}

interface Inter03 {
	void func02();
}

interface Inter04 extends Inter02 {}
interface Inter05 extends Inter02,Inter03 {}

public class Ex06 implements Inter05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void func02() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void func01() {
		// TODO Auto-generated method stub
		
	}

}
