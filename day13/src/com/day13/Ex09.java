package com.day13;
import java.util.*;
import java.awt.*;
import java.awt.List;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Ex09 extends Frame implements ItemListener {

	public Ex09() {
		setLayout(new FlowLayout());
		Choice list1 = new Choice();
		list1.add("item1");
		list1.add("item2");
		list1.add("item3");
		list1.add("item4");
		list1.addItemListener(this);
		
		List list2 = new List(4,true);
		list2.add("item1");
		list2.add("item2");
		list2.add("item3");
		list2.add("item4");
		list2.addItemListener(this);
		
		add(list1);
		add(list2);
		setBounds(1000,500,400,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex09();
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		System.out.println(e.getItem());
		System.out.println(e.getSource());
		Object[] arr = e.getItemSelectable().getSelectedObjects();
		System.out.println(Arrays.toString(arr));
	}

}
