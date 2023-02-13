package com.xworkz.egg.configaration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class EggApplicationInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {
public EggApplicationInit() {
	System.out.println("created "+this.getClass().getSimpleName() );
}
	@Override
	protected Class<?>[] getRootConfigClasses() {
	System.out.println("getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("getServletConfigClasses");
		return new Class[] {EggApplicationConfigaration.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("getServletMappings");
		return new String[] {"/"};
		
	}
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
}


