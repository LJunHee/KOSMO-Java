package com.day15;
import java.io.*;

public class Ex09 {

	public static void main(String[] args) {
		File f = new File("test02.bin");
		String msg = "한글로 작성해도 결과는 동일";
		byte[] msgs = msg.getBytes();
		
		OutputStream out = null;
		BufferedOutputStream bout = null;
		try {
			out = new FileOutputStream(f);
			bout = new BufferedOutputStream(out);
			
			for(int i =0; i<msg.length(); i++) {
				bout.write(msgs[i]);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bout!=null) bout.close();
				if(out!=null) out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
