package com.gimhae.day52;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gimhae.day52.model.DeptVo;
import com.gimhae.day52.service.DeptService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class HomeController {
	final DeptService deptService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		deptService.list(model);
		return "home";
	}
	
	@GetMapping("/{deptno}")
	@ResponseBody
	public DeptVo detail(@PathVariable int deptno) {
		return deptService.detail(deptno);
	}
	
	@PostMapping("/")
	public ResponseEntity<?> add(@ModelAttribute DeptVo bean){
		deptService.add(bean);
		return ResponseEntity.ok().build();
	}
	
	@PutMapping("/{deptno}")
	public ResponseEntity<?> edit(@RequestBody DeptVo bean) {
		deptService.edit(bean);
		return ResponseEntity.ok().build();
	}
	
	@DeleteMapping("/{deptno}")
	public ResponseEntity<?> delete(@PathVariable int deptno) {
		deptService.delete(deptno);
		return ResponseEntity.ok().build();
	}
}















