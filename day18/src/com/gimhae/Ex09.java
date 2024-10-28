package com.gimhae;

import java.util.Random;

public class Ex09 {
/*
-1155869325
0.10047321632624884
false
2
5
 * 
 * */
	public static void main(String[] args) {
		Random ran=new Random(1);
		System.out.println(ran.nextInt()); //Integer.MIN_VALUE~MAX
		System.out.println(ran.nextDouble()); // 0<= <1
		System.out.println(ran.nextBoolean());
		System.out.println(ran.nextInt(3));	// 0,1,2
		System.out.println(ran.nextInt(45)+1);	// 0,1,2
		

	}

}
