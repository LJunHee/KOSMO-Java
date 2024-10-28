package com.day15;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Ex02 extends Frame{

	public Ex02() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		setBounds(1000,500,500,600);
		setVisible(true);
	}
	public static void main(String[] args) {
		Ex02 me = new Ex02();
		me.newFrame();
	}
	
	public void newFrame() {
//		Dialog dia = new Dialog(this,"dialog",true);
		FileDialog dia = new FileDialog(this,"dialog",1);
		
//		dia.addWindowListener(new WindowAdapter() {
//			@Override
//			public void windowClosing(WindowEvent e) {
//				dia.dispose();
//			}
//		});
				
//		dia.setBounds(1000,300,300,200);
//		dia.setVisible(true);
		
		String dir = dia.getDirectory();
		String name = dia.getFile();
		System.out.println(dir+name);
	}

}
