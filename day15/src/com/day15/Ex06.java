package com.day15;

import java.io.*;

public class Ex06 {

	public static void main(String[] args) {
		File src = new File("img01.jpg");
		File copy = new File("copy01.jpg");
		
		InputStream in = null;
		OutputStream out = null;
		byte[] buf = new byte[2];
		try {
			in = new FileInputStream(src);
			out = new FileOutputStream(copy);
			long before = System.currentTimeMillis();
			while(true) {
				int su = in.read(buf);
				if(su == -1) break;
				out.write(buf,0,su);
			}
			long after = System.currentTimeMillis();
			//No-Buffer : 3.562초
			//Buffer : 1.770초
			System.out.println("복사완료 : " + (after - before) + "ms");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
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
