package com.xworkz.smruthi_xworkz.configaration;


import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;



public class ZooWebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer{
public ZooWebInit() {
System.out.println("created "+this.getClass().getSimpleName());
}
	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("getServletConfigClasses");

		return new Class[] {ZooConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("getServletMappings");
		return new String[] {"/"};
	}
	

}
