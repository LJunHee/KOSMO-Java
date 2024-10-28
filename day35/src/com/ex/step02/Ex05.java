package com.ex.step02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ex05 extends GenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response)
	    throws ServletException, IOException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		if("GET".equals(req.getMethod())){
			doGet(req,res);
		} else if ("POST".equals(req.getMethod())) {
			doPost(req,res);
		}
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) {}
	protected void doPost(HttpServletRequest req, HttpServletResponse res) {}
	
}
