package com.day15;


import java.io.*;


public class Ex20 {

	public static void main(String[] args) {
		PrintStream myout = System.out;
		myout.println("출력");
		InputStream myin = System.in;
		try (
		    InputStreamReader isr = new InputStreamReader(myin);
		    BufferedReader br = new BufferedReader(isr);
		) {
			System.out.println(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
