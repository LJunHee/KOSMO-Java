package com.day10;


import java.util.*;

class Student {
	final int num = 0;
	String name = "아무개";
	int kor, eng, math;
	
	public Student(String num) {
		this(Integer.parseInt(num));
	}
	public Student(int num) {
		this.num = num;
	}
	
	public void changeKor(String kor) {
		this.kor = Integer.parseInt(kor);
	}
	public void changeEng(String eng) {
		this.eng = Integer.parseInt(eng);		
	}
	public void changeMath(String math) {
		this.math = Integer.parseInt(math);				
	}
	
	public int sum() {
		return kor + eng + math;
	}
	
	public double avg() {
		return sum() * 100/3/100.0;
	}
	
}

public class Ex13 {

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
					Student stu = (Student) data.get(i);
					System.out.print(stu.num+"\t"+stu.name+"\t"+stu.kor+"\t"+stu.eng+"\t"+stu.math + "\t"
							+ stu.sum() +"\t"+ stu.avg());
				}
				System.out.println("--------------------------------------------------------------");
			}
			if (input.equals("2")) {
				System.out.print("학번> ");
				input = sc.next();
				Student stu = new Student(input);
				System.out.print("이름> ");				input = sc.next();
				stu.name = input;				System.out.print("국어> ");
				input = sc.next();
				stu.changeKor(input);				System.out.print("영어> ");
				input = sc.next();
				stu.changeEng(input);				System.out.print("수학> ");
				input = sc.next();
				stu.changeMath(input);				data.add(stu);
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
