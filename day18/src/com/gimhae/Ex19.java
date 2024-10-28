package com.gimhae;

public class Ex19 extends Thread {
	
	@Override
	public void run() {
		for(int i=0; i<1000000; i++) {
			new String(i+"");
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int i=0; i<1000000; i++) {
			new String(i+"");
		}
	}

	public static void main(String[] args) {
		Ex19 me = new Ex19();
		Thread thr=new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true) {
					if(me.getState()==Thread.State.NEW) {
						System.out.println("new");
					}
					if(me.getState()==Thread.State.RUNNABLE) {
						System.out.println("runnable");
					}
					if(me.getState()==Thread.State.WAITING) {
						System.out.println("waiting...");
					}
					if(me.getState()==Thread.State.TIMED_WAITING) {
						System.out.println("sleep...");
					}
					if(me.getState()==Thread.State.TERMINATED) {
						System.out.println("end");
					}
				}
				
			}
		});
		thr.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		me.start();
	}

}
