package com.xworkz.smruthi_xworkz.configaration;


import java.io.File;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;


import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import lombok.extern.slf4j.Slf4j;


@Slf4j
public class ZooWebInit extends AbstractAnnotationConfigDispatcherServletInitializer 
implements WebMvcConfigurer{
public ZooWebInit() {
	log.info("created "+this.getClass().getSimpleName());

}
	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		log.info("getServletConfigClasses");

		return new Class[] {ZooConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		log.info("getServletMappings");
		return new String[] {"/"};
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) 
	{
		log.info("running the configureDefaultServletHandling");
		configurer.enable();
	}
	@Override
		protected void customizeRegistration(Dynamic registration) {
			String tempDir="D:\\temp";
			int maxUploadSizeInMb=3*1024*1024;
			File uploadDirectory=new File(tempDir);
			MultipartConfigElement element=new MultipartConfigElement(uploadDirectory.getAbsolutePath(), maxUploadSizeInMb, maxUploadSizeInMb*2, maxUploadSizeInMb/2);
			registration.setMultipartConfig(element);
			super.customizeRegistration(registration);
		}
}
