package com.gimhae.module;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Module07 implements Module {
	Map map;
	
	public void setMap(Map map) {
			this.map = map;
	}
	
	@Override
	public void func01() {
		Set entrys = map.entrySet();
		Iterator ite = entrys.iterator();
		while(ite.hasNext()) {
			Entry entry = (Entry) ite.next();
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}

}
