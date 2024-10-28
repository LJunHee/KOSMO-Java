package com.gimhae;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Ex20Controller {
	
	@RequestMapping("/ex20.do")
	public String ex20() {
		return "ex01";
	}
}
