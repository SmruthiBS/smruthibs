package com.xworkz.bakery.configaration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.bakery")
public class BakeryConfigaration {
public BakeryConfigaration() {
	System.out.println("created "+this.getClass().getSimpleName());
}
}
