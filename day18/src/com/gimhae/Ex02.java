package com.gimhae;

import java.util.Calendar;

public class Ex02 {

	public static void main(String[] args) {
		Calendar d1 = Calendar.getInstance();
		Calendar d2 = Calendar.getInstance();
		d2.set(2002, 2, 1);
		System.out.println(d1.before(d2));
		System.out.println(d1.after(d2));
		System.out.println(d2.compareTo(d1));
		java.util.Date d3=d2.getTime();
		System.out.println(d3);
		long d4=d2.getTimeInMillis();
		
	}

}
