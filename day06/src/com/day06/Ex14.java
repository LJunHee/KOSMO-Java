package com.day06;

public class Ex14 {

	public static void main(String[] args) {
		String msg = "http://naver.com";
		System.out.println(msg.codePointAt(0));
		System.out.println(msg.endsWith(".com"));
		System.out.println(msg.startsWith("http"));
		
//		String msg2 = null;
		String msg2 = "";
		System.out.println(msg2.length()==0);
		System.out.println(msg2.isEmpty());
		
		System.out.println(msg.substring(7));
		System.out.println(msg.substring(7,12));
		System.out.println(msg.subSequence(7,12));
		
		String msg3 = "   Hello Java    ";
		System.out.println(msg3.toUpperCase());
		System.out.println(msg3.toLowerCase());
		System.out.println(">>>"+msg3.toString()+"<<<");
		System.out.println(">>>"+msg3.trim()+"<<<");
	}

}
