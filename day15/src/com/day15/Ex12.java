package com.day15;
import java.io.*;
import java.util.*;

public class Ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		File f = new File("test04.txt");
		Writer fw = null;
		BufferedWriter bw = null;
		
		try {
			f.createNewFile();
			fw = new FileWriter(f);
			bw = new BufferedWriter(fw);
			for(int i =0; i<4; i++) {
				bw.write(sc.nextLine());
				bw.newLine(); //개행
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bw!=null) bw.close();
				if(fw!=null) fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
