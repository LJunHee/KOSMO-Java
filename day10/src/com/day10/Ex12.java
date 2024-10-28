package com.day10;


import java.util.*;


public class Ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String menu = "1.목록 2.입력 3.수정 4.삭제 0.종료> ";
		System.out.println("학생성적관리프로그램(ver 0..0)");
		List data = new ArrayList();

		String input;

		while (true) {
			System.out.print(menu);
			input = sc.nextLine();

			if (input.equals("0")) break;
			if (input.equals("1")) {
				System.out.println("--------------------------------------------------------------");
				System.out.println("학번\t|이름\t|국어\t|영어\t|수학\t합계\t평균");
				System.out.println("--------------------------------------------------------------");
				for(int i = 0; i<data.size(); i++) {
					String[] stu = (String[])data.get(i);
					System.out.print(stu[0]+"\t"+stu[1]+"\t"+stu[2]+"\t"+stu[3]+"\t"+stu[4]);
					int kor = Integer.parseInt(stu[2]);
					int eng = Integer.parseInt(stu[3]);
					int math = Integer.parseInt(stu[4]);
					System.out.println("\t"+(stu[2]+stu[3]+stu[4])+"\t"+(kor+eng+math)*100/3/100.0);
				}
				System.out.println("--------------------------------------------------------------");
			}
			if (input.equals("2")) {
				String[] stu = new String[5];
				System.out.print("학번> ");
				stu[0] = sc.next();				System.out.print("이름> ");
				stu[1] = sc.next();				System.out.print("국어> ");
				stu[2] = sc.next();				System.out.print("영어> ");
				stu[3] = sc.next();				System.out.print("수학> ");
				stu[4] = sc.next();				data.add(stu);
			}
			if(input.equals("4")) {
				System.out.print("삭제할 학번> ");
				input = sc.next();
				for(int i =0; i< data.size(); i+=5) {
					String[] stu = (String[]) data.get(i);
					if(input.equals(stu[0])) {
						data.remove(i);
					}
				}
			}
		}
		System.out.println("감사합니다.");
	}

}
