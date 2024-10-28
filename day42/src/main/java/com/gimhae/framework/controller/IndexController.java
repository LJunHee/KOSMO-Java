package com.gimhae.framework.controller;

import javax.servlet.http.HttpServletRequest;

import com.gimhae.framework.mvc.MyController;

public class IndexController implements MyController {

	@Override
	public String execute(HttpServletRequest req) {
		return "index";
	}

}