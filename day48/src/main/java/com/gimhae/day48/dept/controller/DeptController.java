package com.gimhae.day48.dept.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gimhae.day48.dept.model.DeptService;
import com.gimhae.day48.dept.model.DeptVo;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/dept/")
public class DeptController {
	@Autowired
	DeptService deptService;

	@GetMapping("")
	public String list(Model model) {
		deptService.list(model);
		return "dept/list";
	}
	
	@GetMapping("add")
	public void add() {}
	
	@PostMapping("")
	public String add(int deptno,String dname,String loc) {
		deptService.insert(new DeptVo(deptno,dname,loc));
		return "redirect:./";
	}
	
	@GetMapping("{deptno}")
	public String detail(@PathVariable int deptno,Model model) {
		model.addAttribute("title", "Detail");
		model.addAttribute("readonly", "readonly");
		model.addAttribute("deptno", deptno);
		deptService.detail(model);
		return "dept/one";
	}
	
	@PutMapping(value="{deptno}",produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String update(@PathVariable int deptno
				,HttpServletRequest req) throws IOException {
		DeptVo bean=new DeptVo();
		try(
				InputStream is=req.getInputStream();
				InputStreamReader isr=new InputStreamReader(is);
				BufferedReader br=new BufferedReader(isr);
				){
			String line=br.readLine();
			String[] params=line.split("&");
			for(String param : params) {
				if(param.startsWith("deptno=")) 
					bean.setDeptno(Integer.parseInt(param.split("=")[1])); 
				if(param.startsWith("dname=")) 
					bean.setDname(param.split("=")[1]); 
				if(param.startsWith("loc=")) 
					bean.setLoc(param.split("=")[1]); 
			}
			boolean result=deptService.update(bean);
			Gson gson=new Gson();
			Map<String ,String> json=new LinkedHashMap<>();
			json.put("result", result+"");
			return gson.toJson(json);
		}
	}
	
	@DeleteMapping(value = "{deptno}",produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String delete(@PathVariable int deptno) {
		boolean result=deptService.delete(deptno);
		JsonObject json=new JsonObject();
		json.addProperty("result", result+"");
		return new Gson().toJson(json);
	}
	
	@GetMapping(value = "test",produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String hello() {
		//https://google.github.io/gson/UserGuide.html
		JsonObject json=new JsonObject();
		json.addProperty("key1", "val1");
		
		Gson gson = new Gson();
		
//		return gson.toJson(json);
		DeptVo bean=new DeptVo(1,"test","test");
		return gson.toJson(bean);
	}
}










