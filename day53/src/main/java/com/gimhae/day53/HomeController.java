package com.gimhae.day53;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.gimhae.day53.model.GuestDao;
import com.gimhae.day53.model.GuestVo;

@Controller
public class HomeController {
	@Autowired
	GuestDao guestDao;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		System.out.println("index page");
		model.addAttribute("list", guestDao.list());
		return "index";
	}
	
	@GetMapping("/add.do")
	public void add() {}
	
	@PostMapping("/")
	public String add(String name,MultipartFile file,HttpServletRequest req ){
		String origin=file.getOriginalFilename();
		String newName=System.currentTimeMillis()+origin;
		GuestVo bean=GuestVo.builder()
							.name(name)
							.file(origin)
							.path(newName)
							.build();
		try {
			File upload=new File(req.getRealPath("./resources")+"/"+newName);
			System.out.println(upload.getCanonicalPath());
			file.transferTo(upload);
		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
		}
		guestDao.add(bean);
		return "redirect:./";
	}
	@GetMapping("/login")
	public String login(HttpSession session) {
		session.setAttribute("user", "root");
		return "redirect:./";
	}
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:./";
	}
	@GetMapping(value = "/download")
	public void download2(HttpSession session,HttpServletRequest req,HttpServletResponse resp
			,@RequestParam("o") String origin, @RequestParam("f") String newName) {
		if(session.getAttribute("user")==null || !session.getAttribute("user").equals("root")) {
			try {
				resp.sendRedirect("./");
			} catch (IOException e) {
				e.printStackTrace();
			}
			return;
		}
		resp.setContentType("application/octet-stream");
		resp.setHeader("Content-Disposition","attachment; filename=\""+origin+"\"");
		File upload=new File(req.getRealPath("./resources")+"/"+newName);
		try(
				InputStream is=new FileInputStream(upload);
				OutputStream os=resp.getOutputStream();
				){
			int cnt=-1;
			while((cnt=is.read())!=-1) {
				os.write(cnt);
			}
		} catch (FileNotFoundException e) {
					e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@GetMapping("/{origin}/{newName:.+}")
	public void download3(HttpSession session,HttpServletRequest req,HttpServletResponse resp
			,@PathVariable String origin, @PathVariable String newName) {
		if(session.getAttribute("user")==null || !session.getAttribute("user").equals("root")) {
			try {
				resp.sendRedirect("../");
			} catch (IOException e) {
				e.printStackTrace();
			}
			return;
		}
		resp.setContentType("application/octet-stream");
		resp.setHeader("Content-Disposition","attachment; filename=\""+origin+"\"");
		File upload=new File(req.getRealPath("./resources")+"/"+newName);
		try(
				InputStream is=new FileInputStream(upload);
				OutputStream os=resp.getOutputStream();
				){
			int cnt=-1;
			while((cnt=is.read())!=-1) {
				os.write(cnt);
			}
		} catch (FileNotFoundException e) {
					e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@GetMapping("/add2")
	public void add2() {}
	@PostMapping("/add2")
	public void add2(MultipartFile[] files) {
		for(MultipartFile file : files) {
			System.out.println(file.getOriginalFilename());
		}
	}
}












