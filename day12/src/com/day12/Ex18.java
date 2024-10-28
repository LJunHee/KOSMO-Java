package com.day12;
import java.awt.*;

public class Ex18 extends Frame {
	public Ex18() {

		Font f = new Font("Ravie", 1,20); //글꼴명,굵기,크기
		LayoutManager lm = new GridLayout(5,4,10,10); // 열,행
		this.setLayout(lm);
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
		TextField text = new TextField();
		
		text.setBounds(8, 10, 270, 70);
		
		this.add(text);
//		this.add(btn13);
//		this.add(btn14);
//		this.add(btn15);
//		this.add(btn16);
//		this.add(btn07);
//		this.add(btn08);
//		this.add(btn09);
//		this.add(btn12);
//		this.add(btn04);
//		this.add(btn05);
//		this.add(btn06);
//		this.add(btn11);
//		this.add(btn01);
//		this.add(btn02);
//		this.add(btn03);
//		this.add(btn10);
		
		
		this.setLocation(1000, 500);
		this.setSize(500,800);
		this.setVisible(true);
	}

	public static void main(String[] args) {

		Ex18 me = new Ex18();
	}

}
