package com.day15;

import java.util.Scanner;
import java.io.*;
public class Ex21 {

	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("unsu.txt");
		InputStream is = new FileInputStream(f);
		Scanner sc = new Scanner(is);
		String msg = null;
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
	}

}
