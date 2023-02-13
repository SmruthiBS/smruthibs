package com.xworkz.egg.configaration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

@Configuration
@ComponentScan("com.xworkz.egg")
public class EggApplicationConfigaration 
{
	public EggApplicationConfigaration() 
	{
		System.out.println("created "+this.getClass().getSimpleName());
	}
	@Bean
public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean() {
System.out.println("registering localContainerEntityManagerFactoryBean");	
LocalContainerEntityManagerFactoryBean bean=new LocalContainerEntityManagerFactoryBean();
return bean;
	}
}
