package com.emp.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.emp.model.EmpDao;

public class EditController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int empno = Integer.parseInt(req.getParameter("empno"));
		EmpDao dao = new EmpDao();
		try {
			req.setAttribute("bean", dao.oneList(empno));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		RequestDispatcher rd = req.getRequestDispatcher("/edit.jsp");
		rd.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int empno = Integer.parseInt(req.getParameter("empno"));
		String ename = req.getParameter("ename");
		int pay = Integer.parseInt(req.getParameter("pay"));
		EmpDao dao = new EmpDao();
		try {
			dao.editList(empno,ename,pay);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		resp.sendRedirect("list.do");
	}
}
