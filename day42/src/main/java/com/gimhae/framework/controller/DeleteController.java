package com.gimhae.framework.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import com.gimhae.framework.model.EmpDao;
import com.gimhae.framework.mvc.MyController;

public class DeleteController implements MyController {

	@Override
	public String execute(HttpServletRequest req) {
		int empno=Integer.parseInt(req.getParameter("empno"));
		EmpDao dao=new EmpDao();
		try {
			dao.rmList(empno);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "redirect:/emp/index.do";
	}

}