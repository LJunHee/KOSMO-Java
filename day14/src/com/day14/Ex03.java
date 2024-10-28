package com.day14;


public class Ex03 {

	public static void main(String[] args) throws CloneNotSupportedException {
		try {
			func01();			
		} catch (CloneNotSupportedException e) {
			
		}
	}


	public static void func01() throws CloneNotSupportedException {
		func02();
		System.out.println("end func01");
	}


	public static void func02() throws CloneNotSupportedException {
//		try {
//			int su = 1 / 0;
//		} catch (ArithmeticException e) {
//			e.printStackTrace();
////			System.out.println(e.getClass());
////			System.out.println(e.getMessage());
//		}
//		System.out.println("ArithmeticException 예외 처리됨 (end func02)");
		
		Ex03 me = new Ex03();
		Object obj = me.clone();
	}

}
