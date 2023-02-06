package com.xworkz.goa.configaration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.xworkz.goa")
public class GoaConfigaration {
	public GoaConfigaration() {
	System.out.println("running goa configaration");
	}

}
