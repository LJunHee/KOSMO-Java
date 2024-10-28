package com.gimhae.emp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class Ex16Controller {
	
	@RequestMapping("/ex16.do")
	public String ex16() {
		return "ex02";
	}
	
	@RequestMapping("/ex17.do")
	public String ex17() {
		return "ex04";		
	}
	
	@RequestMapping("/ex18.do")
	public String ex18() {		
		return "ex06";		
	}
}
