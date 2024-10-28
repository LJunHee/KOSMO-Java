package com.gimhae;

public class Ex21 extends Thread{
	static int sum;
	int a,b;
//	static Object key=new Object();
	Object key;
	
	public Ex21(int a, int b, Object key) {
		this.a=a;
		this.b=b;
		this.key=key;
	}
	
//	public static synchronized void func(int i) {
	public void func(int i) {
		synchronized(key) {
			int su=i+sum;
			sum=su;
		}
	}
	
	@Override
		public void run() {
			for(int i=a; i<=b; i++) {
				func(i);
			}
			System.out.println(sum);
		}

	public static void main(String[] args) {
		int sum=0;
		for(int i=1; i<=500; i++) {
			sum+=i;
		}
		for(int i=501; i<=1000; i++) {
			sum+=i;
		}
		System.out.println(sum);
		System.out.println("--------------------------------");
		Object key=new Object();
		Ex21 me1=new Ex21(1, 500,key);
		Ex21 me2=new Ex21(501, 1000,key);
		me1.start();
		me2.start();
	}

}
