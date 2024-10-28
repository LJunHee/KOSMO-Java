package com.gimhae;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Ex03 {

	public static void main(String[] args) {
		TimeZone tz = TimeZone.getTimeZone("America/Los_Angeles");
//		GregorianCalendar cal=new GregorianCalendar(tz);
		GregorianCalendar cal=new GregorianCalendar(2002,5-1,1);
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		

	}

}
