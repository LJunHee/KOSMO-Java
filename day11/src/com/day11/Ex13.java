package com.day11;
//로또번호 생성기(ver 0.4.0)
// 1~45 랜덤한 6개의 중복되지 않는 번호

import java.util.*;

class Lotto implements java.lang.Comparable<Lotto> {
	static int cnt;
	final int num;
	String color;
	
	public Lotto(int num) {
		this.num = num;
		if(num < 10) color = "노랑색";
		else if(num < 20) color = "파랑색";
		else if(num < 30) color = "빨강색";
		else if(num < 40) color = "검정색";
		else color = "초록색";
	}
	@Override
	public int compareTo(Lotto o) {
		return num - o.num;
	}
	@Override
	public String toString() {
		return color + num + "번 " +  "공";
	}
}

public class Ex13 {
    public static void main(String[] args) {
        System.out.println("로또 번호 생성기 (ver 0.4.0)");

        Set lotto = new TreeSet();
        int cnt = 0;
        while(true) {
        	cnt++;
        	lotto.add(new Lotto((int)(Math.random()*45)+1));
        	if(lotto.size() == 6) break;
        }
        System.out.println(lotto);
        System.out.println(cnt);
    }
}