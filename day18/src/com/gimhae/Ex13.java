package com.gimhae;

import java.util.Base64;

public class Ex13 {

	public static void main(String[] args) {
		String msg="�ѱ�";
		byte[] arr1=Base64.getEncoder().encode(msg.getBytes());
		System.out.println(new String(arr1));
		byte[] arr2=Base64.getDecoder().decode("x9Gx2w==".getBytes());
		System.out.println(new String(arr2));
	}

}
