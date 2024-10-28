package com.gimhae.module;

import java.util.Date;

public class Module03 implements Module {
	Date date;

	public void setDate(Date date) {
		this.date = date;
	}
	
	@Override
	public void func01() {
		System.out.println(date);
	}
	

}
