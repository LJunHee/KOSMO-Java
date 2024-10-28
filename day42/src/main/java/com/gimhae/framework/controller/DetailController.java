package com.gimhae.framework.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import com.gimhae.framework.model.EmpDao;
import com.gimhae.framework.mvc.MyController;

public class DetailController implements MyController {

	@Override
	public String execute(HttpServletRequest req) {
		int empno = Integer.parseInt(req.getParameter("idx"));
		EmpDao dao = new EmpDao();
		try {
			req.setAttribute("bean", dao.getList(empno));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "emp/detail";
	}

}
