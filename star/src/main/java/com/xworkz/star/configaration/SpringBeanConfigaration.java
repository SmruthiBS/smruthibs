package com.xworkz.star.configaration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.star")
public class SpringBeanConfigaration {
	public SpringBeanConfigaration() {
		System.out.println("created "+this.getClass().getSimpleName());
	}
	

}
