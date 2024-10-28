package com.gimhae.framework.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import com.gimhae.framework.model.EmpDao;
import com.gimhae.framework.mvc.MyController;

public class ListController implements MyController {

	@Override
	public String execute(HttpServletRequest req) {
		EmpDao dao=new EmpDao();
		try {
			req.setAttribute("list", dao.pullList());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "emp/index";
	}

}