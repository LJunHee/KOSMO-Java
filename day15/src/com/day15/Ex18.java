package com.day15;


import java.io.*;


public class Ex18 {

	public static void main(String[] args) {
		File f = new File("test06.txt");

		try (
		    InputStream is = new FileInputStream(f);
		    PrintWriter pw = new PrintWriter(is);
		) {
			pw.write(65);
			pw.println(true);
			pw.println(1234);
			pw.println(3.14);
			pw.println("hello world");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
