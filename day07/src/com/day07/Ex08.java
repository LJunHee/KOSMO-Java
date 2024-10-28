package com.day07;

// 오버라이드는 접근제한자가 보다 허용되는 방향으로는 가능
class Lec08{
	void func01() {
		System.out.println("부모 기능1");
	}
	//오버라이드 금지(메소드에서의 final)
	final void func02() {
		System.out.println("부모 기능2");
	}
	private void func03() {}
	public void func04() {}
}

//상속 불가
final class Lec88{
	
}

public class Ex08 extends Lec08 {
	final static int su1 = 1111;
	final int su2 = 2222;
	final int su3;
	

	public Ex08() {
		su3 = 3333;
//		su3++;
	}
	
	@Override
	void func01() {
		System.out.println("재 정의된 기능1");
	}
//	@Override
//	void func03() {
//		System.out.println("재 정의된 기능1");
//	}
	@Override
	public void func04() {
		System.out.println("재 정의된 기능4");
	}
	
//	@Override
//	void func02() {
//		System.out.println("재 정의된 기능2");
//	}
	
	public static void main(String[] args) {
		final int su; // 상수형 변수
		su = 1111;
//		su++;
//		su2++;
		Ex08 me = new Ex08();
	}
	
}
