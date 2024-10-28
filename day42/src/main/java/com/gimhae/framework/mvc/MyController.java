package com.gimhae.framework.mvc;

import javax.servlet.http.HttpServletRequest;

public interface MyController {

	public String execute(HttpServletRequest req);
}