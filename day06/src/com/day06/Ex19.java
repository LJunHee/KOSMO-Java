package com.day06;

import java.util.*;
/*
 * 주민번호 체크(ver 0.1.0)
 * 
 * 주민번호> 991231-1234567
 * 당신은 00세 남성입니다
 * ----------------------------
 * 주민번호> 1234561234567
 * 다음의 출력 포멧 000000-0000000으로 입력하세요
 * 주민번호< 123456-123456
 * 입력자리수가 부족합니다
 * 주민번호> a12345-1234567
 * 주민번호는 숫자로만 구성되어야 합니다.
 */
public class Ex19 {

	public static boolean checkSu(char ch) {
		if (ch < '0') return false;
		if (ch > '9') return false;
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final String VERSION = "0.3.0";
		String title = "주민번호 체크기(ver " + VERSION + ")";
		String menu = "주민번호 > ";
		String input = "";
		String gender = "남";
		String kor = "영일이삼사오육칠팔구";

		int age ;
		int changeYear = 1900;
		int year = 2024;
		
		System.out.println(title);
		while(true) {
			System.out.print(menu);
			input = sc.nextLine();

			if(input.length() != 14) {
				System.out.println("입력된 자리수가 맞지 않습니다.");
				continue;
			}
			else if(input.charAt(6) != '-') {
				System.out.println("다음의 출력 포멧 000000-0000000으로 입력하세요");
				continue;
			}
			
			//한글 확인
			String num = kor.replace("영일이삼사오육칠팔구", "0123456789");
			
			
			
			//성별 확인
			if(input.charAt(7) == '2' || input.charAt(7) == '4') gender = "여";
			
			//나이 확인
			changeYear += Integer.parseInt(input.substring(0,2));
			if (input.charAt(7) > '2') changeYear += 100;
			age = year - changeYear + 1;
			break;
		
		}
		System.out.println("당신은 " + age + "세 " + gender + "성 입니다.");
		System.out.println("이용해주셔서 감사합니다.");
	}
	
	public static String change(int num) {
		String[] kor = {"영","일","이","삼","사","오","육","칠","팔","구"};
		return kor[num];
	}

}
