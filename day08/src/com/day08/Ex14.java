package com.day08;


import java.util.*;


class Student {
	String id;
	String name;
	String korean;
	String english;
	String math;
	
	public void studentScore(String id, String name, String korean, String english, String math) {
		this.id = id;
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
	}
}

public class Ex14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String menu = "1.보기 2.입력 3.수정 4.삭제 0.종료>";
		System.out.println("학생성적관리프로그램(ver 1.4.0)");
		String input = null;

		Student[] stuInfo = new Student[0];
		int cnt = 0;

		while (true) {
			System.out.print(menu);
			input = sc.nextLine();
			if (input.equals("0")) break;

			if (input.equals("1")) {
				System.out.println("---------------------------------------------------");
				System.out.println("학번\t\t|이름\t|국어\t|영어\t|수학");
				System.out.println("---------------------------------------------------");
				for (int i = 0; i < stuInfo.length; i++) {
					if (stuInfo[i] == null) continue;
					System.out.println(stuInfo[i].id + "\t|" + stuInfo[i].name + "\t|"
					    + stuInfo[i].korean + "\t|" + stuInfo[i].english +
					    "\t|" + stuInfo[i].math);
				}
				System.out.println("---------------------------------------------------");

			} else if (input.equals("2")) {
				input = inputMsg(sc, 0);
				int idx = getIndex(stuInfo, input);
				if (idx == -1) {
					Student stu = new Student();
					stu.studentScore(input, inputMsg(sc, 1), inputMsg(sc, 2),
					    inputMsg(sc, 3), inputMsg(sc, 4));
					Student[] temp = new Student[stuInfo.length + 1];
					System.arraycopy(stuInfo, 0, temp, 0, stuInfo.length);
					temp[stuInfo.length] = stu;
					stuInfo = temp;
				} else {
					System.out.println(input + " 학번이 존재합니다");
				}
				
			} else if (input.equals("3")) {
				System.out.print("수정할 ");
				input = inputMsg(sc, 0);
				int idx = getIndex(stuInfo, input);
				if (idx == -1) {
					System.out.println("존재하지 않는 학번입니다");
				} else {
					stuInfo[idx].name = inputMsg(sc, 1);
					stuInfo[idx].korean = inputMsg(sc, 2);
					stuInfo[idx].english = inputMsg(sc, 3);
					stuInfo[idx].math = inputMsg(sc, 4);
				}
				
			} else if (input.equals("4")) {
				System.out.print("삭제할 ");
				input = inputMsg(sc, 0);
				int idx = getIndex(stuInfo, input);
				if (idx > -1) {
					Student[] temp = new Student[stuInfo.length - 1];
					System.arraycopy(stuInfo, 0, temp, 0, idx);
					System.arraycopy(stuInfo, idx + 1, temp, idx, stuInfo.length - idx - 1);
					stuInfo = temp;
					System.out.println("삭제되었습니다.");
				} else {
					System.out.println("존재하지 않는 학번입니다");
				}
			}
		}
		System.out.println("이용해주셔서 감사합니다");
	}


	static String inputMsg(java.util.Scanner sc, int su) {
		String[] msg = { "학번", "이름", "국어", "영어", "수학" };
		System.out.print(msg[su] + ">");
		return sc.nextLine();
	}


	static int getIndex(Student[] stuInfo, String input) {
		for (int i = 0; i < stuInfo.length; i++) {
			if (stuInfo[i] != null && stuInfo[i].id.equals(input)) { return i; }
		}
		return -1;
	}
}
