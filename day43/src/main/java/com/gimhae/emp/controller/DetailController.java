package com.gimhae.emp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.gimhae.emp.model.EmpDaoImpl2;
import com.gimhae.emp.model.EmpDaoImpl;

public class DetailController implements Controller {
	EmpDaoImpl dao=new EmpDaoImpl();
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav=new ModelAndView();
		int empno=Integer.parseInt(request.getParameter("idx"));
		mav.addObject("bean", dao.getList(empno));
		mav.addObject("detail", "readonly");
		return mav;
	}

}