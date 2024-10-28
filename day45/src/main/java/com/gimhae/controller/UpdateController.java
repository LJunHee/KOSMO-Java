package com.gimhae.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import com.gimhae.model.EmpDao;
import com.gimhae.model.EmpVo;

public class UpdateController extends AbstractCommandController {
	EmpDao empDao;
	
	@Autowired
	public void setEmpDao(EmpDao empDao) {
		this.empDao = empDao;
	}
	
	@Override
	protected ModelAndView handle(HttpServletRequest request, HttpServletResponse response,
	    Object command, BindException errors) throws Exception {
		EmpVo bean = (EmpVo) command;
		empDao.setList(bean);
		return new ModelAndView("redirect:list.do");
	}

}
