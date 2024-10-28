package com.ex.step01;

public class Tv implements Machine {
	
	public void on() {
		System.out.println("Tv 켜짐");
	}
	
	public void off() {
		System.out.println("Tv 꺼짐");
	}
	
	public void work() {
		System.out.println("Tv가 작동");
	}

}
