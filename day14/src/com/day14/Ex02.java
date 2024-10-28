package com.day14;


public class Ex02 {

	public static void main(String[] args) {
		int[] arr = { -1, 0, 1, 2 };

		for (int i = 4; i >= 0; i--) {
			try {
				System.out.println(4 / arr[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("예외 처리 됨(pass)");
			} catch (ArithmeticException e) {
				System.out.println(0);
			} catch (RuntimeException e) {
				System.out.println("runtime");
			}
		}
	}
}
