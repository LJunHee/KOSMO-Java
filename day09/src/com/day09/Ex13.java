package com.day09;
/*
 * 로또번호 생성기(ver 0.1.0)
 * x,x,x,x,x,x
 * 토요일 저녁 9시 전 mbc 
 * 1 ~ 45
 */

class LottoGenerator {
	static int[] lottoNum;
	

	public LottoGenerator() {
		this.lottoNum = new int[6];
	}


	int randomNum02() {
		int num = (int) (Math.random() * 45 + 1);
		return num;
	}


	void lottoNumbers() {	
		int count = 0;
		System.out.println("로또번호 생성기(ver0.1.0)");
		boolean check;
		int num;
		for (int i = 0; i < lottoNum.length; i++) {
			do {
				num = randomNum02();
				check = false;
				for (int j = 0; j < lottoNum.length; j++) {
					if (lottoNum[j] == num) {
						check = true;
						break;
					}
				}
			} while (check == true);
			lottoNum[i] = num;
		}
		java.util.Arrays.sort(lottoNum);
	}

}

public class Ex13 extends LottoGenerator {

	public static void main(String[] args) {
		lotto();
	}

	static void lotto() {
		LottoGenerator lottoGen = new LottoGenerator();
		lottoGen.randomNum02();
		lottoGen.lottoNumbers();
		System.out.println(java.util.Arrays.toString(lottoNum));
	}

}
