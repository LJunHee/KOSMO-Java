package com.xml.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ex06Controller extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("xml mapping servlet");
		System.out.println(this);
//		ServletContext context = req.getServletContext();
//		String val = context.getInitParameter("public01");
//		String val = this.getServletContext().getInitParameter("public01");
		String val = this.getServletConfig().getServletContext().getInitParameter("pulbic01");
		System.out.println(val);
	}

}
