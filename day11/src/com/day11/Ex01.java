package com.day11;

import java.util.ArrayList;

public class Ex01 {

	public static void main(String[] args) {
		// 제너릭
		// 1.5~
		// 문법적으로 자료형을 제약
		// 개념적으로 확장
		ArrayList list1 = new ArrayList();
		list1.add("문자열");
		System.out.println(list1.get(0));
		String msg1 = (String) list1.get(0);
		System.out.println(msg1);

		ArrayList<Integer> list2 = new ArrayList<Integer>();
//		list2.add("문자열");
		list2.add(1234);
		System.out.println(list1.get(0));
//		System.out.println(msg2);
		int su = list2.get(0);
		System.out.println(su);
	}

}
