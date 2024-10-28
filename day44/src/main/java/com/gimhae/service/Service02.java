package com.gimhae.service;

import com.gimhae.aop.module.Module;

public class Service02 {

	private Module module;

	public Service02(Module module) {
		super();
		this.module = module;
	}

	public void svc() {
		module.afunc01();
		module.bfunc02("f2");
		module.bfunc03("f",3);
		String msg=module.afunc04();
		try {
		module.bfunc05(4,0);
		}catch (Exception e) {
		}
	}
}