package com.gimhae.aop;

import org.springframework.aop.ThrowsAdvice;

public class AfterErrLog implements ThrowsAdvice{

	public void afterThrowing(Exception ex) {
		System.out.println("에러처리");
		System.out.println(ex.getMessage());
		System.out.println(ex.toString());
		System.out.println(ex.getClass());
	}
}