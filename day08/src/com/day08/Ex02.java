package com.day08;

abstract class Machine01 {
	void on() {
		System.out.println("켜고");
	}
	void off() {
		System.out.println("껐음");
	}
	void work() {}
}

class TV01 extends Machine01 {
	@Override
	void work() {
		System.out.println("화면을 출력하고");
	}
}
class Radio01 extends Machine01{
	@Override
	void work() {
		System.out.println("소리를 들려주고");
	}
}

class Audio01 extends Machine01{
	@Override
	void work() {
		System.out.println("음악을 들려주고");
	}
}

public class Ex02 {
	public static void main(String[] args) {
		Machine01 remote = null;
		java.util.Scanner sc;
		sc = new java.util.Scanner(System.in);
		int input = 0;
		
		while(true) {
			System.out.print("1.TV 2.Radio 3.Audio 0.Exit");
			input = sc.nextInt();
			if(input == 0) break;
			else if(input == 1) remote = new TV01();
			else if(input == 2) remote = new Radio01();
			else if(input == 3) remote = new Audio01();
			
			remote.on();
			remote.work();
			remote.off();
		}
	}
}
