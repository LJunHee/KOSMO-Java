package com.day14;
import java.io.*;


public class Ex08 {

	public static void main(String[] args) throws IOException {
		File f = new File("test01/ex01.txt");
		
		if(f.exists()) {
			System.out.println("존재합니다");
		} else {
			boolean result = f.createNewFile();
			System.out.println("파일을 만들었습니다." + result);
		}
	}

}
