package com.gimhae.emp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.gimhae.emp.model.EmpDaoImpl2;
import com.gimhae.emp.model.EmpDaoImpl;

public class ListController implements Controller {
	EmpDaoImpl dao=new EmpDaoImpl();

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav=new ModelAndView();
		mav.setViewName("emp/list");
		//request.setAttribute("list", dao.pullList());
		mav.addObject("list", dao.pullList());
		return mav;
	}

}