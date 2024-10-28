package com.day11;

import java.util.Iterator;

public class Ex09 {

	public static void main(String[] args) {
		// 순서가 없는
		java.util.Set<String> set=  new java.util.HashSet<>();
		set.add("첫번째");
		set.add("두번째");
		set.add("세번째");
		set.add("네번째");
		Iterator<String> ite = set.iterator();
		System.out.println(ite.next());
		System.out.println(ite.next());
		System.out.println(ite.next());
		System.out.println(ite.next());
		
		while(ite.hasNext()) {
			String msg = ite.next();
			System.out.println(msg);
		}

	}

}
