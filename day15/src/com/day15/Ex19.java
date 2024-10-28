package com.day15;


import java.io.*;


public class Ex19 {

	public static void main(String[] args) {
		File f = new File("test06.bin");

		try (
			Reader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
		) {
			String msg = null;
			while((msg = br.readLine()) != null) {
				System.out.println(msg);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
