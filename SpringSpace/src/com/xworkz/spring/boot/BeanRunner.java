package com.xworkz.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.bean.Engine;
import com.xworkz.spring.bean.Ghost;
import com.xworkz.spring.bean.Newspaper;
import com.xworkz.spring.bean.Snake;
import com.xworkz.spring.configure.SpringConfiguration;



public class BeanRunner {

	public static void main(String[] args) {
		ApplicationContext spring1 = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Newspaper ref1 = spring1.getBean(Newspaper.class);
		System.out.println(ref1);
		Engine ref2 = spring1.getBean(Engine.class);
		System.out.println(ref2);
		Snake ref3 = spring1.getBean(Snake.class);
		System.out.println(ref3);
		Ghost ref4 = spring1.getBean(Ghost.class);
		System.out.println(ref4);

	}

}
