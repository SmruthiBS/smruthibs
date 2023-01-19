package com.xworkz.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configaration.SpringConfigaration;
import com.xworkz.spring.dto.MissileDTO;
import com.xworkz.spring.service.missile.MissileService;

public class MissileRunner {
	public static void main(String[] args) {
		ApplicationContext container=new AnnotationConfigApplicationContext(SpringConfigaration.class);
		 MissileService service=container.getBean(MissileService.class);
		boolean saved= service.validateAndSave(new MissileDTO());
		System.out.println(saved);
		 
	}

}
