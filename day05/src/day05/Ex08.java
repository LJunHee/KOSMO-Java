package day05;


import java.util.*;


public class Ex08 {

	public static void main(String[] args) {
		System.out.println(" * 학생성적관리프로그램(ver 0.1.0)");
		Scanner sc = new Scanner(System.in);
		int input = 0;
		System.out.println("총원 > ");
		int cnt = sc.nextInt();
		int[][] stuInfos = new int[cnt][];
		cnt = 0;

		while (true) {
			System.out.print("1.보기 2.입력 0.종료 > ");
			input = sc.nextInt();
			if (input == 0) break;
			if (input == 1) {
				System.out.println("------------------------------");
				System.out.println("학번	|국어	|영어	|수학\r\n" +
				    "------------------------------");
				for (int i = 0; i < cnt; i++) {
					int[] stuInfo = stuInfos[i];
					System.out.println((i + 1) + "\t" + stuInfo[0] + "\t" + stuInfo[1] + "\t" + stuInfo[2]);
				}
				System.out.println("------------------------------");
			}
			if (input == 2 && cnt != stuInfos.length) {
				int[] stuInfo = new int[3];
				System.out.print("국어> ");
				stuInfo[0] = sc.nextInt();
				System.out.print("영어> ");
				stuInfo[1] = sc.nextInt();
				System.out.print("수학> ");
				stuInfo[2] = sc.nextInt();
				stuInfos[cnt] = stuInfo;
				cnt++;
			} else if (input == 2) {
				System.out.println("더이상 입력할 학생이 없습니다.");
			}
		}
		System.out.println("이용해주셔서 감사합니다.");
	}
}