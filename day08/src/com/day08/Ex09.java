package com.day08;

public class Ex09 implements Cloneable {

	public static void main(String[] args) throws CloneNotSupportedException {
		Ex09 me = new Ex09();
		Object obj = me.clone();
		System.out.println(me);
		System.out.println(obj);
	}

}
