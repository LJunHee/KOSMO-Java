package com.home.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.home.model.EmpDao;

public class LoginController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rd = req.getRequestDispatcher("form.jsp");
		rd.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String sabun = req.getParameter("sabun");
		String ename = req.getParameter("ename");
		EmpDao dao = new EmpDao();
		boolean result = dao.login(sabun,ename);
		if(result) {
			HttpSession session = req.getSession();
			session.setAttribute("login", ename);
			session.setAttribute("result", true);
		}
		resp.sendRedirect("/day34/index.do");
	}

}
