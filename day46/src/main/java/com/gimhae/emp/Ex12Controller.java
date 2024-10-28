package com.gimhae.emp;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Ex12Controller {
	
	@RequestMapping(value = "/ex12.do", method = RequestMethod.GET)
	public String ex12() {
		return "ex02";
	}
	
	@RequestMapping(value = "/ex12.do", method = RequestMethod.POST)
	public String ex13(HttpServletRequest req) {
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		req.setAttribute("id", id);
		req.setAttribute("pw", pw);
		return "ex03";
	}
	
	@RequestMapping("/ex13.do")
	public String ex13(Model model, String id, @RequestParam String pw) {
		model.addAttribute("id",id);
		model.addAttribute("pw",pw);
		return "ex03";
	}
}
