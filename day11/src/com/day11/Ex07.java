package com.day11;


import java.util.*;
public class Ex07 {

	public static void main(String[] args) {
		Vector vec = new Vector();
		vec.addElement("첫번째");
		vec.addElement("두번째");
		vec.addElement("세번째");
		vec.addElement("네번째");
		for(int i = 0; i<vec.size(); i++) {
			System.out.println(vec.elementAt(i));
		}
		System.out.println("---------------------------------");
		Enumeration eles = vec.elements();
		while(eles.hasMoreElements()) {
			System.out.println(eles.nextElement());
		}
		System.out.println(eles.nextElement());
		System.out.println(eles.nextElement());
		Object obj = eles.nextElement();
		obj = "수정";
		System.out.println(eles.nextElement());
		
		eles = vec.elements();
		System.out.println(eles.nextElement());
		System.out.println(eles.nextElement());
		System.out.println(eles.nextElement());
		System.out.println(eles.nextElement());
	}
}

