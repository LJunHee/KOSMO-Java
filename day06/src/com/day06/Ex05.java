package com.day06;

public class Ex05 {

	public static void main(String[] args) {
		//참조변수
		int[] arr1; // 배열변수 선언
		arr1 = new int[3]; // 초기화
//		arr1[0]=1111;
//		arr1[1]=2222;
//		arr1[2]=3333;
		System.out.println(arr1);
		Ex05 me = new Ex05();
		System.out.println(me);
		System.out.println(me.toString());
		System.out.println(me.getClass());
		System.out.println("@");
		System.out.println(me.hashCode());
		System.out.println(Integer.toHexString(me.hashCode()));
	}

}
