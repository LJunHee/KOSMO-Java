package com.day10;


import java.util.*;


class Student {
	String name;
	int stuID, kor, eng, math;

	public Student() {
		this.stuID = stuID;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int total() {
		return kor + eng + math;
	}


	public double avg() {
		return total() / 3.0;
	}
}

public class Ex10 {
	public static void main(String[] args) {
		final String VERSION = "0.6.0";
		String menu = "1.보기 2.입력 3.수정 4.삭제 0.종료>";
		Scanner sc = new Scanner(System.in);
		String input = null;
		ArrayList stuInfo = new ArrayList();

		System.out.println("학생성적관리프로그램(ver" + VERSION + ")");
		while (true) {
			System.out.print(menu);
			input = sc.nextLine();
			if (input.equals("0")) break;

			if (input.equals("1")) {
				System.out
				    .println("--------------------------------------------------------------");
				System.out.println("학번\t\t|이름\t|국어\t|영어\t|수학\t|합계\t|평균");
				System.out
				    .println("--------------------------------------------------------------");
				for (int i = 0; i < stuInfo.size(); i++) {
					Student stu = (Student) stuInfo.get(i);
					System.out.println(stu.stuID + "\t|" + stu.name + "\t|" + stu.kor + "\t|"
					    + stu.eng + "\t|" + stu.math + "\t|" + stu.total() + "\t|" + stu.avg());
				}
				System.out
				    .println("--------------------------------------------------------------");
			}

			if (input.equals("2")) {
				Student stu = new Student();
				System.out.print("학번>");
				stu.stuID = sc.nextInt();
				System.out.print("이름>");
				stu.name = sc.next();
				System.out.print("국어>");
				stu.kor = sc.nextInt();
				System.out.print("영어>");
				stu.eng = sc.nextInt();
				System.out.print("수학>");
				stu.math = sc.nextInt();
				stuInfo.add(stu);
			}

			if (input.equals("3")) {
				System.out.print("수정할 학번>");
				int num = sc.nextInt();
				int idx = -1;
				for (int i = 0; i < stuInfo.size(); i++) {
					Student stu = (Student) stuInfo.get(i);
					if (stu.stuID == num) {
						idx = i;
						break;
					}
				}
				if (idx > -1) {
					Student stu = (Student) stuInfo.get(idx);
					System.out.print("이름>");
					stu.name = sc.next();
					System.out.print("국어>");
					stu.kor = sc.nextInt();
					System.out.print("영어>");
					stu.eng = sc.nextInt();
					System.out.print("수학>");
					stu.math = sc.nextInt();
				} else {
					System.out.println(num + "학번은 존재하지 않습니다");
				}
			}

			if (input.equals("4")) {
				System.out.print("삭제할 학번>");
				int num = sc.nextInt();
				int idx = -1;
				for (int i = 0; i < stuInfo.size(); i++) {
					Student stu = (Student) stuInfo.get(i);
					if (stu.stuID == num) {
						idx = i;
						break;
					}
				}
				if (idx > -1) {
					stuInfo.remove(idx);
				} else {
					System.out.println(num + "학번은 존재하지 않습니다");
				}
			}
		}
		System.out.println("이용해주셔서 감사합니다.");
	}
}
