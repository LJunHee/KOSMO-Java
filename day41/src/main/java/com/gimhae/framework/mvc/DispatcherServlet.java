package com.gimhae.framework.mvc;

import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherServlet extends HttpServlet {
	Map<String,String> handler = new HashMap<>();
	
	@Override
	public void init() throws ServletException {
		//handlerMapping
		Enumeration<String> enu = this.getInitParameterNames();
		while(enu.hasMoreElements()) {
			String key = enu.nextElement();
			String val = this.getInitParameter(key);
			handler.put(key,val);
		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doDo(req,resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doDo(req,resp);		
	}
	protected void doDo(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String path = req.getRequestURI();
		System.out.println(req.getContextPath());
		MyController controller = null;
		try {
			Class clz = null;
			String info = null;
			
			info = handler.get(path.substring(req.getContextPath().length()));
			if(info==null) {
				resp.sendError(HttpServletResponse.SC_NOT_FOUND);
				return;
			}
			clz = Class.forName(info);
			controller = (MyController) clz.getDeclaredConstructor().newInstance();
			
			//viewResolver
			String prefix =  "/WEB-INF/views/";
			String suffix = ".jsp";
			String viewName = controller.execute(req,resp);
			if(viewName.startsWith("redirect:")) {
				resp.sendRedirect(viewName.substring("redirect:".length()));
			} else {
				RequestDispatcher rd = req.getRequestDispatcher(prefix+viewName+suffix);
				rd.forward(req, resp);				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
