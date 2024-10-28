package com.day12;

/*
 * 내부 클래스(inner class)
 * 클래스 내부에 존재하는 클래스
 * 
 * 4가지 형식
 * 1. static class (static inner class) (정적 클래스)
 * 2. instance class (non-static inner class) (인스턴스 클래스)
 * 3. local class (지역 클래스)
 * 4. anonymous class (익명 클래스)
 */

public class Ex01 {
	
	//1.
	static class Lec01{} // 정적 클래스
	
	//2.
	class Lec02{} // 인스턴스 클래스
	
	//3.
	public void func01() {
		class Lec03{} // 로컬 클래스
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
