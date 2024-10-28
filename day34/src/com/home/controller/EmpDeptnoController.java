package com.home.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.home.model.DeptDao;
import com.home.model.EmpDao;

public class EmpDeptnoController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		DeptDao dao = new DeptDao();
		req.setAttribute("alist", dao.getList());
		RequestDispatcher rd = req.getRequestDispatcher("editDept.jsp");
		rd.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int sabun = Integer.parseInt(req.getParameter("sabun"));
		int deptno = Integer.parseInt(req.getParameter("deptno"));
		EmpDao dao = new EmpDao();
		dao.editDeptno(sabun,deptno);
		resp.sendRedirect("list.jsp");
	}
}
