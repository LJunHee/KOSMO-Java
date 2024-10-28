package com.day13;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Ex10 extends Frame implements ActionListener {
	// 컴포넌트 고유의 이벤트 실행
	TextField tf;
	Button btn;


	public Ex10() {
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
			
		});
		setLayout(new FlowLayout());
		btn = new Button("버튼");
		tf = new TextField(15);

		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button Click");
			}
		});
		
		tf.setEchoChar('#');
		tf.addActionListener(this);

		add(btn);
		add(tf);
		setBounds(1000, 500, 400, 300);
		setVisible(true);
	}


	public static void main(String[] args) {
		new Ex10();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == tf)
		    System.out.println("Call event.." + e.getActionCommand());
	}

}
