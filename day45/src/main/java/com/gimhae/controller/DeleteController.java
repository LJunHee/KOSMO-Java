package com.gimhae.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.gimhae.model.EmpDao;

public class DeleteController implements Controller {
	EmpDao empDao;

	@Autowired
	public void setEmpDao(EmpDao empDao) {
		this.empDao = empDao;
	}
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
	    throws Exception {
		int empno = Integer.parseInt(request.getParameter("empno"));
		empDao.rmList(empno);
		return new ModelAndView("redirect:list.do");
	}

}
