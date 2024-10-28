package com.gimhae;

import java.util.Calendar;

public class Ex01 {

	public static String func1(int su) {
		String msg="��";
		switch (su) {
		case Calendar.JANUARY: msg=1+msg;break;
		case Calendar.FEBRUARY:msg=2+msg;break;
		case Calendar.MARCH:msg=3+msg;break;
		case Calendar.APRIL:msg=4+msg;break;
		case Calendar.MAY:msg=5+msg;break;
		case Calendar.JUNE:msg=6+msg;break;
		case Calendar.JULY:msg=7+msg;break;
		case Calendar.AUGUST:msg=8+msg;break;
		case Calendar.SEPTEMBER:msg=9+msg;break;
		case Calendar.OCTOBER:msg=10+msg;break;
		case Calendar.NOVEMBER:msg=11+msg;break;
		case Calendar.DECEMBER:msg=12+msg;break;
		default:
			break;
		}
		return msg;
	}
	
	public static void main(String[] args) {
		Calendar rightNow = Calendar.getInstance();
		
//		rightNow.set(2002, 5-1, 1);
		
		System.out.print(rightNow.get(Calendar.YEAR)+"��");
		System.out.print(func1(rightNow.get(Calendar.MONTH)));	// 0~11 -> 1~12
//		System.out.print(1+rightNow.get(Calendar.MONTH)+"��");	// 0~11 -> 1~12
		System.out.print(rightNow.get(Calendar.DATE)+"��");
		System.out.print(rightNow.get(Calendar.DAY_OF_MONTH)+"��");
		System.out.print(rightNow.get(Calendar.WEEK_OF_MONTH)+"����(��)");	// 
		System.out.print(rightNow.get(Calendar.WEEK_OF_YEAR)+"����(��)");	// 
		System.out.print(rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.FRIDAY);// 1~7
		switch (rightNow.get(Calendar.AM_PM)) {
		case Calendar.AM:
			System.out.print(" ����");
			break;

		case Calendar.PM:
			System.out.print(" ����");
			break;
		};
		System.out.print(rightNow.get(Calendar.HOUR)+"��(0~11)");
		System.out.print(rightNow.get(Calendar.HOUR_OF_DAY)+"��(0~23)");
		System.out.print(rightNow.get(Calendar.MINUTE)+"��");
		System.out.println(rightNow.get(Calendar.SECOND)+"��");

	}

}
