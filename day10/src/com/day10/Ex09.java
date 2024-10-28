package com.day10;

import java.util.*;
public class Ex09 {

	public static void main(String[] args) {
		Deque stack = new LinkedList();
		
//		stack.offerFirst("첫번째");
//		stack.offerFirst("두번째");
//		stack.offerFirst("세번째");
		
//		System.out.println(stack.pollFirst());
//		System.out.println(stack.pollFirst());
//		System.out.println(stack.pollFirst());
//		System.out.println(stack.pollFirst());
		
		stack.offerLast("첫번째");
		stack.offerLast("두번째");
		stack.offerLast("세번째");
		
		System.out.println(stack.pollLast());
		System.out.println(stack.pollLast());
		System.out.println(stack.pollLast());
		System.out.println(stack.pollLast());
	}

}
