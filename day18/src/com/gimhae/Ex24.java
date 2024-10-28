package com.gimhae;

public class Ex24 {
	static Thread me=new Thread(new Runnable() {
		
		@Override
		public void run() {
			System.out.println("start");
			synchronized (me) {
				try {
					me.wait();
				} catch (InterruptedException e) {
				}
			}
			System.out.println("end");
		}
	});
	
	public static void func() {
		synchronized (me) {
			me.notifyAll();			
		}
	}
	public static void main(String[] args) throws InterruptedException {
		me.start();
		Thread.sleep(5000);
		func();
	}

}











