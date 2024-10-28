package com.day07;

class Lec09 {
	public Lec09() {
		this(1234);
		System.out.println("디폴트");
	}
	
	public Lec09(int a) {
		this("su="+a);
		System.out.println("매개변수 정수 " + a);
	}
	
	public Lec09(String msg) {
		super();
		System.out.println("매개변수 문자열 " + msg);
	}
}

public class Ex09 {

	public static void main(String[] args) {
		Lec09 lec = new Lec09();
	}

}
