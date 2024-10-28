package com.gimhae;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex11 {

	public static void main(String[] args) {
		String msg="java,web,,database,framework";

		String[] arr1=msg.split(",");
		System.out.println(arr1.length);
		System.out.println(Arrays.toString(arr1));
		
		StringTokenizer stk=new StringTokenizer(msg,",");
		while(stk.hasMoreTokens()) {
			String token=stk.nextToken();
			System.out.println(token);
		}
	}

}
