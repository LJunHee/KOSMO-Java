package com.gimhae;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex14 extends Frame implements ActionListener{
	
	
	public Ex14() {
		Button btn=new Button();
		btn.addActionListener(this);
		add(btn);
		setBounds(-3840,100,200,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex14();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		System.out.println("Ŭ��");
	}

}
