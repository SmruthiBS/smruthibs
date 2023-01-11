package com.xworkz.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.beans.Actor;
import com.xworkz.spring.beans.Rocket;
import com.xworkz.spring.beans.Season;
import com.xworkz.spring.configure.SpringConfig;


public class BeanRunner {
	public static void main(String[] args) {
		
	
	ApplicationContext spring1 = new AnnotationConfigApplicationContext(SpringConfig.class);
	Rocket ref1 = spring1.getBean("rocket",Rocket.class);
	System.out.println(ref1.getName());
	System.out.println(ref1.getCountry());
	System.out.println(ref1.getBudget());
	Rocket ref2 = spring1.getBean("isro",Rocket.class);
	System.out.println(ref1.getName());
	System.out.println(ref1.getCountry());
	System.out.println(ref1.getBudget());
	Actor ref3 = spring1.getBean("actor",Actor.class);
	System.out.println(ref3.getName());
	System.out.println(ref3.getLanguage());
	System.out.println(ref3.getAge());
	Actor ref4 = spring1.getBean("ganesh",Actor.class);
	System.out.println(ref4.getName());
	System.out.println(ref4.getLanguage());
	System.out.println(ref4.getAge());
	Season ref5=spring1.getBean("season",Season.class);
	System.out.println(ref5.getName());
	System.out.println(ref5.getDuration());
	System.out.println(ref5.getStartingMonth());
	Season ref6=spring1.getBean("rainy",Season.class);
	System.out.println(ref6.getName());
	System.out.println(ref6.getDuration());
	System.out.println(ref6.getStartingMonth());
	
	
	
	
	
}
}