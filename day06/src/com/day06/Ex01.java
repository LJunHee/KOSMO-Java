package com.day06;
/*
 * 숫자 변환 메서드 추가
 */


import java.util.*;


public class Ex01 {
	public static int changeSu(char ch) {
		if (ch == '-') return '-';
		return ch - '0';
	}


	public static boolean checkSu(char ch) {
		if (ch < '0') return false;
		if (ch > '9') return false;
		return true;
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final String VERSION = "0.2.0";
		String title = "주민번호 체크기(ver " + VERSION + ")";
		String menu = "주민번호> ";
		int age = 0;
		char gender = '남';
		char[] num;
		int changeYear = 1900;
		int year = 2024;

		System.out.println(title);
		String input = "";
		while (true) {
			System.out.print(menu);
			input = sc.nextLine();
			num = input.toCharArray();
			if (num.length != 14) {
				System.out.println("입력된 자리수가 부족합니다.");
				continue;
			}
			if (num[6] != '-') {
				System.out.println("다음의 출력 포멧 000000-0000000으로 입력하세요.");
				continue;
			}
			
			boolean chk = true;
			for (int i = 0; i < num.length; i++) {
				if (i == 6) continue;
				if (!checkSu(num[i])) chk = false;
			}
			if (!chk) {
				System.out.println("주민번호는 숫자로만 구성되어야 합니다.");
				continue;
			}

			changeYear += changeSu(num[0]) * 10 + changeSu(num[1]);
			if (num[7] > '2') changeYear += 100;
			age = year - changeYear + 1;
			if (num[7] % 2 == 0) gender = '여';
			break;
		}
		System.out.println("당신은 " + age + "세 " + gender + "성 입니다.");
		System.out.println("이용해주셔서 감사합니다.");
	}
}