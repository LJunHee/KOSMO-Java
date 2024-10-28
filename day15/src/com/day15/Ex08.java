package com.day15;
import java.io.*;

public class Ex08 {

	public static void main(String[] args) {
		File f = new File("test.bin");
		
		InputStream in = null;
		BufferedInputStream bin = null;
		try {
			in = new FileInputStream(f);
			bin = new BufferedInputStream(in);
			while(true) {
				int su = bin.read();
				if(su == -1) break;
				System.out.println((char)su);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bin!=null) bin.close();
				if(in!=null) in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
