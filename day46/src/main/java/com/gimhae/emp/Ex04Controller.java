package com.gimhae.emp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

// POJO

@Controller
public class Ex04Controller {
	
	@RequestMapping("/ex04.do")
	public String ex04Page() {
		return "ex04";
	}
	
	@RequestMapping("/ex05.do")
	public String ex05page(HttpServletRequest req) {
		req.setAttribute("msg", "ex05 page");
		return "ex01";
	}
	
	@RequestMapping("/test/ex06.do")
	public void ex06() {
	}
	
	@RequestMapping("/ex07.do")
	public View ex07() {
		return new View() {
			
			@Override
			public void render(Map<String, ?> model, HttpServletRequest request,
			    HttpServletResponse response) throws Exception {
				PrintWriter out = null;
				try{
					out = response.getWriter();
					out.print("<h1>ex07 page</h1>");
				} finally {
					if(out!=null) out.close();
				}
			}
			
			@Override
			public String getContentType() {
				return "text/html; charset=utf-8";
			}
			
		};
	}
	
	@RequestMapping("/ex08.do")
	public ModelAndView ex08() {
		return null;
	}
	
	@RequestMapping("/ex09.do")
	public String ex09(HttpServletRequest req) {
		req.setAttribute("msg", "ex09 page");
		return "ex01";
	}
	
	@RequestMapping("/ex10.do")
	public String ex10(Model model) {
		model.addAttribute("msg","ex10 page");
		return "ex01";
	}
	
	@RequestMapping("/ex11.do")
	public void ex11(HttpServletResponse res) throws IOException {
		PrintWriter out = null;
		try {
			out = res.getWriter();		
			out.print("<h1>ex11 page</h1>");
		} finally {
			if(out!=null) out.close();
		}
	}
}
 