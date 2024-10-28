package day05;


/*
 * 학생성적관리프로그램(ver 0.1.0)
 * 
 * 총원>3
 * 
 * 1.보기 2.입력 0.종료 > 1
 * ---------------------------------
 * 학번 | 국어 | 영어 | 수학
 * ---------------------------------
 * ---------------------------------
 * 1.보기 2.입력 0.종료 > 2
 * 학번>1
 * 국어>90
 * 영어>80
 * 수학>70
 * 
 * 1.보기 2.입력 0.종료> 2
 * ---------------------------------
 * 학번	|국어	|영어	|수학
 * ---------------------------------
 * 1	|90		|80		|70
 * 
 * 1.보기 2.입력 0.종료> 2
 * 학번>2
 * 국어>99
 * 영어>89
 * 수학>79
 */
import java.util.*;


public class Ex07 {
	public static void main(String[] args) {
		int student = 0;
		int studentCount = 0;
		int count = 0;
		boolean run = true;
		Scanner sc = new Scanner(System.in);

		System.out.println("학생 성적 관리 프로그램(ver 0.1.0)");
		System.out.print("총원 > ");
		int humanNum = sc.nextInt();
		int[][] score = new int[humanNum][4];

		while (run) {
			System.out.println("----------------------------------");
			System.out.print("1.보기 2.입력 0.종료 >");
			int selNum = sc.nextInt();

			switch (selNum) {
			case 1:
				System.out.println("----------------------------------");
				System.out.println("학번  	|국어  	|영어    |수학    |");
				System.out.println("----------------------------------");
				for (int i = 0; i < count; i++) {
					for (int j = 0; j < score[i].length; j++) {
						System.out.print(score[i][j] + "\t|");
					}
					System.out.println();
				}
				continue;
			case 2:
				if (count == score.length) {
					System.out.println("모든 학생을 입력하였습니다.");
				} else {
					System.out.print("학번> ");
					student = sc.nextInt();
					score[studentCount][0] = student;
					System.out.print("국어> ");
					int korean = sc.nextInt();
					score[studentCount][1] = korean;
					System.out.print("영어> ");
					int english = sc.nextInt();
					score[studentCount][2] = english;
					System.out.print("수학> ");
					int math = sc.nextInt();
					score[studentCount][3] = math;
					count++;
					studentCount++;
				}
				continue;

			case 0:
				System.out.println("이용해주셔서 감사합니다.");
				run = false;
			}
		}

	}
}
