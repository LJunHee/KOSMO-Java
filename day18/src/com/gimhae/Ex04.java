package com.gimhae;

import java.util.Date;

public class Ex04 {

	public static void main(String[] args) {
		long a1=System.currentTimeMillis();	// 1970 1 1
		java.util.Date d1=new Date(a1);		// 1900 1 1 ����
//		d1.setYear(2025-1900);
//		d1.setMonth(5-1);
		System.out.println(d1.toString());
		System.out.println(d1.getYear()+"��\t"+(1900+d1.getYear())+"��");
		System.out.println(d1.getMonth()+"��\t"+(1+d1.getMonth())+"��");
		System.out.println(d1.getDate()+"��");
		System.out.println(d1.getDay()+"����");// 0~6
		System.out.println(d1.getHours()+"��");
		System.out.println(d1.getMinutes()+"��");
		System.out.println(d1.getSeconds()+"��");
		long a2=d1.getTime();
	}

}
