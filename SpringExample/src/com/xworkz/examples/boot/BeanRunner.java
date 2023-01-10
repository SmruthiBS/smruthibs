package com.xworkz.examples.boot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.examples.configure.Config;
import com.xworkz.examples.configure.SpringConfig;


public class BeanRunner {
	public static void main(String[] args) {
		ApplicationContext spring1 = new AnnotationConfigApplicationContext(Config.class);
		String ref1 = spring1.getBean("stringName",String.class);
		System.out.println(ref1);
		Boolean ref2 = spring1.getBean("booleanRain",Boolean.class);
		System.out.println(ref2);
		Double ref3 = spring1.getBean("weight",Double.class);
		System.out.println(ref3);
		StringBuffer ref4=spring1.getBean("weapon",StringBuffer.class);
		System.out.println(ref4);
		StringBuilder ref5=spring1.getBean("animal",StringBuilder.class);
		System.out.println(ref5);
	
		
		
		String[]beans=spring1.getBeanDefinitionNames();
		System.out.println(Arrays.toString(beans));
	}

}
