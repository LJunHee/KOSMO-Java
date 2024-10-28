package com.day15;


import java.io.*;


public class Ex15 {

	public static void main(String[] args) {
		File f = new File("test05.bin");
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try (
		    OutputStream out = new FileOutputStream(f);
		    DataOutputStream dout = new DataOutputStream(out);
		) {
			dout.write(65);
			int su = 1234;
			dout.writeInt(su);
			double su2 = 3.14;
			dout.writeDouble(su2);
			char su3 = '@';
			dout.writeChar(su3);
			boolean su4 = true;
			dout.writeBoolean(su4);
			String msg = "hello";
			dout.writeUTF(msg);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
