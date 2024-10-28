package com.day14;

import java.io.File;

public class Ex10 {

	public static void main(String[] args) {
		File f = new File("test01");
		
		boolean result = f.delete();
		System.out.println(result);
	}

}
