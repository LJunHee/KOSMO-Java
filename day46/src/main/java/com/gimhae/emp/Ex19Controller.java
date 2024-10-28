package com.gimhae.emp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Ex19Controller {
	
	@RequestMapping("/{msg}/{msg2}.do")
	public String ex19( Model model,
		@PathVariable("msg") String msg,
		@PathVariable("msg2") String msg3) {
		model.addAttribute("msg", msg);
		model.addAttribute("msg2", msg3);
		return "ex01";
	}
}
