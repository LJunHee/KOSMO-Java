package com.gimhae.day54.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class DeptAdvice {

	@Before("execution(* com.gimhae.day54.model..*.*(..))")
	public void before() {
		System.out.println("before");
	}
}