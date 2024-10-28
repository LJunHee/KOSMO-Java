package com.gimhae;

public class Ex18 {

	public static void main(String[] args) {
		System.out.println("main start");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("main end");
	}

}
