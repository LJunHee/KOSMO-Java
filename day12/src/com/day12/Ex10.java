package com.day12;
import java.awt.*;


//GridBagLayout
public class Ex10 extends Frame {

	public Ex10() {
		LayoutManager lm = new GridBagLayout();
		setLayout(lm);
		
		Button btn1 = new Button();
		Button btn2 = new Button();
		Button btn3 = new Button();
		Button btn4 = new Button();
		Button btn5 = new Button();
		Button btn6 = new Button();
		
		btn1.setLabel("btn1");
		btn2.setLabel("btn2");
		btn3.setLabel("btn3");
		btn4.setLabel("btn4");
		btn5.setLabel("btn5");
		btn6.setLabel("btn6");
		
		GridBagConstraints bag = new GridBagConstraints();
		bag.fill = 5;
		bag.gridwidth = 1;
		bag.gridheight = 1;
		bag.weightx = 1.0;
		bag.weighty = 1.0;
		
		bag.gridx = 0;
		bag.gridy = 0;
		add(btn1,bag);
		bag.gridx = 1;
		add(btn2,bag);
		bag.gridx = 2;
		add(btn3,bag);
		bag.gridx = 0;
		bag.gridy = 1;
		add(btn4,bag);
		bag.gridx = 1;
		add(btn5,bag);
		bag.gridx = 2;
		add(btn6,bag);
		bag.gridx = 3;
		
		setSize(500,400);
		setLocation(1000,500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ex10 me = new Ex10();
	}

}
