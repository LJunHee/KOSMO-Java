package com.day15;
import java.io.*;
public class Ex10 {

	public static void main(String[] args) {
		File src = new File("img01.jpg");
		File target = new File("copy.jpg");
		
		InputStream in = null;
		OutputStream out = null;
		BufferedInputStream bin = null;
		BufferedOutputStream bout = null;
		
		byte[] buf = new byte[2];
		try {
			in = new FileInputStream(src);
			out = new FileOutputStream(target);
			
			bin = new BufferedInputStream(in,2);
			bout = new BufferedOutputStream(out,2);
			long before = System.currentTimeMillis();
			while(true) {
				int su = bin.read(buf);
				if(su == -1) break;
				bout.write(buf,0,su);
			}
			long after = System.currentTimeMillis();
			System.out.println(after-before + "ms");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bout!=null) bin.close();
				if(bin!=null) bin.close();
				if(out!=null) bin.close();
				if(in!=null) in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
