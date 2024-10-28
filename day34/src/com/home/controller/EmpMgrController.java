package com.home.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.home.model.EmpDao;

public class EmpMgrController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int sabun = Integer.parseInt(req.getParameter("sabun"));
		EmpDao dao = new EmpDao();
		req.setAttribute("list", dao.getMgr(sabun));
		RequestDispatcher rd = req.getRequestDispatcher("editMgr.jsp");
		rd.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int sabun = Integer.parseInt(req.getParameter("sabun"));
		int mgr = Integer.parseInt(req.getParameter("mgr"));
		EmpDao dao = new EmpDao();
		dao.editMgr(sabun,mgr);
		resp.sendRedirect("list.do");
	}
	
}
