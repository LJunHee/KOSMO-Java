package com.day12;
import java.awt.*;


public class Ex13 extends Frame {
	static TextField tf;
	public Ex13() {		
		setLayout(new FlowLayout());
		
		tf = new TextField("글자",15);
		add(tf);
		
		setSize(300,200);
		setLocation(1000,500);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex13();
		String msg = tf.getText();
		System.out.println(msg);
		System.out.println("글자");
	}

}
