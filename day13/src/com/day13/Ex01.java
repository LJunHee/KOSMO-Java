package com.day13;
import java.awt.*;

public class Ex01 extends Frame {
	public Ex01() {
		Toolkit kit = Toolkit.getDefaultToolkit();
//		kit.beep();
		Dimension screen = kit.getScreenSize();
		int scrW,scrH;
		scrW = screen.width;
		scrH = screen.height;
		System.out.println(scrW+","+scrH);
		
		Dimension app = new Dimension(300,400);
		
		this.setSize(app);
		this.setLocation(scrW/2-300/2, scrH/2-400/2);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
