package com.day13;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Ex11 extends Frame implements ActionListener {

	TextField tf;


	public Ex11() {
		setLayout(new BorderLayout());
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});

		tf = new TextField();
		Font f = new Font(Font.SERIF, Font.BOLD, 20);
		tf.setFont(f);
		add(tf, BorderLayout.NORTH);

		Panel center = new Panel();
		center.setLayout(new GridLayout(4, 4));
		String[] arr1 = new String[] {
		                "Clear", "/", "*", "+",
		                "1", "2", "3", "-",
		                "4", "5", "6", "=",
		                "7", "8", "9", "0" };

		for (int i = 0; i < 16; i++) {
			Button btn = new Button(arr1[i]);
			btn.setFont(f);
			center.add(btn);
			btn.addActionListener(this);
		}

		add(center, BorderLayout.CENTER);
		setBounds(1000, 500, 500, 700);
		setVisible(true);
	}


	public static void main(String[] args) {
		new Ex11();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String msg = e.getActionCommand();
		String before = tf.getText();

		if (msg.equals("Clear")) {
			tf.setText("");
			return;
		}
		if (msg.equals("=")) {
			String[][] sus = new String[4][0];
			sus[0] = before.split("\\+");
			sus[1] = before.split("\\-");
			sus[2] = before.split("\\*");
			sus[3] = before.split("\\/");

			for (int i = 0; i < sus.length; i++) {
				String[] su = sus[i];
				if (su.length == 2) {
					switch (i) {
					case 0:
						tf.setText(Integer.parseInt(su[0]) + Integer.parseInt(su[1]) + "");
						break;
					case 1:
						tf.setText(Integer.parseInt(su[0]) - Integer.parseInt(su[1]) + "");
						break;
					case 2:
						tf.setText(Integer.parseInt(su[0]) * Integer.parseInt(su[1]) + "");
						break;
					case 3:
						tf.setText(div(Integer.parseInt(su[0]), Integer.parseInt(su[1])) + "");
						break;
					default:
						break;
					} // end switch
				} // end if
			} // end for
			return;
		}// end if length
		tf.setText(before + e.getActionCommand());
	}//end actionPerformed
	
	public Number div(int a, int b) {
		if(a % b == 0) {
			return a/b;
		} else {
			return a*1.0 / b;
		}
	}
} // end class
