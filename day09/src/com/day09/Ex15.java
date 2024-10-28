package com.day09;

class Ball {
	final int num;
	private boolean checkNum;
	String color;
	
	public Ball(int num) {
		this.num = num;
		checkNum = false;
		if(num < 10) color = "노랑색";
		else if(num < 20) color = "파랑색";
		else if(num < 30) color = "빨강색";
		else if(num < 40) color = "검정색";
		else color = "초록색";
	}
	public void check() {
		checkNum = true;
	}
	public boolean isCheck() {
		return this.checkNum;
	}
}

public class Ex15 {

	public static void main(String[] args) {
		System.out.println("로또 번호 생성기 (ver 1.2.0)");
		Ball[] box = new Ball[45];
		for(int i = 0; i<45; i++) {
			box[i] = new Ball(i+1);
		}
		for(int i=0; i<6; i++) {
			int su = (int)(Math.random() * 45);
			Ball ball = box[su];
			if(ball.isCheck() == true) {
				i--;
			} else {
				ball.check();
				System.out.println(ball.color + "공 " + ball.num + "번");			
			}
		}
	}

}
