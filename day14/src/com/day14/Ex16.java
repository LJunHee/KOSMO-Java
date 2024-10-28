package com.day14;
import java.io.*;

public class Ex16 {

	public static void main(String[] args) {
		File f = new File("target01.txt");
		InputStream in = null;
		byte[] buf = new byte[(int)f.length()];
		
		try {
			in = new FileInputStream(f);
			int cnt = 0;
			while(true) {
				int su = in.read();
				if(su == -1) break;
				buf[cnt++] = (byte) su;
			}
			System.out.println(new String(buf));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(in != null) in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
