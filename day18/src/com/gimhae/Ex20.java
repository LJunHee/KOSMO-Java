package com.gimhae;

public class Ex20 extends Thread{
	String name;
	
	public Ex20(String name) {
		this.name=name;
	}
	
	@Override
		public void run() {
			System.out.println(name+":"+this.getPriority());
			for(int i=0; i<10; i++) {
				System.out.println(name+" working..."+i);
			}
		}

	public static void main(String[] args) {
		Ex20 me1=new Ex20("ù��°");
		Ex20 me2=new Ex20("�ι�°");
		Ex20 me3=new Ex20("����°");
		me1.setPriority(Thread.MAX_PRIORITY);		//10
		me2.setPriority(Thread.NORM_PRIORITY);		//5
		me3.setPriority(Thread.MIN_PRIORITY);		//1
		me1.start();
		me2.start();
		me3.start();
	}

}
