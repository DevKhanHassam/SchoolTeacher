package com.School.Config;


import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyDispatcher extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class [] arr = {MyViewResolver.class};
		return arr;
	}

	@Override
	protected String[] getServletMappings() {
		String [] arr = {"/"};
		return arr;
	}

}
