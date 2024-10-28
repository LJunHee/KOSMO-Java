package com.day11;


import java.util.*;

// 학생성적관리프로그램(ver 0.8.0)
// 1.보기(오름차순) 2.입력 3.수정 4.삭제 0.종료


class Student implements Comparable<Student> {
	int num;
	String name;
	int kor, eng, math;


	@Override
	public int compareTo(Student o) {
		return this.num - o.num; // 오름차순
		// return o.num - this.num; // 내림차순
	}


	@Override
	public String toString() {
		return num + "\t|" + name + "\t|" + kor + "\t|" + eng + "\t|" + math;
	}
}

public class Ex14 {
	public static void main(String[] args) {
		System.out.println("학생성적관리프로그램(ver 0.8.0)");
		Scanner sc = new Scanner(System.in);
		Set<Student> stuInfo = new TreeSet<Student>();

		while (true) {
			System.out.print("1.보기(오름차순) 2.입력 3.수정 4.삭제 0.종료 > ");
			String input = sc.next();
			if (input.equals("0")) break;
			else if (input.equals("1")) {
				System.out.println("-----------------------------------------------");
				System.out.println("학번\t\t|이름\t|국어\t|영어\t|수학\t");
				System.out.println("-----------------------------------------------");
				Iterator<Student> ite = stuInfo.iterator();
				while (ite.hasNext()) {
					Student stu = ite.next();
					System.out.println(stu.num + "\t|" + stu.name + "\t|" + stu.kor + "\t|"
					    + stu.eng + "\t|" + stu.math);
				}
				System.out.println("-----------------------------------------------");

			} else if (input.equals("2")) {
				Student stu = new Student();
				System.out.print("학번 > ");
				stu.num = sc.nextInt();
				System.out.print("이름 > ");
				stu.name = sc.next();
				System.out.print("국어 > ");
				stu.kor = sc.nextInt();
				System.out.print("영어 > ");
				stu.eng = sc.nextInt();
				System.out.print("수학 > ");
				stu.math = sc.nextInt();
				stuInfo.add(stu);

			} else if (input.equals("3")) {
				boolean check = false;
				System.out.print("수정할 학번 > ");
				int selNum = sc.nextInt();
				Iterator<Student> ite = stuInfo.iterator();
				while (ite.hasNext()) {
					Student stu = ite.next();
					if (stu.num == selNum) {
						check = true;
						stuInfo.remove(stu);
						System.out.print("학번 > ");
						stu.num = sc.nextInt();
						System.out.print("이름 > ");
						stu.name = sc.next();
						System.out.print("국어 > ");
						stu.kor = sc.nextInt();
						System.out.print("영어 > ");
						stu.eng = sc.nextInt();
						System.out.print("수학 > ");
						stu.math = sc.nextInt();
						stuInfo.add(stu);
					} else if (check = false) {
						System.out.println("통과");
						stu.num = selNum;
						System.out.print("이름 > ");
						stu.name = sc.next();
						System.out.print("국어 > ");
						stu.kor = sc.nextInt();
						System.out.print("영어 > ");
						stu.eng = sc.nextInt();
						System.out.print("수학 > ");
						stu.math = sc.nextInt();
						stuInfo.add(stu);
					}
				}

			} else if (input.equals("4")) {
				System.out.print("삭제할 학번 > ");
				int selNum = sc.nextInt();
				Iterator<Student> ite = stuInfo.iterator();
				while (ite.hasNext()) {
					Student stu = ite.next();
					if (stu.num == selNum) {
						stuInfo.remove(stu);
						System.out.println(stu.num + " 학번이 삭제되었습니다.");
						break;
					}
				}
			}
		}
		System.out.println("이용해주셔서 감사합니다.");
	}
}
