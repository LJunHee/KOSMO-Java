package com.gimhae.day49.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

//@Slf4j
@Component
@Aspect
public class LogAop {
	
	@Before("execution(* com.gimhae.day49..*Impl.*(..))")
	public void before(JoinPoint join) {
		System.out.println("param:"+Arrays.toString(join.getArgs()));
	}

	@AfterReturning(
			returning = "obj",
			pointcut = "execution(* com.gimhae.day49..*Impl.*(..))")
	public void afterSuccess(Object obj) {
//		log.debug("after");
		System.out.println("return:"+obj);
	}
}