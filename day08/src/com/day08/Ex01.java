package com.day08;

/*
 * 추상클래스
 * 추상메소드를 0개 이상 갖는 클래스를 의미
 * 혼자서 개게의 생성이 불가능
 * 상속을 통해 사용
 */
abstract class Parent {
	
	void func01() {
		System.out.println("부모의 기능");
	}
	
	// 추상 메소드 - 메소드의 선언만, 구현이 없음
	public abstract void func02();
}

class Child extends Parent {
	@Override
	public void func02() {
		System.out.println("자식이 오버라이드한 기능");
	}
}

public class Ex01 {

	public static void main(String[] args) {
		Child c1 = new Child();
		c1.func01();
		c1.func02();
		
		Parent p = new Child();
		p.func01();
		p.func02();
	}

}
