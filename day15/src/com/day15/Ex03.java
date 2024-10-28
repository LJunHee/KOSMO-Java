package com.day15;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

public class Ex03 {

	public static void main(String[] args) {
		Frame f = new Frame();
		f.setTitle("제목");
		Image img2 = Toolkit.getDefaultToolkit().createImage("logo.jpg");
		ImageIcon icon = new ImageIcon("logo.jpg");
		Image img = icon.getImage();
		f.setIconImage(img2);
		
		MenuBar mb = new MenuBar();
		Menu m1 = new Menu();
		Menu m2 = new Menu();
		m1.setLabel("메뉴1");
		m2.setLabel("메뉴2");
		Menu mi3 = new Menu("2두번째");
		
		MenuItem mi1 = new MenuItem("첫번째");
		MenuItem mi2 = new MenuItem("두번째");
		MenuItem mi4 = new MenuItem("2첫번째");
		MenuItem mi5 = new MenuItem("2두번째");
		
		MenuItem mi6 = new MenuItem("3첫번째");
		m1.add(mi1);
		m1.add(mi2);
		m2.add(mi3);
		m2.add(mi4);
		m2.add(mi5);
		mi3.add(mi6);
		
		mi1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("메뉴 선택");
			}
		});
		mb.add(m1);
		mb.add(m2);
		f.setMenuBar(mb);
		
		f.setSize(500,300);
		f.setLocation(1000, 500);
		f.setVisible(true);
	}

}
