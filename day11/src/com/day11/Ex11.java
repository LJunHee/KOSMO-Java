package com.day11;

import java.util.*;

public class Ex11 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("첫번째");
		set.add("두번째");
		set.add("세번째");
		set.add("두번째");
		List<String> list = new ArrayList<>(set);
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}
