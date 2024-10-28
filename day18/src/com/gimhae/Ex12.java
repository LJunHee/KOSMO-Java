package com.gimhae;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Ex12 {

	public static void main(String[] args) throws Exception {
		Properties props=new Properties();
		props.setProperty("key1", "val1");
		props.setProperty("key2", "val2");
		props.setProperty("key3", "val3");
		
		System.out.println(props.getProperty("key1"));
		System.out.println(props.getProperty("key2"));
		System.out.println(props.getProperty("key3"));

		Properties pros=System.getProperties();
		Set set=pros.entrySet();
		Iterator ite = set.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		System.out.println("-----------------------------");
		InputStream is=new FileInputStream(new File("target2.properties"));
		Properties pro2=new Properties();
		pro2.load(is);
		System.out.println(pro2.getProperty("key1"));
		System.out.println(pro2.getProperty("key2"));
		System.out.println(pro2.getProperty("key3"));
	}

}








