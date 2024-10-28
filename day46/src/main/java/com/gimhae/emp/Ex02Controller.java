package com.gimhae.emp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Ex02Controller {
	
	@RequestMapping("/ex02.do")
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
	    throws Exception {
		return new ModelAndView("ex02");
	}

}
