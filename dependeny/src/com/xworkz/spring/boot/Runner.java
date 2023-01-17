package com.xworkz.spring.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.bean.Shell;
import com.xworkz.spring.configuration.BunkConfiguration;


public class Runner {
	public static void main(String[] args) {
		ApplicationContext spring1 = new AnnotationConfigApplicationContext(BunkConfiguration.class);
		Shell shell=spring1.getBean(Shell.class);
		shell.purchase();
		String[] beans=spring1.getBeanDefinitionNames();
		System.out.println(Arrays.toString(beans));
	}

}
