package com.gimhae.module;

import java.util.Iterator;
import java.util.Set;

public class Module06 implements Module {
	Set set;

	public void setSet(Set set) {
		this.set = set;
	}
	
	@Override
	public void func01() {
		Iterator ite = set.iterator();
		while(ite.hasNext()	) {
			System.out.println(ite.next());
		}
	}

}
