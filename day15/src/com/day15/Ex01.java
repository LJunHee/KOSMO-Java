package com.day15;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Ex01 extends Frame implements ActionListener {

	public Ex01() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		setLayout(new FlowLayout());
		Button btn = new Button("새창 띄우기");
		btn.addActionListener(this);
		add(btn);
		setBounds(1000, 500, 500, 600);
		setVisible(true);
	}


	public static void main(String[] args) {
		new Ex01();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		Frame f2 = new Frame();
		f2.setBounds(1000, 300, 300, 200);
		f2.setVisible(true);
		f2.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				f2.dispose();
			}
		});
	}

}
