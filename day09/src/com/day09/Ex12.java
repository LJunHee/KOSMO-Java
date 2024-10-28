package com.day09;


public class Ex12 {

	public static void main(String[] args) {
		//16 -> 34 -> 70 -> 142(앞의 값 +1의 두배)
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println("-------------------------------");

		for (int i = 0; i < 70; i++)
		    sb.append("a");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println("------------------------------");
		sb.append("b");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		

	}

}
