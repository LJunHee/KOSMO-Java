package com.day15;
import java.io.*;


public class Ex07 {

	public static void main(String[] args) {
		File f = new File("test.bin");
		
		Reader fr = null;
		char[] cbuf = new char[3];
		try {
			fr = new FileReader(f);
//			System.out.println(fr.read(cbuf));
			while(true) {
				int su = fr.read(cbuf);
				if(su==-1) break;
				System.out.println(new String(cbuf,0,su));
			}			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fr!=null) fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
