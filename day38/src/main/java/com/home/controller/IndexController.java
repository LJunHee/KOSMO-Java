package com.home.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
/*
 * 
 * compile < test < package < install < deploy
 * 
 * 
 * */
@WebServlet("/index.do")
public class IndexController extends HttpServlet{
	Logger log=Logger.getLogger(this.getClass());

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		log.debug("call index controller..");
		RequestDispatcher rd=req.getRequestDispatcher("/index.jsp");
		rd.forward(req, resp);
	}
}