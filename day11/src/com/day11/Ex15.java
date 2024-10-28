package com.day11;
import java.util.*;
//key는 중복불가(중복시 덮어쓰임), value는 중복가능
//없는 key를 호출시 null
public class Ex15 {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		//key, value
		//key -set
		//value -list
		//생성
		map.put("key1", "val1");
		map.put("key2", "val2");
		map.put("key3", "val3");
		map.put("key4", null);
		map.put(null, null);
		map.put(null, "val4");
		
		//수정
		map.replace("key2","val33");
		
		//삭제
		map.remove("key2","val3");
		

		
		System.out.println(map.get("key1"));
		System.out.println(map.get("key2"));
		System.out.println(map.get("key3"));
		System.out.println(map.get("key4"));
		System.out.println(map.get(null));
		System.out.println(map.get("key5"));
	}

}
