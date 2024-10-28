package com.gimhae.day54;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gimhae.day54.model.DeptDao;
import com.gimhae.day54.model.DeptVo;

@RestController
public class HomeController {
	@Autowired
	DeptDao deptDao;
//	SqlSession sqlSession;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ResponseEntity<?> home() {
//		DeptDao deptDao=sqlSession.getMapper(DeptDao.class);
		return ResponseEntity.ok(deptDao.pullList());
	}
	
	@PostMapping("/")
	public ResponseEntity<?> add(@ModelAttribute DeptVo bean){
//		DeptDao deptDao=sqlSession.getMapper(DeptDao.class);
		deptDao.addList(bean);
		return ResponseEntity.ok().build();
	}
}








