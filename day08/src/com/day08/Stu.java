package com.day08;

public class Stu{
	static int cnt;
	int num;
	String name;
	int kor,eng,math;
	
	public Stu() {
		num=++cnt;
	}
	int total() {
		return kor+eng+math;
	}
	double avg() {
		return total()*100/3/100.0;
	}
}
