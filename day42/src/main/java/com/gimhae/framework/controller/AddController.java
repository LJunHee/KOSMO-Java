package com.gimhae.framework.controller;

import javax.servlet.http.HttpServletRequest;

import com.gimhae.framework.mvc.MyController;

public class AddController implements MyController {
	@Override
	public String execute(HttpServletRequest req) {
		return "emp/add";
	}

}
