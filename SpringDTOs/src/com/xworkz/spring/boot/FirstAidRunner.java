package com.xworkz.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configaration.SpringConfigaration;
import com.xworkz.spring.dto.FirstAidDTO;
import com.xworkz.spring.service.firstaid.FirstAidService;

public class FirstAidRunner {

	public static void main(String[] args) {
		ApplicationContext container=new AnnotationConfigApplicationContext(SpringConfigaration.class);
	FirstAidService service=container.getBean(FirstAidService.class);
	boolean saved=service.validateAndSave(new FirstAidDTO());
	System.out.println(saved);

	}

}
