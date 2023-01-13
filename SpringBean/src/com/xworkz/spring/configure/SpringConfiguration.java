package com.xworkz.spring.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@ComponentScan
@Configuration
public class SpringConfiguration {

	public SpringConfiguration() {
		System.out.println("running spring configuration");
	}
@Bean
public int id() {
	System.out.println("registering id");
	return 1;
}
@Bean
public String language() {
	System.out.println("registering language");
	return"english";
}
}
