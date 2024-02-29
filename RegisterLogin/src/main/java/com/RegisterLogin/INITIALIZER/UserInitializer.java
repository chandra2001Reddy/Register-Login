package com.RegisterLogin.INITIALIZER;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.RegisterLogin.Configure;

public class UserInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {		
		return new Class[] {Configure.class};
	}

	@Override
	protected String[] getServletMappings() {		
		return new String[] {"/"};
	}

}
