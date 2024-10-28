package com.gimhae.none;

public class Service01 {
	//의존성 주입(dependency injection)
	Module module;
	
	public Service01() {
		
	}	
	
	//생성자 주입
	public Service01(Module module) {
		this.module = module;
	}
	
	//세터 주입
	public void setModule(Module module) {
		this.module = module;
	}
	
	public void serv01 (Module module) {
//		Module03 module = new Module03();
		module.func01();
	}
}
