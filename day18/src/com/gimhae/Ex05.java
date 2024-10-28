package com.gimhae;

import java.text.DateFormat;
import java.util.Date;

public class Ex05 {

	public static void main(String[] args) {
		Date d1=new Date();
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
//		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG);
//		DateFormat df = DateFormat.getDateInstance(DateFormat.DEFAULT);
//		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
		String myString = df.format(d1);
		
		System.out.println(myString);
	}

}
