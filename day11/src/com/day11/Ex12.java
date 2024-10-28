package com.day11;

import java.util.*;

class Car implements Comparable<Car> {
	String color;
	public Car(String color) {
		this.color = color;
	}
		
	@Override
	public String toString() {
		return color;
	}
	
	@Override
	public int compareTo(Car o) {
		return this.color.compareTo(o.color);
	}
}
public class Ex12 {

	public static void main(String[] args) {
		
		//중복검사
		Set<Car> set;
//		set = new HashSet<>();
//		set = new LinkedHashSet<>();
		set = new TreeSet<>();
		
		set.add(new Car("빨강"));
		set.add(new Car("주황"));
		set.add(new Car("빨강"));
		set.add(new Car("초록"));
//		set.add(1111);
//		set.add(2222);
//		set.add(2222);
//		set.add(3333);
//		set.add(4444);
		
		Iterator<Car> ite = set.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
	}

}
