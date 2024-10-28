package com.gimhae.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gimhae.framework.mvc.MyController;
import com.gimhae.model.EmpDao;

public class DeleteController implements MyController {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse arg1) {
		int empno=Integer.parseInt(req.getParameter("empno"));
		EmpDao dao=new EmpDao();
		try {
			dao.rmList(empno);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "redirect:list.do";
	}

}