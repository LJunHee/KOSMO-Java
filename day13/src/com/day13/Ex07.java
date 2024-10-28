package com.day13;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Ex07 extends Frame implements KeyListener {
	Label la;
	
	public Ex07() {
		setLayout(null);
//		TextField tf = new TextField(10);
//		Button btn = new Button("버튼");
		la = new Label("★");
		la.setSize(50,50);
		la.setLocation(100, 100);
		this.addKeyListener(this);
		
//		add(tf);
//		add(btn);
		add(la);
		setBounds(1000,500,400,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex07();
	}
	@Override
	public void keyTyped(KeyEvent e) {
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode() == 39) {
			int x = this.getWidth();
			if(la.getX()+10<x-10) {
				la.setLocation(la.getX()+10, la.getY());				
			}
		}
		
		if(e.getKeyCode() == 37) {
			la.setLocation(la.getX()-10, la.getY());
		}
		
		if(e.getKeyCode() == 40) {
			la.setLocation(la.getX(), la.getY()+10);
		}
		
		if(e.getKeyCode() == 38) {
			la.setLocation(la.getX(), la.getY()-10);
		}
			
	}

}
