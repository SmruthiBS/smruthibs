package com.xworkz.food_item.configaration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class fiInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {
public fiInit() {
System.out.println("created "+this.getClass().getSimpleName());
}
	@Override
	protected Class<?>[] getRootConfigClasses() {
	System.out.println("running getRootConfigClasses ");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("running getServletConfigClasses ");
		Class[] ref= {fiConfigaration.class};
		return ref;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("running getServletMappings ");
	return new String[] {"/"};
	}
@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
}
