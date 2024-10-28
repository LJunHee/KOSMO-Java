package com.gimhae;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ex07 {

	public static void main(String[] args) {
		LocalDate ld=LocalDate.now();
		System.out.println(ld);
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println(ldt);
		LocalTime lt=LocalTime.now();
		System.out.println(lt);
		LocalDate ld2=LocalDate.of(2002, 5, 1);
		System.out.println(ld2);
	}

}
