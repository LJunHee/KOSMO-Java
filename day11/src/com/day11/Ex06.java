package com.day11;


import java.util.*;
public class Ex06 {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1111);
		list1.add(2222);
		list1.add(3333);
		list1.add(4444);
		for(int i =0; i<list1.size(); i++) {
			int msg = list1.get(i);
			System.out.println(msg);
		}
	}

}
