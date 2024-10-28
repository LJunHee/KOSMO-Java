package com.etc;

public class Lec06 {
	//디폴트 생성자 - public 클래스명(){}
//	public Lec06() {}
	protected Lec06(String msg) {}
	Lec06(int a) {}
	private Lec06(double a) {}
	
	
	public void func01() {
		System.out.println("Lec06 f1 public");
	}
	protected void func02() {
		System.out.println("Lec06 f2 protected");
	}
	void func03() {
		System.out.println("Lec06 f3 default");
		func04();
	}
	//해당 클래스 내부에서만 접근 허용
	private void func04() {		
		System.out.println("Lec06 f4 private");		
	}
}
