package com.day11;

import java.util.*;
public class Ex10 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1111);
		list.add(2222);
		list.add(3333);
		list.add(4444);
		System.out.println(list);
		Set<Integer> set = new HashSet<>(list);
		System.out.println(set);
		
	}

}
