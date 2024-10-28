package com.gimhae;

public class Ex16 implements Runnable {

	public static void main(String[] args) {
		Thread thr1=new Thread() {
			@Override
			public void run() {
				Thread thr1=Thread.currentThread();
				System.out.println(thr1.getName());
			}
		};
		Thread thr2=new Thread(new Ex16());
		Thread thr3=new Thread(new Runnable() {
			
			@Override
			public void run() {
				Thread thr1=Thread.currentThread();
				System.out.println(thr1.getName());
			}
		});
		Thread thr4=new Thread(()->System.out.println(Thread.currentThread().getName()));
		thr1.start();
		thr2.start();
		thr3.start();
		thr4.start();

		System.out.println("main start");
		System.out.println("main end");
	}

	@Override
	public void run() {
		Thread thr1=Thread.currentThread();
		System.out.println(thr1.getName());
	}

}
