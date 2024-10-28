package com.gimhae.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundLog implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("before around...");
		try {
			Object obj=invocation.proceed();
			System.out.println("after success around...");
			return obj;
		}catch (Exception e) {
			System.out.println("after err around...");
			return null;
		}finally {
			System.out.println("after all around...");			
		}
	}

}