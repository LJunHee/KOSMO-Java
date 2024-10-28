package com.day10;

public class Ex03 {

	public static void main(String[] args) {
		// 배열을 이용한 동적할당
		// 이론 - Read유리 Create, Update, Delete 불리
		java.util.List list;
		list = new java.util.ArrayList();
		list.add(1111);
		list.add(2222);
		list.add(3333);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}

}
