package com.day09;

public class Ex11 {

	public static void main(String[] args) {
		String msg1 = "java";
		String msg2 = "Web";
		char[] arr1 = new char[msg1.length()+msg2.length()];
		char[] arr2 = msg1.toCharArray();
		char[] arr3 = msg2.toCharArray();
		System.arraycopy(arr2, 0, arr1, 0, arr2.length);
		System.arraycopy(arr3, 0, arr1, arr2.length, arr3.length);
		msg1 = new String(arr1);
		System.out.println(msg1);
		
	}

}
