package com.gimhae.emp.service;

import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.gimhae.emp.model.EmpDao;
import com.gimhae.emp.model.EmpVo;

@Component
//@Service
public class EmpServiceImpl implements EmpService {
	@Autowired
	EmpDao<EmpVo> empDao;

	@Override
	public void list(Model model){
		List<EmpVo> list=empDao.pullList();
		int size=empDao.listSize();
		model.addAttribute("list", list);
		model.addAttribute("leng", size);
	}
	
	@Override
	public int add(EmpVo bean) {
		empDao.addList(bean);
		List<EmpVo> list=empDao.pullList();
		list.sort(new Comparator<EmpVo>() {

			@Override
			public int compare(EmpVo o1, EmpVo o2) {
				return o2.getEmpno()-o1.getEmpno();
			}
		});
		return list.get(0).getEmpno();
	}
	
	@Override
	public void oneList(Model model,int empno) {
		EmpVo target=empDao.getList(empno);
		target.setPay(target.getPay()+1);
		empDao.setList(target);
		model.addAttribute("bean",empDao.getList(empno));
	}
	
	@Override
	public boolean editList(EmpVo bean) {
		return empDao.setList(bean)>0;
	}
	@Override
	public boolean removeList(int empno) {
		return empDao.rmList(empno)>0;
	}
}















