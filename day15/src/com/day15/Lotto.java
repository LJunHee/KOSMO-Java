package com.day15;

import java.io.*;

public class Lotto implements Serializable{
	//직렬화의 대상은 필드
	private static final long serialVersionUID = 2L;
	private final int su;
	private transient String color; // 직렬화 제외

	public Lotto(int su, String color) {
		this.su = su;
		this.color = color;
	}
	
	public void show( ) {
		System.out.println(color + "색" + su);
	}
}
