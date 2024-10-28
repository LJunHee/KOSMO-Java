package com.emp.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.emp.model.EmpDao;

public class AddController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rd = req.getRequestDispatcher("/add.jsp");
		rd.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String ename = req.getParameter("ename").trim();
		int pay = 0;
		if(ename.isEmpty()) {
			doGet(req, resp);
			return;
		}
		try {
			pay = Integer.parseInt(req.getParameter("pay").trim());			
		} catch (Exception e) {
			doGet(req, resp);
			return;
		}
		EmpDao dao = new EmpDao();
		try {
			dao.addList(ename,pay);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		resp.sendRedirect("./list.do");
	}

}
