package com.day14;

import java.io.*;
import java.util.*;

public class Ex11_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(">");
		String input = sc.nextLine();
		File f = new File(input); 
		String[] list = f.list();
		String path = null;
		try {
			path = f.getCanonicalPath();
		} catch (IOException e) {
			e.printStackTrace();
		}
		for(int i = 0; i<list.length; i++) {
			String msg = list[i];
			fileInfo(path + "\\" + msg);
		}
	}

	public static void fileInfo(String input) {
		File f = new File(input);
		if(f.exists()) {
			if(f.canRead()) System.out.print("r");
			else System.out.print("-");
			if(f.canWrite()) System.out.print("w");
			else System.out.print("-");
			if(f.canExecute()) System.out.print("x");
			else System.out.print("-");
			System.out.print("\t");
			Date day = new Date(f.lastModified());
			String time = day.toString().split(" ")[3];
			System.out.print(time);
			System.out.print("\t");
			if(f.isDirectory()) System.out.print("<DIR>");
			else System.out.print("\t");
			System.out.print("\t");
			if(f.isFile()) System.out.print(f.length());
			else System.out.print("\t");
			System.out.print("\t");
			System.out.println(f.getName());
		}
	}
}
