package com.day12;
import java.awt.*;
import javax.swing.*;

public class Ex12 {

	public static void main(String[] args) {
		Frame f = new Frame();
		
		Panel p = new Panel();
//		p.setLayout(new FlowLayout());
		p.setBackground(Color.pink);
		
		Button btn = new Button("btn");
		Font font = Font.getFont(Font.SANS_SERIF);
		btn.setFont(font);
		btn.setBackground(Color.blue);
		btn.setForeground(Color.white);
		p.add(btn);
		
		JButton btn2 = new JButton("스윙버튼");
		btn2.setFont(Font.getFont("궁서체"));
		Icon defaultIcon  = new ImageIcon("logo.jpg");
		btn2.setIcon(defaultIcon);
		
		p.add(btn2);
		f.add(p);
		f.setTitle("제목없음");
		f.setSize(500,200);
		f.setLocation(1000, 500);
		f.setVisible(true);
	}

}
