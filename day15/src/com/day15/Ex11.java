package com.day15;
import java.io.*;
import java.nio.charset.Charset;
public class Ex11 {

	public static void main(String[] args) {
		File f = new File("unsu.txt");
		
		Reader fr = null;
		BufferedReader br = null;
		
		byte[] buf = new byte[2];
		try {
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			while(true) {
				int su = br.read();
				if(su==-1) break;
				System.out.print((char)(su));
			}
//			long before = System.currentTimeMillis();
//			long after = System.currentTimeMillis();
//			System.out.println(after-before + "ms");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br!=null) br.close();
				if(fr!=null) fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
