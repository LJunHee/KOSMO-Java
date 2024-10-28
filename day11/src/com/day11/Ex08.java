package com.day11;

import java.util.*;
public class Ex08 {

	public static void main(String[] args) {
		// last-in-first-out (LIFO)
		Stack list = new Stack();
		list.push("첫번째");
		list.push("두번째");
		list.push("세번째");
		list.push("네번째");
		
//		System.out.println(list.peek());
//		System.out.println(list.pop());
//		System.out.println(list.peek());
//		System.out.println(list.pop());
//		System.out.println(list.peek());
//		System.out.println(list.pop());
//		System.out.println(list.peek());
//		System.out.println(list.pop());
//		System.out.println(list.empty());
		System.out.println(list.search("두번째"));
		System.out.println("------------------------");
		
		while(!list.empty()) {
			System.out.println(list.peek());
			list.pop();
		}

	}

}
