package com.day15;


import java.io.*;


public class Ex17 {

	public static void main(String[] args) {
		File f = new File("test06.bin");

		try (
		    OutputStream out = new FileOutputStream(f);
		    PrintStream ps = new PrintStream(out);
		) {
			ps.write(65);
			ps.println(true);
			ps.println(1234);
			ps.println(3.14);
			ps.println("hello world");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
