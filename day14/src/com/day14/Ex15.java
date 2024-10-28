package com.day14;


import java.io.*;


public class Ex15 {

	public static void main(String[] args) {
		String msg = "한글 입력";
		byte[] arr1 = msg.getBytes();
		File f = new File("target01.txt");
		// 1byte
		OutputStream out = null;
		try {
			out = new FileOutputStream(f);
			for (int i = 0; i < arr1.length; i++) {
				out.write(arr1[i]);
				System.out.println("작성완료");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (out != null) out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
