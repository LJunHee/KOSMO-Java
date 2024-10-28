package com.emp.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.emp.model.EmpDao;
import com.emp.model.EmpDto;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@WebServlet("/emp/add.do")
public class AddController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rd = req.getRequestDispatcher("/emp/add.jsp");
		rd.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String path = "D:\\workspace\\download";
		MultipartRequest request = new MultipartRequest(
			req,path,1024*1024*10,new DefaultFileRenamePolicy()
			);
		EmpDao dao = new EmpDao();
		try {
			dao.addList(new EmpDto(
				0,Integer.parseInt(request.getParameter("pay")),request.getParameter("ename"),null,
				request.getOriginalFileName("file"),request.getFilesystemName("file")
				));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		resp.sendRedirect("./");
	}
}
