package com.emp.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.emp.model.EmpDao;

public class ListController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int page = Integer.parseInt(req.getParameter("p")==null?"1":req.getParameter("p"));
		EmpDao dao = new EmpDao();
		try {
			req.setAttribute("alist", dao.getList(page));
			req.setAttribute("begin", 1);
			req.setAttribute("limit", 4);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		RequestDispatcher rd=req.getRequestDispatcher("/list.jsp");
		rd.forward(req, resp);
	}
	
	
}