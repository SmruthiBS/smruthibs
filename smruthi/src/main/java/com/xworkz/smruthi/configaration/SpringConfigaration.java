package com.xworkz.smruthi.configaration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan("com.xworkz.smruthi")
public class SpringConfigaration {
public SpringConfigaration() {
	System.out.println("created "+this.getClass().getSimpleName());
}
}
