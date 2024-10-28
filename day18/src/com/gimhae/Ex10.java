package com.gimhae;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) throws FileNotFoundException {
		File f=new File("target.txt");
//		InputStream is=new FileInputStream(f);
//		Scanner sc = new Scanner(is);
//		File f=new File("target.txt");
		Scanner sc=new Scanner(f);
	    while(sc.hasNextLine())
	    	System.out.println(sc.nextLine());
	}

}
