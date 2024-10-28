package com.day06;

public class Ex20 {

	public static void main(String[] args) {
		String kor = "영영일이삼일-삼일이삼사오육";
		String num = kor.replace("영일이삼사오육칠팔구","0123456789");
		System.out.println(num);
	}

}
