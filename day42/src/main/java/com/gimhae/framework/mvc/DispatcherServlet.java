package com.gimhae.framework.mvc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherServlet extends HttpServlet {
	Map<String,MyController> handler;
	
	@Override
	public void init() throws ServletException {
		handler=new HashMap<>();
		Properties props=new Properties();
		File f=new File("C:\\workspace\\day42\\src\\main\\resources\\framework.properties");
		Reader reader;
		try {
			reader = new FileReader(f);
			props.load(reader);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Set<Entry<Object, Object>> entrys = props.entrySet();
		for(Entry<Object, Object> entry:entrys) {
			try {
				Class clz=Class.forName(entry.getValue().toString());
				handler.put(entry.getKey().toString(),(MyController) clz.newInstance() );
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doDo(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doDo(req, resp);
	}
	public void doDo(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String url=req.getRequestURI();
		url=url.substring(req.getContextPath().length());
		MyController controller=handler.get(url);
		if(controller==null) {
			resp.sendError(HttpServletResponse.SC_NOT_FOUND,"NOT_FOUND");
			return;
		}
		String viewName=controller.execute(req);
		if(viewName.startsWith("redirect:")) {
			resp.sendRedirect(viewName.substring("redirect:".length()));
			return;
		}
		String prefix="/WEB-INF/views/";
		String suffix=".jsp";
		viewName=prefix+viewName+suffix;
		RequestDispatcher rd=req.getRequestDispatcher(viewName);
		rd.forward(req, resp);
	}
}













