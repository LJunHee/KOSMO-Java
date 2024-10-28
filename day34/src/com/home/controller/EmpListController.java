package com.home.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.home.model.EmpDao;


public class EmpListController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EmpDao dao = new EmpDao();
		req.setAttribute("alist", dao.getList());
		RequestDispatcher rd = req.getRequestDispatcher("/emp/list.jsp");
		rd.forward(req, resp);
	}
}
