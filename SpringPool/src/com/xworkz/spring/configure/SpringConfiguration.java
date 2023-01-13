package com.xworkz.spring.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.spring.bean.Area;
import com.xworkz.spring.bean.Assistant;
import com.xworkz.spring.bean.Company;
import com.xworkz.spring.bean.Location;
import com.xworkz.spring.bean.Producer;
@Configuration
@ComponentScan("com.xworkz.spring")
public class SpringConfiguration {
	public SpringConfiguration() {
		System.out.println("running spring configuration");
	}
	
}
