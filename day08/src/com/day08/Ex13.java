package com.day08;
import java.util.*;


/*
 * 학생성적관리프로그램(ver 1.4.0)
 * 1.보기 2.입력 3.수정 4.삭제 0.종료 >
 * 
 * 동적할당
 * 학번|이름|국어|영어|수학
 * 총원 지정X
 * 
 * 객체 활용(student class)
 * 
 */

//class Student {
//	int studentID;
//	String name;
//	int kor;
//	int eng;
//	int math;
//	
//	public void studentScore(int studentID, String name, int kor, int eng, int math) {
//		this.studentID = studentID;
//		this.name = name;
//		this.kor = kor;
//		this.eng = eng;
//		this.math = math;
//		
//	}


public class Ex13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final String VERSION = "1.4.0";
		String title = "학생성적관리프로그램(ver " + VERSION + ")";
		String table = "-----------------------------------\n";
		table += "학번     |이름   |국어\t|영어\t|수학 \n";
		table += "-----------------------------------\n";
		String menu = "1.보기 2.입력 3.수정 4.삭제 0.종료 > ";
		String input = null;
		int cnt = 0;
		
		
		System.out.println(title);
		System.out.print("총원 >");
		input = sc.next();
		String[][] stuInfo = new String[Integer.parseInt(input)][];
		while(true) {
			System.out.print(menu);
			input = sc.next();
			
			if(input.equals("0")) break;
			if(input.equals("1")) {
				System.out.print(table);
				for (int i = 0; i < stuInfo.length; i++) {
					if (stuInfo[i] == null) continue;
					if(i < cnt) {
						System.out.println(stuInfo[i][0] + "|" + stuInfo[i][1] + "\t|" + stuInfo[i][2] +
							"\t|" + stuInfo[i][3]+ "\t|" + stuInfo[i][4]);
						System.out.println("-----------------------------------");
					}
				}
			}
			
			if(input.equals("2") && cnt != stuInfo.length) {
				String[] stu = new String[5];
				String[] msg = { "학번", "이름", "국어", "영어", "수학" };
				for(int i = 0; i<msg.length; i++) {
					System.out.print(msg[i] + "> ");
					stu[i] = sc.next();
				}
				stuInfo[cnt] = stu;
				cnt++;
			} else if(input.equals("2")) System.out.println("더이상 입력할 학생이 없습니다.");
			
			if(input.equals("3")) {
				System.out.print("수정할 학번을 입력하시오 > ");
				input = sc.next();
				for(int i=0; i<stuInfo.length; i++) {
					if(input.equals(stuInfo[i][0])) {
						System.out.print("이름 > ");
						stuInfo[i][1] = sc.next();
						System.out.print("국어 > ");
						stuInfo[i][2] = sc.next();
						System.out.print("영어 > ");
						stuInfo[i][3] = sc.next();
						System.out.print("수학 > ");
						stuInfo[i][4] = sc.next();
						System.out.println("수정되었습니다.");
					} else {
						System.out.println("존재하지 않는 학번입니다.");
						continue;
					}
				}
			}
			
			if (input.equals("4")) {
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
		System.out.println("이용해주셔서 감사합니다");
	}

}
