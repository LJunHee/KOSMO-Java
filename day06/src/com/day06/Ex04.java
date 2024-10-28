package com.day06;


import java.util.*;


public class Ex04 {

	public static String[] msgs = { "국어", "영어", "수학" };
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String title = "학생성적관리프로그램(ver 1.2.0)";
		String menu = "1.목록 2.입력 3.상세보기 0.종료 >";
		String table = "--------------------------------\n";
		table += "학번\t국어\t영어\t수학\n";
		table += "--------------------------------\n";

		int input = -1;
		int cnt = 0;

		System.out.println(title);
		System.out.print("총원 > ");
		input = sc.nextInt();
		int[][] stuInfo = new int[input][];
		while (true) {
			System.out.print(menu);
			input = sc.nextInt();
			if (input == 0) break;
			if (input == 1) {
				System.out.print(table);
				for (int i = 0; i < stuInfo.length; i++) {
					if (i < cnt) {
						int[] stu = stuInfo[i];
						System.out.println((i + 1) + "\t" + stu[0] + "\t" + stu[1] + "\t" + stu[2]);
					}
				}
			}
			if (input == 2 && cnt < stuInfo.length) {
				int[] stu = new int[msgs.length];
				for (int i = 0; i < stu.length; i++) {
					stu[i] = numberFunc(sc,i);
				}

				stuInfo[cnt++] = stu;
			}
			if (input == 3) {
				System.out.print("학번> ");
				input = sc.nextInt();
				int[] stu = stuInfo[input - 1];
				int sum = stu[0] + stu[1] + stu[2];
				double avg = sum * 100 / 3 / 100.0;
				System.out.println("--------------------------------");
				System.out.println("국어 : " + stu[0] + ",영어 : " + stu[1] + ",수학 : " + stu[2]);
				System.out.println("--------------------------------");
				System.out.println("합계 : " + sum);
				System.out.println("평균 : " + avg);
				System.out.print("학점 : ");
				if (avg >= 90) System.out.println("A");
				else if (avg >= 80) System.out.println("B");
				else if (avg >= 70) System.out.println("C");
				else if (avg >= 60) System.out.println("D");
				else System.out.println("F");
			}
		}
		System.out.println("이용해주셔서 감사합니다.");
	}


	public static int numberFunc(java.util.Scanner sc, int su) {
		int input;
		while (true) {
			System.out.print(msgs[su] + "> ");
			input = sc.nextInt();
			if (input >= 0 && input <= 100) {
				break;
			} else {
				System.out.println("0 ~ 100점 사이의 수를 입력하시오.");
			}
		}
		return input;
	}

}
