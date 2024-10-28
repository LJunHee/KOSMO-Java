package com.day14;
import java.io.*;


public class Ex06 {

	public static void main(String[] args) throws IOException {
		File file;
		//상대 경로
//		file = new File("./ex01.txt");
		// 절대 경로
		file  = new File("C:\\");
//		file = new File("D:\\workspace\\day14\\ex01.txt");
		if(file.exists()) {
			System.out.println("디렉토리 " + file.isDirectory());
			System.out.println("파일 " + file.isFile());
			
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.getCanonicalPath());
			System.out.println("----------------------------");
			System.out.println(file.getParent());
			System.out.println(file.getName());
			System.out.println(file.canRead());
			System.out.println(file.canWrite());
			System.out.println(file.canExecute());
			System.out.println(file.length()+"byte");
			System.out.println(new java.util.Date(file.lastModified()));
			if(file.isDirectory()) {
				String[] ex = file.list();
				System.out.println(java.util.Arrays.toString(ex));
			}
			
			
		}
	}

}
