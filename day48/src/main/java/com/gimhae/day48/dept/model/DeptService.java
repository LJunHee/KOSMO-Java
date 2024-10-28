package com.gimhae.day48.dept.model;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class DeptService {
	@Autowired
	DeptDao deptDao;
	
	public void list(Model model) {
		model.addAttribute("list", deptDao.pullList());
	}

	public void insert(DeptVo deptVo) {
		deptDao.addList(deptVo);
	}

	public void detail(Model model) {
		int deptno=(int) model.asMap().get("deptno");
		model.addAttribute("bean", deptDao.getList(deptno));
	}

	public boolean update(DeptVo bean) {
		String dname=bean.getDname();
		String loc=bean.getLoc();
		try {
			bean.setDname(URLDecoder.decode(dname, "utf-8"));
			bean.setLoc(URLDecoder.decode(loc, "utf-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return deptDao.setList(bean)>0?true:false;
	}

	public boolean delete(int deptno) {
		return deptDao.rmList(deptno)>0?true:false;
	}
}











