package com.example.mvc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ServletIntilizer extends AbstractAnnotationConfigDispatcherServletInitializer {
	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] confiles = {Webconfig.class};
		return confiles;
	}

	@Override
	protected String[] getServletMappings() {
		String[] mapping = {"/"};
		return mapping;
	}





}
