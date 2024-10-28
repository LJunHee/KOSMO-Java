package com.day12;
import java.awt.*;

public class Ex15 {

	public static void main(String[] args) {
		Frame f = new Frame();
		f.setLayout(new FlowLayout());
		f.setSize(300, 400);
		f.setLocation(1000, 500);
		f.setVisible(true);
		
		CheckboxGroup group = new CheckboxGroup();
		Checkbox box1 = new Checkbox("check1",false, group);
		Checkbox box2 = new Checkbox("check2",true ,group);
		Checkbox box3 = new Checkbox("check3",false ,group);
		f.add(box1);
		f.add(box2);
		f.add(box3);
	}

}
