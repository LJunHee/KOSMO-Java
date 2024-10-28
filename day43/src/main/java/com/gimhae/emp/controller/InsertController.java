package com.gimhae.emp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.gimhae.emp.model.EmpDaoImpl2;
import com.gimhae.emp.model.EmpDaoImpl;

public class InsertController implements Controller {
	EmpDaoImpl dao=new EmpDaoImpl();
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav=new ModelAndView();
		if(request.getMethod().equals("POST")) {
			String ename=request.getParameter("ename");
			if(ename.trim().isEmpty()) {
				mav.setViewName("emp/add");
				mav.addObject("pay", request.getParameter("pay"));
				mav.addObject("enameErr", "빈값을 허용하지 않습니다");
				return mav;
			}
			int pay=0;
			try {
				pay=Integer.parseInt(request.getParameter("pay"));
			}catch (NumberFormatException e) {
				mav.setViewName("emp/add");
				mav.addObject("ename", request.getParameter("ename"));
				mav.addObject("payErr", "숫자만 입력하세요");
				return mav;
			}
			
			dao.addList(ename,pay);
			mav.setViewName("redirect:list.do");
		}else {
			mav.setViewName("emp/add");
		}
		return mav;
	}

}