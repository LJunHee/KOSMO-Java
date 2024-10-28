package com.gimhae.service;

import com.gimhae.module.Module;

public class Service01 {
	Module module;
	
	public void setModule(Module module) {
		this.module = module;
	}
	
	public void svc() {
		module.func01();
	}
}
