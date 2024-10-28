package com.day14;

class IDException extends Exception {
	public IDException() {
		super("중복아이디");
	}
}

public class Ex05 {

	public static void main(String[] args) {
		try {
			func01();
		} catch (IDException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void func01() throws IDException {
		throw new IDException();
	}

}
