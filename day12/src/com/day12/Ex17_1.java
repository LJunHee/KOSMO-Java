package com.day12;
import java.awt.*;


//GridBagLayout
public class Ex17_1 extends Frame {

	public Ex17_1() {
		LayoutManager lm = new GridBagLayout();
		setLayout(lm);
		
		Panel p1 = new Panel();
		Panel p2 = new Panel();
		Panel p3 = new Panel();
		Panel p4 = new Panel();
		
		Button btn01 = new Button("1");
		Button btn02 = new Button("2");
		Button btn03 = new Button("3");
		Button btn04 = new Button("4");
		Button btn05 = new Button("5");
		Button btn06 = new Button("6");
		Button btn07 = new Button("7");
		Button btn08 = new Button("8");
		Button btn09 = new Button("9");
		Button btn10 = new Button("0");
		Button btn11 = new Button("=");
		Button btn12 = new Button("-");
		Button btn13 = new Button("+");
		Button btn14 = new Button("*");
		Button btn15 = new Button("/");
		Button btn16 = new Button("clear");
		
		TextArea text = new TextArea("",1,50,3);
		
		text.setFont(new Font("",1,50));
		
		p1.setLayout(new GridLayout(1,4,10,10));
		p1.add(btn01);
		p1.add(btn02);
		p1.add(btn03);
		p1.add(btn10);
		
		p2.setLayout(new GridLayout(1,4,10,10));
		p2.add(btn04);
		p2.add(btn05);
		p2.add(btn06);
		p2.add(btn11);
		
		p3.setLayout(new GridLayout(1,4,10,10));
		p3.add(btn07);
		p3.add(btn08);
		p3.add(btn09);
		p3.add(btn12);
		
		p4.setLayout(new GridLayout(1,4,10,10));
		p4.add(btn16);
		p4.add(btn15);
		p4.add(btn14);
		p4.add(btn13);

		
		GridBagConstraints bag = new GridBagConstraints();
		bag.fill = GridBagConstraints.BOTH;
		bag.insets = new Insets(10, 10, 10, 10);
		bag.gridwidth = 1;
		bag.gridheight = 1;
		bag.weightx = 1.0;
		bag.weighty = 1.0;
		
		bag.gridx = 0;
		bag.gridy = 0;
		add(text,bag);
		

		bag.gridx = 0;
		bag.gridy = 1;
		add(p4,bag);
		bag.gridx = 1;

		
		bag.gridx = 0;
		bag.gridy = 2;
		add(p3,bag);
		bag.gridx = 1;

		bag.gridx = 0;
		bag.gridy = 3;
		add(p2,bag);
		bag.gridx = 1;

		
		bag.gridwidth = 1;
		bag.gridheight = 1;
		bag.gridx = 0;
		bag.gridy = 4;
		add(p1,bag);
		bag.gridx = 1;

		
		
		
		setSize(500,700);
		setLocation(1000,500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ex17_1 me = new Ex17_1();
	}

}
