package com.gimhae;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex06 {

	public static void main(String[] args) {
		Date d1=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yy M d hh:mm:ss");
		String msg=sdf.format(d1);
		System.out.println(msg);
	}

}
