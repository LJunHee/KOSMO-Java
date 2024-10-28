package com.gimhae.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import com.gimhae.model.EmpDao;
import com.gimhae.model.EmpVo;

public class InsertController extends AbstractCommandController {
	EmpDao empDao;
	
	@Autowired
	public void setEmpDao(EmpDao empDao) {
		this.empDao = empDao;
	}

	@Override
	protected void onBindAndValidate(HttpServletRequest request, Object command, BindException errors)
			throws Exception {
		if(errors.getErrorCount()>0) {
			FieldError error=errors.getFieldErrors().get(0);
			ObjectError error2=new ObjectError("pay", " pay 빈 값을 허용하지 않음");
			errors.addError(error2);
		}
		EmpVo bean=(EmpVo) command;
		if(bean.getEname().isEmpty()) {
			ObjectError error=new ObjectError("ename", " ename 빈 값을 허용하지 않음");
			errors.addError(error);
		}
	}

	@Override
	protected ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
//		errors.getAllErrors().get(0).getDefaultMessage();
		if(errors.getErrorCount()>0)return new ModelAndView("emp/add","errs",errors);
		EmpVo bean=(EmpVo) command;
		empDao.addList(bean);
		return new ModelAndView("redirect:list.do");
	}


}








