package com.gimhae.day50;

import java.net.URI;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.core.JsonFactory;
import com.gimhae.day50.model.DeptVo;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/intro")
	public void intro() {
	}
	
	@GetMapping("/emp/")
	public String emp() {
		return "emp";
	}
	
	@GetMapping("/dept/")
	public String dept(Model model) {
		RestTemplate template = new RestTemplate();
		String msg = template.getForObject("http://localhost:8080/day49/api/dept/", String.class);
		model.addAttribute("list", msg);
		return "dept";
	}
	
	@PostMapping("/dept/")
	public String dept(String dname, String loc) {
		RestTemplate template = new RestTemplate();
		URI url = UriComponentsBuilder
				.fromUriString("http://localhost:8080")
				.path("/day49/api/dept/")
				.queryParam("dname", dname)
				.queryParam("loc", loc)
				.build().toUri();
		template.postForLocation(url, null);
		return "redirect:./";
	}
	
	@GetMapping("/dept/add")
	public String add() {
		return "add";
	}
	
	@GetMapping("/dept/{deptno}")
	public String detail(@PathVariable int deptno,Model model) {
		RestTemplate template = new RestTemplate();
		DeptVo msg = template.getForObject("http://localhost:8080/day49/api/dept/"+deptno, DeptVo.class);
//		ResponseEntity<DeptVo> msg = template.getForEntity("http://localhost:8080/day49/api/dept/"+deptno, DeptVo.class);
//		System.out.println(msg.getHeaders());
//		System.out.println(msg.getBody());
		model.addAttribute("bean",msg);
		return "detail";
	}
	
	@PostMapping("/dept/{deptno}")
	public String edit(@PathVariable int deptno, @ModelAttribute DeptVo bean) {
		RestTemplate template = new RestTemplate();
		
		MultiValueMap<String, String> headers = new LinkedMultiValueMap();
		headers.add("Content-Type", "application/json");
	
		String body = "{\"dname\":\""+bean.getDname()
						+"\",\"loc\":\""+bean.getLoc()+"\",\"deptno\":"+bean.getDeptno()+"}";
	
		HttpEntity requestEntity = new HttpEntity<String>(body, headers);
		
		URI url = UriComponentsBuilder.fromUriString("http://localhost:8080")
					.path("/day49/api/dept/"+deptno).build().toUri();
		template.exchange(url, HttpMethod.PUT, requestEntity, String.class);
		return "redirect:./";
	}
	
}
