package com.xworkz.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configaration.SpringConfigaration;
import com.xworkz.spring.dto.ResortDTO;
import com.xworkz.spring.service.resort.ResortSetvice;

public class ResortRunner {

	public static void main(String[] args) {
		ApplicationContext containetr=new AnnotationConfigApplicationContext(SpringConfigaration.class);
		 ResortSetvice service= containetr.getBean(ResortSetvice.class);
boolean saved=service.validateAndSave(new ResortDTO());
System.out.println(saved);

	}

}
