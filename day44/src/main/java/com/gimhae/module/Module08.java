package com.gimhae.module;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class Module08 implements Module {
	Properties props;
	
	public void setProps(Properties props) {
		this.props = props;
	}
	
	@Override
	public void func01() {
		Set entrys = props.entrySet();
		Iterator ite = entrys.iterator();
		while(ite.hasNext()) {
			Entry entry = (Entry) ite.next();
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}

}
