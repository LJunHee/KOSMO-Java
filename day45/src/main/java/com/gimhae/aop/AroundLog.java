package com.gimhae.aop;

import java.util.Arrays;

import org.aopalliance.intercept.Joinpoint;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.log4j.Logger;

public class AroundLog implements MethodInterceptor {
	Logger log;
	@Override
	public Object invoke(MethodInvocation ivc) throws Throwable {
		log=Logger.getLogger(ivc.getThis().getClass());
		Object[] args=ivc.getArguments();
		log.debug("params:"+Arrays.toString(args));
		Object obj=ivc.proceed();
		log.debug("return:"+obj);
		return obj;
	}

}