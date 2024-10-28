package com.ex.step02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ex06 extends Ex05{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) {
		try(
			PrintWriter out = res.getWriter();
			){
			out.print("<h2>ex06 page</h2>");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
