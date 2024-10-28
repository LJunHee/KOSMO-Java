package com.day07;


/*
 * 학생성적관리프로그램(ver 1.3.0)
 * 1.목록 2.입력 3.삭제 0.종료 >1
 * -----------------------------------
 * 학번	|이름	|국어	|영어	|수학
 * -----------------------------------
 * 1.목록 2.입력 3.삭제 0.종료 >2
 * 학번>
 * 성명>
 * 국어>
 * 영어>
 * 수학>
 * 
 * 1.목록 2.입력 3.수정 4.삭제 0.종료 >3
 * 학번>
 * 삭제되었습니다.
 * 
 * 1.목록 2.입력 3.삭제 0.종료 >3
 * 학번>
 * 존재하지 않습니다.
 */
import java.util.*;


public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final String VERSION = "1.3.0";
		String title = "학생성적관리프로그램(ver +" + VERSION + ")";
		String menu = "1.목록 2.입력 3.수정 4.삭제 0.종료 > ";
		String table = "-----------------------------------\n";
		table += "학번     |이름   |국어\t|영어\t|수학 \n";
		table += "-----------------------------------\n";
		int input = 0;
		int cnt = 0;

		System.out.println(title);
		System.out.print("총원> ");
		int total = sc.nextInt();
		String[][] stuInfo = new String[total][5];
		while (true) {
			System.out.print(menu);
			input = sc.nextInt();

			if (input == 0) break;
			if (input == 1) {
				System.out.print(table);
				for (int i = 0; i < stuInfo.length; i++) {
					if (i < cnt) {
						String[] stu = stuInfo[i];
						System.out.println(stu[0] + "  " + stu[1] + "  " + stu[2] + "    " + stu[3]
						    + "     " + stu[4]);
					}
				}
			}

			if (input == 2 && cnt != stuInfo.length) {
				String[] stuInfo = new String[5];
				System.out.print("학번> ");
				stuInfo[0] = sc.next();
				System.out.print("이름> ");
				stuInfo[1] = sc.next();
				System.out.print("국어> ");
				stuInfo[2] = sc.next();
				System.out.print("영어> ");
				stuInfo[3] = sc.next();
				System.out.print("수학> ");
				stuInfo[4] = sc.next();
				stuInfo[cnt] = stuInfo;
				cnt++;
			} else if (input == 2) {
				System.out.println("더이상 입력할 학생이 없습니다.");
			}

			if (input == 3) {
				System.out.print("수정할 학번>");
				String editInfo = sc.next();
				boolean found = false;
				for (int i = 0; i < stuInfo.length; i++) {
					for (int j = 0; j < stuInfo[i].length; j++) {
						if (stuInfo[i][j].equals(editInfo)) {
							System.out.print("이름> ");
							stuInfo[i][1] = sc.next();
							System.out.print("국어> ");
							stuInfo[i][2] = sc.next();
							System.out.print("영어> ");
							stuInfo[i][3] = sc.next();
							System.out.print("수학> ");
							stuInfo[i][4] = sc.next();
							System.out.println("수정되었습니다.");
							found = true;
							break;
						}
					}
				}
				if (!found) {
					System.out.println("존재하지 않는 학번입니다.");
				}

			}
			if (input == 4) {
				System.out.print("학번> ");
				String stuID = sc.next();
				boolean found = false;
				for (int i = 0; i < cnt; i++) {
					if (stuInfo[i][0].equals(stuID)) {
						for (int j = i; j < cnt - 1; j++) {
							stuInfo[j] = stuInfo[j + 1];
						}
						stuInfo[cnt - 1] = new String[5];
						cnt--;
						System.out.println("삭제되었습니다.");
						found = true;
						break;
					}
				}
				if (!found) {
					System.out.println("존재하지 않는 학번입니다.");
				}
			}
		}
		System.out.println("이용해주셔서 감사합니다.");
	}
}
