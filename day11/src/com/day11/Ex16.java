package com.day11;
//반복

import java.util.*;
import java.util.Map.Entry;

public class Ex16 {

	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<>();
		map.put("key1", "val1");
		map.put("key2", "val2");
		map.put("key3", "val3");
		map.put("key4", "val4");
		
		Set<Entry<String,String>> set = map.entrySet();
		Iterator<Entry<String,String>> ite = set.iterator();
		while(ite.hasNext()) {
			Entry<String,String> ent = ite.next();
			System.out.println("key = " + ent.getKey() + ", val = " + ent.getValue());
		}
		System.out.println("-------------------------------");
		
		Set<String> keys = map.keySet();
		Iterator<String> ite2 = keys.iterator();
		while(ite2.hasNext()) {
			String key = ite2.next();
			System.out.println(map.keySet()+map.get(key));
		}
	}

}
