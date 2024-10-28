package day05;

public class Ex03 {

	public static void main(String[] args) {
		String msg = "01234-56789";
//		char[] arr1 = msg.toCharArray();
//		for(int i = 0; i<arr1.length; i++) {
//			System.out.println(arr1[i]);
//		}
		byte[] arr2 = msg.getBytes();
		for(int i = 0; i<arr2.length; i++) {
//			byte by = arr2[i];
//			char ch = (char) by;
//			System.out.println(ch + "," + by);
			System.out.println(arr2[i]);
		}
	}

}
