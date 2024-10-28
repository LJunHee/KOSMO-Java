package com.day08;

public class Ex10 {

	private Ex10() {
		
	}
	
	public static void main(String[] args) {
//		java.io.InputStream is = System.in;
//		java.util.Scanner sc = new java.util.Scanner(is);
//		java.io.PrintStream ps = System.out;
//		
//		
//		ps.println("출력" + sc.nextLine());
		long before = System.currentTimeMillis();
		for(int i = 0; i<1000000; i++) {
			new Ex10();
		}
		
		long after=System.currentTimeMillis();
		System.out.println(after-before);
		System.exit(0);
		System.out.println("종료");

	}

}
