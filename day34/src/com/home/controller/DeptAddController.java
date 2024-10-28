package com.home.controller;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.home.model.DeptDao;

public class DeptAddController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rd=req.getRequestDispatcher("/dept/add.jsp");
		rd.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String dname=req.getParameter("dname").trim();
		String loc=req.getParameter("loc").trim();
		DeptDao dao=new DeptDao();
		dao.addList(dname,loc);
		String msg="입력성공";
		msg=URLEncoder.encode(msg, "utf-8");
		resp.sendRedirect("list.do?msg="+msg);
	}
}










