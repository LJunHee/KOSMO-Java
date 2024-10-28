package com.gimhae;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gimhae.service.Service02;

public class App {

	public static void main(String[] args) {
		ApplicationContext ac;
		ac = new ClassPathXmlApplicationContext("/applicationContext_aop.xml");
		
//		Service01 service = (Service01) ac.getBean("svc01");
		Service02 service = ac.getBean(Service02.class);
		service.svc();
	}

}
