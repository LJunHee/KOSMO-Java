package com.day11;
import java.util.*;

class Stu implements Comparable<Stu>{ 
	// 학번순
	int num;
	String name;
	int kor,eng,math;
	
	@Override
	public int compareTo(Stu o) {
		return this.num - o.num;
	}
	
//	@Override
//	public int hashCode() {
//		return num;
//	}
}

public class Ex14_2 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		Set<Stu> data = new TreeSet<Stu>();
		String title = "학생성적관리프로그램(ver 0.8.0)";
		String menu = "1.보기(오름차순) 2.입력 3.수정 4.삭제 0.종료 > ";
		String input = "";
		
		while(true) {
			System.out.print(menu);
			input = sc.next();
			if(input.equals("0")) break;
			if(input.equals("1")) {
            	System.out.println("-----------------------------------------------");
            	System.out.println("학번\t\t|이름\t|국어\t|영어\t|수학\t");
            	System.out.println("-----------------------------------------------");
            	Iterator<Stu> ite = data.iterator();
            	while(ite.hasNext()) {
            		Stu stu = ite.next();
            		System.out.println(stu.num + "\t" + stu.name + "\t" + stu.kor + "\t" + stu.eng + "\t" + stu.math);
            	}
            	System.out.println("-----------------------------------------------");
			}
			if(input.equals("2")) {
				Stu stu = new Stu();
				System.out.print("학번 > ");
				stu.num = Integer.parseInt(sc.next());
				System.out.print("이름 > ");
				stu.name = sc.next();
				System.out.print("국어 > ");
				stu.kor = Integer.parseInt(sc.next());
				System.out.print("영어 > ");
				stu.eng = Integer.parseInt(sc.next());
				System.out.print("수학 > ");
				stu.math = Integer.parseInt(sc.next());
				data.add(stu);	
			}
			if(input.equals("3")) {
				Stu stu = new Stu();
				System.out.print("학번 > ");
				stu.num = Integer.parseInt(sc.next());
				System.out.print("이름 > ");
				stu.name = sc.next();
				System.out.print("국어 > ");
				stu.kor = Integer.parseInt(sc.next());
				System.out.print("영어 > ");
				stu.eng = Integer.parseInt(sc.next());
				System.out.print("수학 > ");
				stu.math = Integer.parseInt(sc.next());
				boolean result = data.add(stu);
				if (result == false) {
					Iterator<Stu> ite = data.iterator();
					Stu stu2 = null;
					//1.
//					Stu target = null;
//					while(ite.hasNext()) {
//						stu2 = ite.next();
//						if(stu2.num == stu.num) {
//							target = stu2;
//							break;
//						}
//						data.remove(target);
//						data.add(stu);
//					}
					
					//2.
					while(ite.hasNext()) {
						stu2 = ite.next();
						stu2.name = stu.name;
						stu2.kor = stu.kor;
						stu2.eng = stu.eng;
						stu2.math = stu.math;
					}
					
				}
			}
			
			if(input.equals("4")) {
				System.out.print("삭제할 학번 > ");
				int num = Integer.parseInt(sc.next());
				Iterator<Stu> ite = data.iterator();
				Stu target = null;
				Stu stu = null;
				while(ite.hasNext()) {
					stu = ite.next();
					if(stu.num == num) {target=stu; break;}
					if(target != null) {data.remove(stu);}
				}
			}
		}
	}

}
