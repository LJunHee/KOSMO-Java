package com.day10;

import java.util.*;
public class Ex08 {

	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();
		list1.add(1111);
		list1.add(2222);
		list1.add(3333);
		list1.add(4444);
		
		LinkedList list2 = new LinkedList(list1);
		System.out.println(list2);
		
		// 선형
		// 순서 맘대로
		// 순서 정해짐
		// 큐,스택
		// 선입선출
		Queue list3 = new LinkedList();
		list3.offer("첫번째");
		list3.offer("두번째");
		list3.offer("세번째");
		list3.offer("네번째");
		
		while(list3.peek() !=null) {
			System.out.println(list3.poll());
		}
		
	}

}
