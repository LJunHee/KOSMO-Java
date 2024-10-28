package com.day14;


import java.io.*;
import java.util.*;


/*
 * > D:\workspace\day14
2024-08-08  오전 11:37    <DIR>          .
2024-08-08  오전 09:05    <DIR>          ..
2024-08-08  오전 09:05               301 .classpath
2024-08-08  오전 09:05               381 .project
2024-08-08  오전 09:05    <DIR>          .settings
2024-08-08  오전 11:43    <DIR>          bin
2024-08-08  오전 09:05    <DIR>          src
 * 
 */
public class Ex11 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.print(">");
		File f = new File(sc.next());
		
		String[] fileList = f.list();
		
		if (f.exists() && f.isDirectory()) {
			for (int i = 0; i < fileList.length; i++) {
				if (f.canRead()) System.out.print("r");
				if (f.canWrite()) System.out.print("w");
				if (!f.canRead() || !f.canWrite()) System.out.print("-");
				System.out.print("\t");
				System.out.print(new Date(f.lastModified()));
				System.out.print("\t");
				if (f.isDirectory()) {
					System.out.print("<DIR>");
					System.out.print("\t");
				}
				System.out.print("바이트");
				System.out.println("\t" + fileList[i]);					
			}
		} else System.out.println("존재하지 않는 경로입니다.");

	}

}
