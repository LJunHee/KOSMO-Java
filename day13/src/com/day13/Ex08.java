package com.day13;
import java.awt.*;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class Ex08 extends Frame implements TextListener {
//	TextField tf;
	
	public Ex08() {
		setLayout(new FlowLayout());
		TextField tf = new TextField(16);
		tf.addTextListener(this);
		
		add(tf);
		setBounds(1000,500,300,400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex08();
	}
	
	@Override
	public void textValueChanged(TextEvent e) {
		TextField tf = (TextField) e.getSource();
		System.out.println(tf.getText());
	}

}
