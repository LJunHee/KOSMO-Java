package com.gimhae.day52.service;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.gimhae.day52.model.DeptDao;
import com.gimhae.day52.model.DeptVo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DeptService {
	final DeptDao deptDao;
	
	public void list(Model model) {
		model.addAttribute("list", deptDao.pullList());
	}
	
	public DeptVo detail(int deptno) {
		return deptDao.getList(deptno);
	}

	public void add(DeptVo bean) {
		System.out.println(deptDao.addList(bean));
	}
	
	public void edit(DeptVo bean) {
		System.out.println(deptDao.setList(bean));
	}
	
	public void delete(int deptno) {
		System.out.println(deptDao.rmList(deptno));
	}
}





