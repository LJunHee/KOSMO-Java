package com.day15;
import java.io.*;
import java.util.*;


public class Ex22 {
	static File f = new File("test07.bin");

	public static void main(String[] args) {
		
		try(
			OutputStream os = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(os);
			) {
			String msg = "한글";
			oos.writeObject(msg);
			int[] arr1 = {1,3,5,7,9};
			oos.writeObject(arr1);
			List<Double> arr2 = new ArrayList<>();
			arr2.add(1.14);
			arr2.add(2.14);
			arr2.add(3.14);
			oos.writeObject(arr2);
			Set<Double> arr3 = new HashSet<>(arr2);
			oos.writeObject(arr3);
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
