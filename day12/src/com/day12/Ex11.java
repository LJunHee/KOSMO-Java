package com.day12;
import java.awt.*;

public class Ex11 extends Frame {
	
	public Ex11() {
		Panel p = new Panel();
		p.setLayout(null); //절대
		Button btn = new Button();
		btn.setLabel("버튼");
		btn.setLocation(100,100);
		btn.setSize(100,100);
		
		Button btn2 = new Button();
		btn.setLabel("버튼2");
		btn.setLocation(0,0);
		btn.setSize(100,100);
		
		p.add(btn);
		p.add(btn2);
		
		add(p);
		setSize(400,400);
		setLocation(1000,500);
		setVisible(true);
		setResizable(false);
	}
	
	public static void main(String[] args) {
		new Ex11();
	}

}
