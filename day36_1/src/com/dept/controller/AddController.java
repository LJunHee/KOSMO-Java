package com.dept.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dept.model.DeptDao;
import com.dept.model.DeptDto;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.oreilly.servlet.multipart.FileRenamePolicy;

@WebServlet("/dept/add.do")
public class AddController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rd = req.getRequestDispatcher("/dept/add.jsp");
		rd.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String path = req.getRealPath("./upload");
		FileRenamePolicy policy = new DefaultFileRenamePolicy();
		MultipartRequest mreq = null;
		mreq = new MultipartRequest(req, path,1024*1024*10,policy);
		DeptDto bean = new DeptDto(0,mreq.getParameter("dname"),mreq.getParameter("loc")
				,mreq.getOriginalFileName("file"),mreq.getFilesystemName("file")
			);
		DeptDao dao = new DeptDao();
		try {
			dao.addList(bean);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		resp.sendRedirect("./");
	}
}
