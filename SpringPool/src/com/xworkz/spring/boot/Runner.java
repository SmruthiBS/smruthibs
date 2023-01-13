package com.xworkz.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.bean.Movie;
import com.xworkz.spring.bean.Producer;
import com.xworkz.spring.configure.SpringConfiguration;

public class Runner {
	public static void main(String[] args) {
		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfiguration.class);
	Movie ref1 = spring.getBean(Movie.class);
	

		
	}

}
