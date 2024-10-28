package com.day06;

public class Ex09 {

	public static void main(String[] args) {
		int[] arr1 = new int[] {1111,2222,3333,4444};
		
		//1.
		int[] arr2 = new int[arr1.length];
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = arr1[i];
//			System.out.println(arr2[i]);
		}
		
		//2.
		int[] arr3 = new int[arr1.length];
		System.arraycopy(arr1, 0, arr3, 0, 4);
		
		
		for(int i=0; i<arr3.length; i++) {
//			System.out.println(arr1[i]);
//			System.out.println(arr3[i]);
		}
		
		//3.
		int[] arr4 = java.util.Arrays.copyOfRange(arr1, 0, arr1.length);
		
		arr1[1] = 2000;
//		for(int i=0; i<arr4.length; i++) {
//			System.out.println(arr4[i]);
//		}
		System.out.println(java.util.Arrays.toString(arr4));
	}

}
