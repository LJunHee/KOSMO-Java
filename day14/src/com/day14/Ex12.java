package com.day14;


import java.io.*;


public class Ex12 {

	public static void main(String[] args) {
		File f = new File("target01.txt");
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		///////////////////////////////////////
		String msg = "hello world~~!";
		OutputStream out = null;
		try {
			out = new FileOutputStream(f);
			for(int i = 0; i<msg.length(); i++) {
				out.write(msg.charAt(i));
			}
			System.out.println("작성완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(out !=null) out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
