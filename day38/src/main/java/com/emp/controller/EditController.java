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

@WebServlet("/emp/edit.do")
public class EditController extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int empno = Integer.parseInt(req.getParameter("empno"));
		EmpDao dao = new EmpDao();
		try {
			req.setAttribute("bean", dao.getList(empno));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		RequestDispatcher rd= req.getRequestDispatcher("edit.jsp");
		rd.forward(req, resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EmpDto bean  = new EmpDto(
			Integer.parseInt(req.getParameter("empno")),
			Integer.parseInt(req.getParameter("pay")),req.getParameter("ename"),null
			);
		EmpDao dao = new EmpDao();
		try {
			dao.editList(bean);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		resp.sendRedirect("./?success=true");
	}

}
