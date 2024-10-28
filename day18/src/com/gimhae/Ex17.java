package com.gimhae;

import java.awt.Frame;
import java.awt.Label;
import java.time.LocalTime;

public class Ex17 extends Frame{
	static Label la;
	public Ex17() {
		la=new Label();
		add(la);
		setBounds(-3840,100,100,100);
		setVisible(true);
	}

	public static void main(String[] args) throws InterruptedException {
		Ex17 me=new Ex17();
		Thread thr=new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0; i<10; i++) {
					la.setText(LocalTime.now()+"");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				me.dispose();
			}
		});
		thr.start();
	}

}














