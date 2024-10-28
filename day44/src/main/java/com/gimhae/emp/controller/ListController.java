package com.gimhae.emp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.gimhae.emp.model.EmpDao;
import com.gimhae.emp.model.EmpDaoImpl;
import com.gimhae.emp.model.EmpDao;

public class ListController implements Controller {
	EmpDao empDao = new EmpDaoImpl();
	
	public void setEmpDao(EmpDao empDao) {
		this.empDao = empDao;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.addObject("list",empDao.pullList());
		mav.setViewName("emp/list");
		return mav;
	}

}
