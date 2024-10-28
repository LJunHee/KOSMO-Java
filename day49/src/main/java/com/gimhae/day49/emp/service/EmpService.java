package com.gimhae.day49.emp.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gimhae.day49.emp.model.EmpDao;
import com.gimhae.day49.emp.model.EmpVo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmpService {
	private final EmpDao empDao;
	
	@Transactional
	public List<?> list() {
		return empDao.pullList();
	}
	
	@Transactional
	public EmpVo one(int empno) {
		return empDao.getList(empno);
	}
	
	@Transactional
	public boolean add(EmpVo bean) {
		try {
			empDao.addList(bean);
		}catch (Exception e) {
			return false;
		}
		return true;
	}
	
	@Transactional
	public EmpVo addAndGet(EmpVo bean)	{
		empDao.addList(bean);
		return empDao.getLastList();
	}
	
	@Transactional
	public EmpVo getAndEdit(EmpVo bean) {
		return empDao.setList(bean)>0?bean:one(bean.getEmpno());
	}
	
	@Transactional
	public boolean edit(EmpVo bean) {
		return empDao.setList(bean)>0?true:false;
	}
	
	@Transactional
	public EmpVo getAndDelete(int empno) {
		EmpVo before = one(empno);
		if(before == null) return null;
		return empDao.rmList(before.getEmpno())>0?before:null;			
	}
	
	@Transactional
	public boolean delete(int empno) {
		return empDao.rmList(empno)>0?true:false;
	}
}


















