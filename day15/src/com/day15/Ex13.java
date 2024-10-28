package com.day15;
import java.io.*;

public class Ex13 {

	public static void main(String[] args) {
		File f = new File("unsu.txt");
		
		try (
			InputStream in = new FileInputStream(f);
			InputStreamReader inr = new InputStreamReader(in,"UTF-8");
			BufferedReader bf = new BufferedReader(inr);
			) {
			while(true) {
				String msg = bf.readLine();
				if(msg==null) break;
				System.out.println(msg);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
