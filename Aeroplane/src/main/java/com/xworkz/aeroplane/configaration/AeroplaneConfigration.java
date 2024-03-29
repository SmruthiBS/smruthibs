package com.xworkz.aeroplane.configaration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.aeroplane")
public class AeroplaneConfigration {
public AeroplaneConfigration() {
	System.out.println("created "+this.getClass().getSimpleName());
}
@Bean
public ViewResolver viewResolver() {
	System.out.println("registering custom view resolver");
	return new InternalResourceViewResolver("/", ".jsp");
}
@Bean
public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean() {
	System.out.println("registering localContainerEntityManagerFactoryBean");
	return new LocalContainerEntityManagerFactoryBean();
}
}
