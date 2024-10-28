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

@WebServlet("/emp/add.do")
public class AddController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("ename", req.getParameter("ename"));
		req.setAttribute("pay", req.getParameter("pay"));
		RequestDispatcher rd = req.getRequestDispatcher("/emp/add.jsp");
		rd.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String ename = req.getParameter("ename");
		if(ename==null||ename.trim().isEmpty()) {
			req.setAttribute("errEname", "*이름을 입력하세요");
			doGet(req,resp);
			return;
		}
		int pay = -1;
		String param = req.getParameter("pay");
		if(param==null||param.trim().isEmpty()) {
			req.setAttribute("errPay", "*금액을 입력하세요");
			doGet(req,resp);
			return;
		}
		try {
			pay =  Integer.parseInt(param);
		} catch (Exception e){
			if(ename==null||ename.trim().isEmpty()) {
				req.setAttribute("errEname", "숫자를 입력하세요");
				doGet(req,resp);
				return;
			}
		}
		
		EmpDto bean = new EmpDto(0,pay,ename,null);
		
		EmpDao dao = new EmpDao();
		try {
			dao.pushList(bean);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		resp.sendRedirect("./?success=true");
	}
}
