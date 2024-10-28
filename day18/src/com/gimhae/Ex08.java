package com.gimhae;

import java.util.Arrays;

public class Ex08 {

	public static void main(String[] args) {
		int[] arr1=new int[] {1,5,3,7};
//		Arrays.fill(arr1, 0);
		
//		Arrays.sort(arr1);
		System.out.println(Arrays.binarySearch(arr1, 3));//Arrays.sort(arr1); 
		System.out.println(arr1);
		System.out.println(Arrays.toString(arr1));
//		int[] arr2=Arrays.copyOf(arr1, arr1.length);
//		arr1[0]=2;
		int[] arr2=Arrays.copyOfRange(arr1, 1, 3);
		
		System.out.println(Arrays.toString(arr2));
		java.util.List list=Arrays.asList(2,4,6,8);
		System.out.println(list);
	}

}
