package com.xworkz.food_item.configaration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.food_item")
public class fiConfigaration {
	public fiConfigaration() {
	System.out.println("created "+this.getClass().getSimpleName());
	
	}

}
