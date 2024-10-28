package com.ex.step01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Ex02 implements Servlet {
	ServletConfig config;

	@Override
	public void destroy() {
		System.out.println("컨테이너 종료시점에");
	}

	@Override
	public ServletConfig getServletConfig() {
		System.out.println("getServletConfig...");
		return config;
	}

	@Override
	public String getServletInfo() {
		System.out.println("getServletInfo...");
		return "";
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("해당 url을 통한 호출 최초에 단 한번 수행");
		config = arg0;
	}

	@Override
	public void service(ServletRequest req, ServletResponse resp)
	    throws ServletException, IOException {
		System.out.println("출력...");
		try(
			PrintWriter out = resp.getWriter();
			){
			out.print("abcd");
		}
	}

	 
}
