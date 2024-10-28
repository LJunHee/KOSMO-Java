	package com.day13;


	import java.awt.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;


	public class Ex12 extends Frame implements ActionListener {
		public Ex12() {
			LayoutManager mgr = new GridBagLayout();
	//		LayoutManager mgr = new GridLayout(5, 4);
			setLayout(mgr);

			Button[][] btns = new Button[5][];

			String[][] msg = {
							{"Num","-","*","-"},
							{"7","8","9","+"},
							{"4","5","6"},
							{"1","2","3","Enter"},
							{"0","."} };
			GridBagConstraints bag = new GridBagConstraints();
			bag.fill = GridBagConstraints.BOTH;
			for (int i = 0; i < btns.length; i++) {
				btns[i] = new Button[msg[i].length];
				for(int j = 0; j<btns[i].length; j++) {
					bag.gridwidth = 1;
					bag.gridheight = 1;
					bag.weightx = 1.0;
					bag.weighty = 1.0;
					if(j==3 && i == 1) bag.gridheight = 2;
					if(j==0 && i == 4) bag.gridwidth = 2;
					btns[i][j] = new Button(msg[i][j]);
					bag.gridx = j;
					bag.gridy = i;
					if(j==1 && i == 4) {
						bag.gridwidth = 2;
						bag.gridx = 2;
					}
					add(btns[i][j],bag);
				}
			}

			setBounds(1000, 500, 300, 400);
			setVisible(true);
		}


		public void func(GridBagConstraints bag, int x, int y, int h) {

		}


		public static void main(String[] args) {
			new Ex12();
		}


		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub

		}

	}
