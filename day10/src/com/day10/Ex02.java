package com.day10;

public class Ex02 {

	public static void main(String[] args) {
		// 객체를 활용한 동적할당
		//CRUD
		// 이론 - Create, Update, Delete 유리, Read 불리
		java.util.LinkedList list;
		list = new java.util.LinkedList();
		list.add(1111);
		list.add(2222);
		list.add(3333);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}

}
