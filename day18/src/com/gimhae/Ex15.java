package com.gimhae;

public class Ex15 extends Thread{

	@Override
	public void run() {
//		String name=this.getName();
//		System.out.println(name);
		Thread thr2=Thread.currentThread();
		System.out.println(thr2.getName());
	}
	
	public static void main(String[] args) {
		Thread thr1=Thread.currentThread();
		System.out.println(thr1.getName());
		Ex15 me=new Ex15();
		me.start();
	}

}
