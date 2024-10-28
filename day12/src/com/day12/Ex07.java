package com.day12;
import java.awt.*;

public class Ex07 extends java.awt.Frame {
	// 요소 - ui 컴포넌트 종류 사용법
	public Ex07() {
		// 배치 - 배치관리자 - 상대속성, 절대속성
		// FlowLayout - 가운데 정렬, 컴포넌트의 배치,크기 조절X
		// GridLayout - 
		// 컨텐츠 크기에 맞춰 사이즈
		Font f = new Font("Ravie", 1,20); //글꼴명,굵기,크기
		LayoutManager lm = new GridLayout(2,3); // 열,행
		this.setLayout(lm);
		Button btn = new Button();
//		btn.setFont(f);
		btn.setLabel("첫번째 버튼");
//		btn.setSize(500,100);
		Button btn2 = new Button();
		btn2.setLabel("두번째 버튼");
		Button btn3 = new Button();
		btn3.setLabel("세번째 버튼");
		Button btn4 = new Button();
		btn4.setLabel("네번째 버튼");
		Button btn5 = new Button();
		btn5.setLabel("다섯번째 버튼");
		Button btn6 = new Button();
		btn6.setLabel("여섯번째 버튼");
		this.add(btn);
		this.add(btn2);
		this.add(btn3);
		this.add(btn4);
		this.add(btn5);
		this.add(btn6);
		this.setLocation(1000, 500);
		this.setSize(500,400);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// GUI
		// awt		1.0 ~ 		os요청			빠르고 자원소모 운영체제종속
		// swing	1.2 ~		java draw		awt가 못하는것 세련(롱혼)
		Ex07 me = new Ex07();
	}

}
