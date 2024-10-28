package com.ex.step01;

public class Ex01 {
	
	public static void main(String[] args) throws Exception {
		Machine remote = null;
		//remote = new Tv();
		
		Class clz = Class.forName("com.ex.step01.Tv");
		remote = (Machine) clz.newInstance();
		
		remote.on();
		remote.work();
		remote.off();
	}
}
