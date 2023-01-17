package com.xworkz.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.spring.interfaces.Browser;

@Configuration
@ComponentScan("com.xworkz.spring")
public class BrowserConfigaration {
	public BrowserConfigaration() {
		System.out.println("running browswe configaration");
	}
	//@Bean
//public Browser browser() {
	//return null;
	
}//


