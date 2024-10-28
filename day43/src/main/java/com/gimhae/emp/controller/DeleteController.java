package com.gimhae.emp.controller;

import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.mvc.Controller;

import com.gimhae.emp.model.EmpDaoImpl2;
import com.gimhae.emp.model.EmpDaoImpl;

public class DeleteController implements Controller {
	EmpDaoImpl dao=new EmpDaoImpl();

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav=new ModelAndView();
		int empno=Integer.parseInt(request.getParameter("idx"));
		int result=dao.rmList(empno);
		mav.setView(new View() {
		
			@Override
			public void render(Map<String, ?> model, HttpServletRequest request, HttpServletResponse response)
					throws Exception {
				try(PrintWriter out=response.getWriter()){
					out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
					out.println("<delete>");
					out.println("<emp>");
					out.println("<empno>"+empno+"</empno>");
					out.println("<result>"+(result>0?true:false)+"</result>");
					out.println("</emp>");
					out.println("</delete>");
				}
			}
			
			@Override
			public String getContentType() {
				return "application/xml; charset=utf-8";
			}
		});
		return mav;
	}

}