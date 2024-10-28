package com.gimhae.day49.api;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.gimhae.day49.dept.model.DeptVo;
import com.gimhae.day49.dept.service.DeptService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/dept/")
@RequiredArgsConstructor
public class DeptController {
	private final DeptService deptService;

	@GetMapping("")
	public List<?> list(){
		return deptService.list();
	}
	
	@GetMapping("/{deptno}")
	public DeptVo detail(@PathVariable int deptno) {
		return deptService.getOne(deptno);
	}
	
	@PostMapping(value = "",produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
	public String add(@ModelAttribute DeptVo bean) {
		return deptService.add(bean);
	}
	
	@PutMapping(value = "{deptno}",produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
	public String edit(@RequestBody DeptVo bean) {
		return deptService.edit(bean);
	}
	
	@DeleteMapping(value = "{deptno}",produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
	public String delete(@PathVariable int deptno) {
		return deptService.delete(deptno);
	}
}
























