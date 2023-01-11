package com.xworkz.spring.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.bean.Book;
import com.xworkz.spring.bean.HardwareShop;
import com.xworkz.spring.bean.Pencil;
import com.xworkz.spring.bean.Rubber;
import com.xworkz.spring.bean.Software;
import com.xworkz.spring.bean.SoftwareEngineer;
import com.xworkz.spring.configuration.SpringConfiguration;

public class beanRunner {

	public static void main(String[] args) {
		ApplicationContext spring1 = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		HardwareShop ref1 = spring1.getBean(HardwareShop.class);
		System.out.println(ref1);
		Software ref2 = spring1.getBean(Software.class);
		System.out.println(ref2);
		SoftwareEngineer ref3 = spring1.getBean(SoftwareEngineer.class);
		System.out.println(ref3);
		Pencil ref4 = spring1.getBean(Pencil.class);
		System.out.println(ref4);
		Rubber ref5 = spring1.getBean(Rubber.class);
		System.out.println(ref5);
		Book ref6 = spring1.getBean(Book.class);
		System.out.println(ref6);
		String[]beans=spring1.getBeanDefinitionNames();
		System.out.print(Arrays.toString(beans));


	}

}
