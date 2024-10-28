package com.day14;
import java.io.*;

public class Ex17 {

	public static void main(String[] args) {
		File f = new File("test02.txt");
		//문자열 스트림 2byte
		Writer fw = null;
		try {
			fw = new FileWriter(f);
			fw.write('한');
			fw.write('글');
			fw.write('도');
			fw.write(' ');
			fw.write('문');
			fw.write('제');
			fw.write('없');
			fw.write('음');
			System.out.println("작성완료");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fw != null) fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
