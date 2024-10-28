package com.gimhae.aop;


import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundLog implements MethodInterceptor {
	Logger log;
	
	@Override
	public Object invoke(MethodInvocation ivc) throws Throwable {
		Object obj = ivc.proceed();
		log= Logger.getLogger(ivc.getThis().getClass());
		log.debug(obj);
		return obj;
	}

}
