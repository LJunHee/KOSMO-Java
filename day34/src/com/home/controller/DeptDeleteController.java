package com.home.controller;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.home.model.DeptDao;

public class DeptDeleteController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int deptno = Integer.parseInt(req.getParameter("deptno"));
		DeptDao dao = new DeptDao();
		dao.removeList(deptno);
		
		String msg = URLEncoder.encode("삭제성공","utf-8");
		resp.sendRedirect("list.do?msg="+msg);
	}

}
