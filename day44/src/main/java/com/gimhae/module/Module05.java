package com.gimhae.module;

import java.util.List;

public class Module05 implements Module {
	List list;
	
	public void setList(List list) {
		this.list = list;
	}
	
	@Override
	public void func01() {
		for(int i=0; i<list.size(); i++) {
			System.out.println(i+":"+list.get(i));
		}
	}

}
