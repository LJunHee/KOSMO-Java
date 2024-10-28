package com.gimhae;

import java.io.File;

import org.apache.catalina.Context;
import org.apache.catalina.Globals;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class App {
	
	public static void main(String[] args) {
		Tomcat server = new Tomcat();
		int port = 7070;
		server.setPort(port);
		server.addWebapp("/", new File("www").getAbsolutePath());
		Context cntxt = server.addWebapp("/", new File("www").getAbsolutePath());
		cntxt.getServletContext().setAttribute(Globals.ALT_DD_ATTR, "/WEB-INF/web.xml");
		server.initWebappDefaults(cntxt);
		try {
			server.start();
		} catch (LifecycleException e) {
			e.printStackTrace();
		}
		server.getServer().await();
	}
}
