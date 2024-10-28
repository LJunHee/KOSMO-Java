package com.day09;
/*
 * 요구사항
 * 1. 랜덤한 숫자 뽑기 (1 ~ 45)
 * 2. 중복검사
 * 3. 정렬
 */
public class Ex14 {

	public static void main(String[] args) {
		int[] lotto;
		int limit =45;
		lotto = new int[limit];
		for(int i = 0; i < limit; i++) {
			lotto[i] = i+1;
		}
		System.out.println(java.util.Arrays.toString(lotto));
		
		int su = 0;
		int temp = 0;
		for(int i = 0; i < 10000; i++) {
			su = new Double(Math.random()*limit).intValue();
			temp = lotto[0];
			lotto[0] = lotto[su];
			lotto[su] = temp;
		}
		for(int i=0; i<6; i++) {
			if(i==5) {
				System.out.println(lotto[i]);
				break;
			}
			System.out.print(lotto[i]+",");
		}
	}

}
