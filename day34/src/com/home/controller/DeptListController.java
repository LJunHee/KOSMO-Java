package com.home.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.home.model.DeptDao;
import com.home.model.DeptDto;

public class DeptListController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//model
		DeptDao dao = new DeptDao();
		List<DeptDto> list = dao.getList();
		req.setAttribute("alist", list);
		
		//view 위임
		RequestDispatcher rd = req.getRequestDispatcher("/dept/list.jsp");
		rd.forward(req, resp);
	}
}
