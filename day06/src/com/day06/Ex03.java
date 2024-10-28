package com.day06;


import java.util.*;


public class Ex03 {

	private static final String A = null;


	public static void main(String[] args) {
		/*
		 *  학생성적관리프로그램(ver 1.2.0)
		 *  1.목록 2.입력 3.상세보기 0.종료 > 3
		 *  학번> 
		 *  국어 : ..
		 *  영어 : ..
		 *  수학 : ..
		 *  합계 : ..
		 *  평균 : 00.00(소수점 둘째자리까지)
		 *  학점 : A(~90)
		 *  학점 : A~F(60미만)
		 */

		final String VERSION = "1.2.0";
		String title = "학생성적관리프로그램(ver " + VERSION + ")";
		System.out.println(title);

		Scanner sc = new Scanner(System.in);
		int input = 0;
		System.out.print("총원 > ");
		int cnt = sc.nextInt();
		int[][] stuInfos = new int[cnt][];
		cnt = 0;
		String menu = "1.목록 2.입력 3.상세보기 0.종료 > ";

		while (true) {
			System.out.print(menu);
			input = sc.nextInt();
			if (input == 0) break;
			if (input == 1) {
				System.out.println("----------------------------------");
				System.out.println("학번	  |국어	  |영어	   |수학\r\n" +
				    "----------------------------------");
				for (int i = 0; i < cnt; i++) {
					int[] stuInfo = stuInfos[i];
					System.out.println(
					    stuInfo[0] + "   " + stuInfo[1] + "     " + stuInfo[2] + "       " + stuInfo[3]);
				}
				System.out.println("----------------------------------");
			}
			if (input == 2 && cnt != stuInfos.length) {
				int[] stuInfo = new int[4];
				System.out.print("학번> ");
				stuInfo[0] = sc.nextInt();
				System.out.print("국어> ");
				stuInfo[1] = sc.nextInt();
				System.out.print("영어> ");
				stuInfo[2] = sc.nextInt();
				System.out.print("수학> ");
				stuInfo[3] = sc.nextInt();
				stuInfos[cnt] = stuInfo;
				cnt++;
			} else if (input == 2) {
				System.out.println("더이상 입력할 학생이 없습니다.");
			}

			if (input == 3) {
				System.out.print("학번 >");
				int studentID = sc.nextInt();
				
				for (int i = 0; i < cnt; i++) {
					if (studentID == stuInfos[i][0]) {
						int total = sum(stuInfos[i][1], stuInfos[i][2], stuInfos[i][3]);
						double avg = total / 3;
						
						System.out.println("국어 :" + stuInfos[i][1]);
						System.out.println("영어 :" + stuInfos[i][2]);
						System.out.println("수학 :" + stuInfos[i][3]);
						System.out.println("합계 :" + total);
						System.out.printf("평균 : %.2f \n", avg);
						grade(avg);
						System.out.println();
					}
				}
			}
		}
		System.out.println("이용해주셔서 감사합니다.");
	}

	public static int sum(int a,int b, int c) {
		return a+b+c;
	}
	
	public static void grade(double score) {
		if (score >= 90) {
			System.out.println("학점 : A");
		} else if (score >= 80) {
			System.out.println("학점 : B");
		} else if (score >= 70) {
			System.out.println("학점 : C");
		} else if (score >= 60) {
			System.out.println("학점 : D");
		} else {
			System.out.println("학점 : F");
		}
	}

}
