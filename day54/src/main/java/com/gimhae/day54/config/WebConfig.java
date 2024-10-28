package com.gimhae.day54.config;

import javax.servlet.Filter;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebConfig 
	extends AbstractAnnotationConfigDispatcherServletInitializer{

//<listener>
//	<listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
//</listener>
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] {RootConfig.class};
	}

//<servlet>
//	<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
//</servlet>
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {ServletConfig.class};
	}

//<servlet-mapping>
//	<url-pattern>/</url-pattern>
//</servlet-mapping>
	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}

	@Override
	protected Filter[] getServletFilters() {
		CharacterEncodingFilter filter=null;
		filter=new CharacterEncodingFilter();
		filter.setEncoding("utf-8");
		filter.setForceEncoding(true);
		return new Filter[] {filter};
	}
}












