package com.gimhae;

public class Ex25 extends Thread{
	
	@Override
	public void run() {
		System.out.println(this.getName()+" start");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(this.getName()+" end");
	}

	public static void main(String[] args) throws InterruptedException {
		System.out.println("main start");
		Ex25 me=new Ex25();
		Ex25 me2=new Ex25();
		me.setDaemon(true);
		me2.setDaemon(true);
		me.start();
		me2.start();
		me.join(1000);
		
		System.out.println("main end");

	}

}
