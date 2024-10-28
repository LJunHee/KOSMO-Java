package com.day12;

public class Ex04 {
	static int su3 = 3333;
	int su4 = 4444;
	
	public static void func01() {
		Ex04 me = new Ex04();
		//~ 1.7 final 생략불가 
		// 1.8 ~ final 생략가능 
		final int su5 = 5555;
		
		class Local01 {
			final static int su1 = 1111;
			int su2 = 2222;
			public Local01() {
				
			}
			void func01() {
				System.out.println(su3);
				System.out.println(me.su4);
			}
			void func02() {
				System.out.println(su5);
			}
		}
		Local01 local = new Local01();
		System.out.println(Local01.su1);
		System.out.println(local.su2);
		local.func01();
		local.func02();
	}
	
	public void func02() {
		//상동
	}
	
	public static void func03(final int su) {
		class Local04{
			void func01() {
				System.out.println(su);
			}
		}
		Local04 local = new Local04();
		local.func01();
	}
	
	public static void main(String[] args) {
		func03(1111);
		func03(2222);
	}

}
