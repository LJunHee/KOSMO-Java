package com.gimhae.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gimhae.framework.mvc.MyController;
import com.gimhae.model.EmpDao;

public class InsertController implements MyController {
	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		String ename = req.getParameter("ename");
		int pay = Integer.parseInt(req.getParameter("pay"));
		EmpDao dao = new EmpDao();
		try {
			dao.addList(ename,pay);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "redirect:list.do";
	}
}
