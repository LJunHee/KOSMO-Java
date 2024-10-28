package com.day08;

class TV07 implements Machine07{

	@Override
	public void on() {
		System.out.println("전원코드 꼽아 전원켜고");
	}

	@Override
	public void work() {
		System.out.println("화면을 출력하고");
	}
	
	@Override
	public void off() {
		System.out.println("끄고 전원코드 뽑는다");
	}
}

class Radio07 implements Machine07 {

	@Override
	public void on() {
		System.out.println("충전해서 전원켜고");
	}
	
	@Override
	public void work() {
		System.out.println("끄고 충전해놓는다");
	}

	@Override
	public void off() {
		System.out.println("소리를 들려주고");
	}
}

public class Ex07 {

	public static void main(String[] args) {
		Machine07 remote = null;
		remote = new Radio07();
		remote.on();
		remote.work();
		remote.off();
	}

}
