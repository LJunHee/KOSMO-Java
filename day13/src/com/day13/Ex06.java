package com.day13;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Ex06 extends Frame implements KeyListener {
	TextField tf;
	
	public Ex06() {
		setLayout(new FlowLayout());
		tf = new TextField(15);
		tf.addKeyListener(this);
		add(tf);
		
		setBounds(1000,500,500,400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex06();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.print("call keyTyped" + e.getKeyCode()+","+e.getKeyChar());
		System.out.println("-> " + tf.getText());
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.print("call keyPressed"+ e.getKeyCode()+","+e.getKeyChar());
		System.out.println("-> " + tf.getText());
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.print("call keyReleased"+ e.getKeyCode()+","+e.getKeyChar());
		System.out.println("-> " + tf.getText());
	}

}
