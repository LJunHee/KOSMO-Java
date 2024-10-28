package day05;


import java.util.*;


public class Ex05 {
	public static void main(String[] args) {
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
		Scanner sc = new Scanner(System.in);
		int year = 2024;
		String human = "";
		boolean run = true;

		while (run) {
			System.out.println("주민번호 체크(ver 0.1.0)");
			System.out.print("주민번호>");
			String num = sc.next();
			char id[] = num.toCharArray();

			if (id.length < 7 || id[6] != '-') {
				System.out.println("다음의 출력 포멧 000000-0000000으로 입력하세요.");
				continue;
			} else if (id.length != 14) {
				System.out.println("입력자리수가 부족합니다.");
				continue;
			} else {
				boolean correct = true;
				for (int i = 0; i < id.length; i++) {
					if (i == 6) continue; 
					if (id[i] < '0' || id[i] > '9') {
						correct = false;
						break;
					}
				}
				if (!correct) {
					System.out.println("주민번호는 숫자로만 구성되어야 합니다.");
					continue;
				}

				// 성별
				if (id[7] == '1' || id[7] == '3') {
					human = "남자";
				} else if (id[7] == '2' || id[7] == '4') {
					human = "여자";
				}

				// 나이
				if (id[0] < '3') {
					String ageCode = "20" + id[0] + id[1];
					int age = (year + 1) - Integer.parseInt(ageCode);
					System.out.println("당신은 " + age + "세 " + human + "입니다.");
				} else if (id[0] >= '3') {
					String ageCode = "19" + id[0] + id[1];
					int age = (year + 1) - Integer.parseInt(ageCode);
					System.out.println("당신은 " + age + "세 " + human + "입니다.");
				}
				run = false;

			}
		}
	}
}
