package com.day15;


import java.io.*;


public class Ex14 {

	public static void main(String[] args) {
		File f = new File("test04.txt");

		try (
		    OutputStream out = new FileOutputStream(f);
		    OutputStreamWriter outw = new OutputStreamWriter(out,"UTF-8");
		) {
			outw.write("hello world 한글도 가능");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
