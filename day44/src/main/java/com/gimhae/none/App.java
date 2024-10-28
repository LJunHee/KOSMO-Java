package com.gimhae.none;

import com.gimhae.none.*;

public class App {
	public static void main(String[] args) {
		Module module = new Module01();
		Service01 service = new Service01();
		//Ioc(Inversion Of Control) 제어역전
		service.setModule(module);
		service.serv01(module);
	}
}
