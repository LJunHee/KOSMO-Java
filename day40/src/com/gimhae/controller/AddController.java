package com.gimhae.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gimhae.framework.mvc.MyController;

public class AddController implements MyController {
	@Override
	public String execute(HttpServletRequest arg0, HttpServletResponse arg1) {
		return "emp/add";
	}
}
