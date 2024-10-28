package com.day15;


import java.io.*;


public class Ex16 {

	public static void main(String[] args) {
		File f = new File("test05.bin");

		try (
		    InputStream in = new FileInputStream(f);
		    DataInputStream din = new DataInputStream(in);
		) {
			int su = din.read();
			int su2 = din.readInt();
			double su3 = din.readDouble();
			char su4 = din.readChar();
			boolean su5 = din.readBoolean();
			String msg = din.readUTF();
			
			System.out.println(su);
			System.out.println(su2);
			System.out.println(su3);
			System.out.println(su4);
			System.out.println(su5);
			System.out.println(msg);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
