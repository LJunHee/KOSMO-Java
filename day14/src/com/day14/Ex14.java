package com.day14;
import java.io.*;


public class Ex14 {

	public static void main(String[] args) {
		File src = new File("img01.jpg");
		File copy = new File("copy01.jpg");
		
		InputStream in = null;
		OutputStream out = null;
		
		try {
			copy.createNewFile();
			in = new FileInputStream(src);
			out = new FileOutputStream(copy);
			int su = -1;
			long before = System.currentTimeMillis();
			while(true) {
				su = in.read();
				if(su == -1) break;
				out.write(su);
			}
			long after = System.currentTimeMillis();
			System.out.println("복사완료" + (after - before) + "ms");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {			
			 try {
				if(in != null) in.close();
				if(out != null) out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
