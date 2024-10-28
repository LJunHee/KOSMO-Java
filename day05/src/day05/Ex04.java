package day05;

public class Ex04 {
	public static void main(String[] args) {
		String[] arr1 = new String[3];
		arr1[0] = "item1";
		arr1[1] = "item2";
		arr1[2] = "item3";
		String[] arr2 = new String[] { "Item1", "Item2", "Item3" };
		String[] arr3 = { "Item1", "Item2", "Item3" };
		
		
		for(int i=0; i<arr3.length; i++) {
			System.out.println(arr3[i]);
		}
	}

}
