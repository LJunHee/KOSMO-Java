package com.day15;
import java.io.*;
import java.util.*;


public class Ex23 {

	public static void main(String[] args) {
		
		try(
			InputStream is = new FileInputStream(Ex22.f);
			ObjectInputStream ois = new ObjectInputStream(is);
			) {
			String msg = (String) ois.readObject();
			int[] arr1 = (int[]) ois.readObject();
			List<Double> arr2 = (List<Double>) ois.readObject();
			Set<Double> arr3 = (Set<Double>) ois.readObject();
			
			System.out.println(msg);
			System.out.println(Arrays.toString(arr1));
			System.out.println(arr2);
			System.out.println(arr3);
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

}
