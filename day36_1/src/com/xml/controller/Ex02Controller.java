package com.xml.controller;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ex02Controller extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletConfig config = this.getServletConfig();
//		String val1 = config.getInitParameter("key1");
//		String val2 = config.getInitParameter("key2");
//		System.out.println(val1);
		Enumeration<String> enu = config.getInitParameterNames();
		while(enu.hasMoreElements()) {
			String key = enu.nextElement();
			String val = config.getInitParameter(key);
			System.out.println(key + ":" + val);
		}
	}
}
