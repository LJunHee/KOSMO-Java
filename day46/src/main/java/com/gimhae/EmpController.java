package com.gimhae;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gimhae.emp.model.EmpDao;
import com.gimhae.emp.model.EmpVo;

@Controller
@RequestMapping("/emp/")
public class EmpController {
	@Autowired
	EmpDao empDao;

	@RequestMapping("list")
	public void list(Model model) {
		model.addAttribute("list", empDao.pullList());
	}
	
	@RequestMapping(value = "add", method=RequestMethod.GET)
	public void add() {}
	
	@RequestMapping(value = "add",method = RequestMethod.POST)
	public String add(String ename,int pay) {
		empDao.addList(ename,pay);
		return "redirect:list";
	}
	
	@RequestMapping("detail")
	public void detail(@ModelAttribute("bean") EmpVo bean) {
		EmpVo result=empDao.getList(bean.getEmpno());
		bean.setEname(result.getEname());
		bean.setHiredate(result.getHiredate());
		bean.setPay(result.getPay());
	}
	
	@RequestMapping( value = "edit",method=RequestMethod.GET)
	public void edit(@ModelAttribute("bean") EmpVo bean) {
		EmpVo result=empDao.getList(bean.getEmpno());
		bean.setEname(result.getEname());
		bean.setHiredate(result.getHiredate());
		bean.setPay(result.getPay());
	}
	
	@RequestMapping( value = "edit",method=RequestMethod.POST)
	public String update(@ModelAttribute("bean") EmpVo bean) {
		empDao.setList(bean);
		return "redirect:list";
	}
	
	@RequestMapping(value = "delete",method = RequestMethod.POST)
	public ModelAndView delete(@RequestParam("empno")int empno) {
		empDao.rmList(empno);
		return null;
	}
}













