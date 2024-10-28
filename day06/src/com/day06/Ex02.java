package com.day06;

public class Ex02 {
	
	public static void main(String[] args) {
//		func01();
//		func02();
		func03();
	}
	
	//반복문,switch의 탈출 (최 근접 반복문)
	public static void func01() {
		for(int i = 0; i<10; i++) {
			if(i>5) break;
			System.out.println("func01-" + i);
		}
		System.out.println("f1의 나머지");
	}
	
	//해당 메서드의 종료
	public static void func02() {
		for(int i =0; i<10; i++) {
			if(i>5) return;
			System.out.println("func02-" + i);
		}
		System.out.println("f2의 나머지");
	}

	//반복문의 상단으로 돌아감
	public static void func03() {
		for(int i =0; i<10; i++) {
			System.out.println(i);
			if(i>5) continue;
			System.out.println("func03-" + i);
		}
		System.out.println("f3의 나머지");
	}
}
