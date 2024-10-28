package com.day14;


import java.io.*;


public class Ex13 {

	public static void main(String[] args) {
		File f = new File("target01.txt");
		InputStream in = null;
		try {
			in = new FileInputStream(f);
			while (true) {
				int su = in.read();
				if (su == -1) break;
				System.out.print((char) su);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null) in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

}
