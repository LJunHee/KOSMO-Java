package com.day10;

public class Ex06 {

	public static void main(String[] args) {
		// 선형
		java.util.List list,list2;
		list = new java.util.ArrayList();
		
		list.add("첫번째");
		list.add("세번째");
		list.add(1,"두번째");
//		list.clear();
		boolean bool = list.contains("네번째");
		
		list2 = new java.util.ArrayList();
		list2.add("첫번째");
		list2.add("세번째");
		list2.add("두번째");
		
		System.out.println(list == list2);
		System.out.println(list.equals(list2));
		System.out.println("-----------------------");
		
		System.out.println(list.get(1));
		System.out.println(list.hashCode());
		System.out.println(list2.hashCode());
		System.out.println("-----------------------");
		
		System.out.println(list.indexOf("두번째"));
		System.out.println(list.lastIndexOf("두번째")); // 거꾸로 찾는것일뿐 결과는 순서대로 나옴
		java.util.List list3 = new java.util.ArrayList();                    
		System.out.println(list.isEmpty());
		System.out.println(list3.isEmpty());
		System.out.println("-----------------------");
		
//		System.out.println(list.remove(1));
//		System.out.println(list.remove("두번째"));
		
		list3.add(1);
		list3.add(2);
		list3.add(3);
		list3.remove(1);
		
		list.set(1, "2번째");
		
		list3 = list.subList(0, 2);
		Object[] arr = list.toArray();
//		String[] arr1 = list.toArray(); // 배열은 객체 (오류 뜸)
		
		String[] arr2 = new String[list.size()];
		for(int i =0; i<list.size(); i++) {
			arr2[i] = (String)arr[i];			
		}
		
		System.out.println(list3.toString());
		System.out.println(bool);
		System.out.println(java.util.Arrays.toString(arr2));
	}

}
