package com.gimhae.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gimhae.framework.mvc.MyController;
import com.gimhae.model.EmpDao;

public class ListController implements MyController{
	
	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		EmpDao dao = new EmpDao();
		try {
			req.setAttribute("alist", dao.pullList());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "emp/list";
	}

}
