package com.day10;

public class Ex04 {

	public static void main(String[] args) {
		java.util.ArrayList list;
		list = new java.util.ArrayList();
		
//		java.util.LinkedList list;
//		list = new java.util.LinkedList();
		//4~5ms
		
		
		for(int i=0; i<100000; i++) {
			list.add(i);
		}
		
		long before= System.currentTimeMillis();
		Object obj;
		
		for(int i=0; i<100000; i++) {
			obj = list.add(i);
		}
		long after =System.currentTimeMillis();
		
		System.out.println("수행한 시간 : " + (after - before) + "ms");
	}
}
