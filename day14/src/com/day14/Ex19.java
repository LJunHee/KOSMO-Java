package com.day14;


import java.io.*;
import java.util.*;


/*
 * 학생성적관리프로그램(ver 0.10.0)
 * IO - 종료후 재시작시 데이터 유지
 * 1.보기 2.입력 3.(삭제) 0.종료 > 
 * 
 */

public class Ex19 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String title = "학생성적관리프로그램(ver 0.10.0)";
		String menu = "1.보기 2.입력 3.삭제 0.종료>";
		String input = "";
		File f = new File("studentReportCard.txt");
		Writer fw = null;
		Reader fr = null;



		System.out.println(title);
		while (true) {
			System.out.print(menu);
			input = sc.next();
			if (input.equals("0")) break;
			if (input.equals("1")) {
				System.out.println("-------------------------------------------------------");
				System.out.println("학번\t\t이름\t국어\t영어\t수학");
				System.out.println("-------------------------------------------------------");
				try {
					fr = new FileReader(f);
					while(true) {
						int su = fr.read();
						if (su == -1) break;
						System.out.print((char) su);				
					}
					System.out.println();
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				} finally {
					try {
						if (fr != null) fr.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
			if (input.equals("2")) {
				// 파일 생성
				fw = new FileWriter(f, true);
				try {
					System.out.print("학번>");
					fw.write(sc.next() + "\t\t");
					System.out.print("이름>");
					fw.write(sc.next() + "\t");
					System.out.print("국어>");
					fw.write(sc.next() + "\t");
					System.out.print("영어>");
					fw.write(sc.next() + "\t");
					System.out.print("수학>");
					fw.write(sc.next() + "\n");
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					try {
						if (fw != null) fw.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			} //if 2
			if(input.equals("3")) {
				System.out.println("삭제");
			}
		}
		System.out.println("이용해주셔서 감사합니다");
	}
}