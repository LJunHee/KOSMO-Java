package com.day08;


public class Ex12 {
	int a = 111;
	String msg = "abcd";
	
	public Ex12() {}
	public Ex12(int a) {}
	
	//자바 리플렉션
	public static void main(String[] args) throws Exception {
		Ex12 me = new Ex12();
		Class clz = me.getClass();
		Class clz2 = Ex12.class;
		Class clz3 = Class.forName(clz.getName());
		Class clz4 = Class.forName("com.day08.Ex12");
		
		System.out.println(clz.getName());
		System.out.println(clz.getCanonicalName());
		System.out.println(clz.getTypeName());
		System.out.println(java.util.Arrays.toString(clz.getAnnotations()));
		System.out.println(java.util.Arrays.toString(clz.getConstructors()));
		System.out.println(java.util.Arrays.toString(clz.getDeclaredAnnotations()));
		System.out.println(java.util.Arrays.toString(clz.getDeclaredConstructors()));
		System.out.println(java.util.Arrays.toString(clz.getDeclaredFields()));
		System.out.println(java.util.Arrays.toString(clz.getDeclaredMethods()));
		Object obj = clz.newInstance();
		System.out.println(((Ex12)obj).msg);
	}
}
