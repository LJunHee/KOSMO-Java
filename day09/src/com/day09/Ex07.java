package com.day09;

public class Ex07 {

	public static void main(String[] args) {
		char ch1 = 'A';
		Character ch2 = new Character(ch1);
		Character ch3 = new Character((char)97);
		Character ch4 = new Character('a');
		
		char ch5 = 'a';
		System.out.println("자바에서 사용가능 문자냐" + Character.isAlphabetic(ch5));
		System.out.println("자바에서 사용가능 문자냐" + Character.isJavaLetter(ch5));
		System.out.println("문자냐" + Character.isAlphabetic(ch5));
		System.out.println("숫자냐" + Character.isDigit(ch5));
		System.out.println("공백이냐" + Character.isSpace(ch5));
		System.out.println("공백이냐" + Character.isWhitespace(ch5));
		System.out.println("공백이냐" + Character.isWhitespace(ch5));
		System.out.println(ch3);
	}

}
