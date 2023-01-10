package com.xworkz.examples.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.examples.configure.SpringConfig;
import com.xworkz.examples.objects.Colours;
import com.xworkz.examples.objects.Fan;
import com.xworkz.examples.objects.Fruit;
import com.xworkz.examples.objects.Sport;



public class SpringRunner {

	public static void main(String[] args) {
		ApplicationContext spring1 = new AnnotationConfigApplicationContext(SpringConfig.class);
		Colours ref1 = spring1.getBean(Colours.class);
		System.out.println(ref1);
		Fruit ref2 = spring1.getBean(Fruit.class);
		System.out.println(ref2);
		Sport ref3 = spring1.getBean(Sport.class);
		System.out.println(ref3);
		Fan ref4  = spring1.getBean(Fan.class);
		System.out.println(ref4);
		
		

	}

}
