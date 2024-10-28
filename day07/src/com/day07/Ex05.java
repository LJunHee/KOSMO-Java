package com.day07;


public class Ex05 extends java.lang.Object implements Cloneable {

	public static void main(String[] args) throws CloneNotSupportedException {
		Object obj = new Object();
		System.out.println(obj.toString());
		System.out.println(obj.hashCode());
		System.out.println(obj.getClass());
//		System.out.println(obj.clone());
		
		System.out.println("-----------------");
		Ex05 me = new Ex05();
		System.out.println(me.toString());
		System.out.println(me.hashCode());
		System.out.println(me.getClass());
		Object you = me.clone();
		System.out.println(you.toString());
		
		System.out.println("----------------");
		int[] arr1 = {1,3,5,7};
		int[] arr2 = (int[])arr1.clone();
		arr1[2] = 6;
		System.out.println(java.util.Arrays.toString(arr1));
		System.out.println(java.util.Arrays.toString(arr2));
	}
}
