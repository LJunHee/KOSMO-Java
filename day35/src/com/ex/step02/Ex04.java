package com.ex.step02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Ex04 extends Ex03 {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		try(
			PrintWriter out = res.getWriter();
			) {
			out.print("servlet run...");
		}
	}

}
