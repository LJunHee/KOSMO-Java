package com.day06;


public class Ex13 {

	public static void main(String[] args) {
		String msg = "a ab abc abcd";

		String msg2 = msg.replace("a", "A");
		System.out.println(msg2);
		String msg3 = msg.replace("abc ", "");
		System.out.println(msg3);
		String msg4 = msg.replace("ab abc", "ab @ abc");
		System.out.println(msg4);
	}

}
