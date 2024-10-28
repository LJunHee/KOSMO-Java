package com.day08;

class Lec08 extends Object implements Cloneable{
	int su = 1111;
	void func() {
		System.out.println(su);
	}
}

public class Ex08 {

	public static void main(String[] args) extends Lec08 {
		int[] arr = {1,3,5,7};
		Object obj1 = arr.clone();
		Lec08 lec1 = new Lec08();
		Object obj2 = lec1.clone();
		
	}
}

