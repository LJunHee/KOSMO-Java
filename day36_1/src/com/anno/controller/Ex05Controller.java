package com.anno.controller;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/ex05.do",
initParams = {@WebInitParam(name = "key1",value = "val1"),
				@WebInitParam(name = "key2", value = "val2")})
public class Ex05Controller extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletConfig config = this.getServletConfig();
		Enumeration<String> enu = config.getInitParameterNames();
		while(enu.hasMoreElements()) {
			String key = enu.nextElement();
			String val = config.getInitParameter(key);
			System.out.println(key + ":" + val);
		}
	}

}
