package com.day15;


import java.io.*;


public class Ex04 {
	static File f = new File("test.bin");

	public static void main(String[] args) {
		OutputStream out = null;
		try {
			f.createNewFile();
			out = new FileOutputStream(f);
			out.write("abcdefghijklmn".getBytes());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
