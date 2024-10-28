package com.gimhae.aop;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.MethodBeforeAdvice;

public class BeforeLog implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
//		String name=method.getName();
//		int cnt=method.getParameterCount();
//		System.out.println(name+"의 파라미터 갯수는 "+cnt+"이고 ");
//		System.out.println(name+"의 어노테이션은 "+Arrays.toString(method.getDeclaredAnnotations()));
//		System.out.println(Arrays.toString(args));
//		System.out.println(target.toString());
		System.out.println("before...");
	}

}