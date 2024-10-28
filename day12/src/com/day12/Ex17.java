package com.day12;
import java.awt.*;


//GridBagLayout
public class Ex17 extends Frame {

	public Ex17() {
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

		
		GridBagConstraints bag = new GridBagConstraints();
		bag.fill = GridBagConstraints.BOTH;
		bag.insets = new Insets(10,10,10,10);
		bag.gridwidth = 5;
		bag.gridheight = 1;
		bag.weightx = 1.0;
		bag.weighty = 1.0;
		
		bag.gridx = 0;
		bag.gridy = 0;
		add(text,bag);
		
		bag.gridwidth = 1;
		bag.gridheight = 1;
		bag.gridx = 0;
		bag.gridy = 4;
		add(btn01,bag);
		bag.gridx = 1;

		add(btn02,bag);
		bag.gridx = 2;
		add(btn03,bag);
		bag.gridx = 3;
		add(btn10,bag);
		
		bag.gridx = 0;
		bag.gridy = 3;
		add(btn04,bag);
		bag.gridx = 1;
		add(btn05,bag);
		bag.gridx = 2;
		add(btn06,bag);
		bag.gridx = 3;
		add(btn11,bag);
		bag.gridx = 4;
		
		bag.gridx = 0;
		bag.gridy = 2;
		add(btn07,bag);
		bag.gridx = 1;
		add(btn08,bag);
		bag.gridx = 2;
		add(btn09,bag);
		bag.gridx = 3;
		add(btn12,bag);
		bag.gridx = 4;
		
		bag.gridwidth = 1;
		bag.gridheight = 1;
		bag.gridx = 0;
		bag.gridy = 1;
		add(btn16,bag);
		bag.gridx = 1;
		add(btn15,bag);
		bag.gridx = 2;
		add(btn14,bag);
		bag.gridx = 3;
		add(btn13,bag);
		bag.gridx = 4;
		
		
		
		setSize(500,700);
		setLocation(1000,500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ex17 me = new Ex17();
	}

}
