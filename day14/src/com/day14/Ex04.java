package com.day14;

public class Ex04 {

	public static void main(String[] args) {
		//finally
		int su = 1;
		try {
			int a = 1/su;
			System.out.println("a = " + a);
		} catch(ArithmeticException e) {
			System.out.println("에러 처리");
		} finally {
			System.out.println("반드시 처리");
		}
	}

}
