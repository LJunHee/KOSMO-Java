package com.day14;
import java.io.*;

public class Ex18 {

	public static void main(String[] args) {
		File f = new File("test02.txt");
		//문자열 스트림 2byte
		Reader fr = null;
		try {
			fr = new FileReader(f);
			while(true) {
				int su = fr.read();
				if(su == -1) break;
				System.out.println((char)su);				
			}
			System.out.println("읽기완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fr != null) fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
