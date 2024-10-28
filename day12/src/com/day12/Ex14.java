package com.day12;
import java.awt.*;


public class Ex14 {

	public static void main(String[] args) {
		Frame f = new Frame();
		f.setLayout(new FlowLayout());
		
		TextArea ta = new TextArea("초기값",5,15,TextArea.SCROLLBARS_VERTICAL_ONLY);		
		ta.setFont(new Font("",2,20));
		ta.setBackground(Color.gray);
		ta.setForeground(Color.red);
		
		f.add(ta);
		
		f.setSize(400, 300);
		f.setLocation(1000, 500);
		f.setVisible(true);
	}

}
