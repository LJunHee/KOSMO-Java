package com.gimhae;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex22 implements Runnable{
	static Button[] btns;

	public static void main(String[] args) {
		Ex22 me=new Ex22();
		
		Thread thr=new Thread(me);
		Frame f=new Frame();
		f.setLayout(new GridLayout(1,4));
		btns=new Button[] {
				new Button("start"),
				new Button("stop"),
				new Button("resume"),
				new Button("suspend")
		};
		btns[0].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				thr.start();
			}
		});
		btns[1].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				thr.stop();
			}
		});
		btns[2].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				thr.resume();
			}
		});
		btns[3].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				thr.suspend();
			}
		});
		
		
		for(int i=0; i<btns.length; i++) {
			f.add(btns[i]);
		}
		f.setBounds(-3840, 50, 300, 150);
		f.setVisible(true);
	}

	@Override
	public void run() {
		while(true) {
			System.out.println("working..");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
