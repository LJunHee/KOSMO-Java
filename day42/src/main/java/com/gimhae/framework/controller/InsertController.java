package com.gimhae.framework.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import com.gimhae.framework.model.EmpDao;
import com.gimhae.framework.model.EmpDto;
import com.gimhae.framework.mvc.MyController;

public class InsertController implements MyController {
	@Override
	public String execute(HttpServletRequest req) {
		EmpDto bean = new EmpDto(0,Integer.parseInt(req.getParameter("pay")),req.getParameter("ename"),null);
		EmpDao dao = new EmpDao();
		try {
			dao.addList(bean);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "redirect:index.do";
	}
}
