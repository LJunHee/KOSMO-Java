package com.gimhae.day51.api;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gimhae.day51.dept.model.DeptDao;
import com.gimhae.day51.dept.model.DeptVo;

@RestController
@CrossOrigin(
		originPatterns = {"http://127.0.0.*","http://192.168.0.5"}
		,methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT}
		)
@RequestMapping("/api/")
public class DeptController {
	@Autowired
	SqlSession sqlSession;

	@GetMapping("dept/")
	public List<DeptVo> list(){
		return sqlSession.getMapper(DeptDao.class).pullList();
	}
	
	@GetMapping("dept/{deptno}")
	public DeptVo detail(@PathVariable int deptno) {
		return sqlSession.getMapper(DeptDao.class).getList(deptno);
	}
	
	@PutMapping("dept/{deptno}")
	public boolean update(@RequestBody DeptVo bean) {
		return sqlSession.getMapper(DeptDao.class).setList(bean)>0;
	}
	
	@DeleteMapping("dept/{deptno}")
	public boolean delete(@PathVariable int deptno) {
		return sqlSession.getMapper(DeptDao.class).rmList(deptno)>0;
	}
	
	@PostMapping("dept/")
	public boolean add(@ModelAttribute DeptVo bean) {
		sqlSession.getMapper(DeptDao.class).addList(bean);
		return true;
	}
}









