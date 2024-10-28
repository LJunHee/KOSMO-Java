package com.day15;

import java.util.*;
import java.io.*;


public class Ex05 {

	public static void main(String[] args) {
		File f = Ex04.f;
		InputStream in = null;
		byte[] buf = new byte[2];
		try {
			in = new FileInputStream(f);
			while(true) {
				int su = in.read(buf);
				if(su==-1) break;
				System.out.println(su);
				System.out.println(Arrays.toString(buf));
				System.out.println(new String(buf));				
			}
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
