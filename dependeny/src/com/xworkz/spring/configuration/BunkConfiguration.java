package com.xworkz.spring.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan("com.xworkz.spring")
public class BunkConfiguration {
	public BunkConfiguration() {
	System.out.println("running configuration");
	}

}
