package com.day14;
import java.io.*;


public class Ex09 {

	public static void main(String[] args) throws IOException {
		File f = new File("test01");
		boolean result = f.mkdir();
		
		if(result) {
			System.out.println("존재합니다");
		} else {
			System.out.println("파일을 만들었습니다." + result);
		}
	}

}
