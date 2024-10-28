package com.gimhae.emp;

import java.time.LocalDate;
import java.time.ZoneId;

import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gimhae.emp.model.EmpVo;

@Controller
@RequestMapping("/")
public class Ex15Controller {
	
	@RequestMapping("ex14.do")
	public String ex14() {
		return "ex04";
		}
	
	@RequestMapping("ex15.do")
	public String ex15(@ModelAttribute("bean") EmpVo bean) {
//		ZoneId zone = ZoneId.systemDefault();
//		model.addAttribute("bean", new EmpVo(
//			1111,2222,"test",LocalDate.now(zone)
//			));
//		bean.setEmpno(3333);
//		bean.setEname("tester");
//		bean.setPay(4444);
//		bean.setHiredate(LocalDate.now(ZoneId.systemDefault()));
		return "ex05";
	}
}
