package com.gimhae;

public class Ex23 {
	static boolean boo=true;
	static boolean w=false;

	public static void main(String[] args) throws InterruptedException {
		Thread thr=new Thread(new Runnable() {
			
			public synchronized void func() {
				try {
					if(w)this.wait();
				} catch (InterruptedException e) {
					//e.printStackTrace();
				}
			}
			
			@Override
			public void run() {
				System.out.println("������ ����");
				while(boo) {
				func();
				}
				System.out.println("������ ����");
			}
		});
		
		thr.start();
		Thread.sleep(5000);
//		thr.interrupt();
		w=true;
	}

}
