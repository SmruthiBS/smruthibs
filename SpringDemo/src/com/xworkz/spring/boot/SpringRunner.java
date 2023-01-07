package com.xworkz.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configure.SpringConfiguration;
import com.xworkz.spring.examples.Application;
import com.xworkz.spring.examples.Area;
import com.xworkz.spring.examples.Bus;
import com.xworkz.spring.examples.Chocolate;
import com.xworkz.spring.examples.City;
import com.xworkz.spring.examples.Cycle;
import com.xworkz.spring.examples.Fish;
import com.xworkz.spring.examples.Girl;
import com.xworkz.spring.examples.God;
import com.xworkz.spring.examples.Mall;
import com.xworkz.spring.examples.Mask;
import com.xworkz.spring.examples.Milk;
import com.xworkz.spring.examples.Park;
import com.xworkz.spring.examples.Patient;
import com.xworkz.spring.examples.Road;
import com.xworkz.spring.examples.Temple;

public class SpringRunner {

	public static void main(String[] args) {
		ApplicationContext spring1 = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Bus ref1 = spring1.getBean(Bus.class);
		System.out.println(ref1);
		Girl ref2 = spring1.getBean(Girl.class);
		System.out.println(ref2);
		Area ref3 = spring1.getBean(Area.class);
		System.out.println(ref3);
		Application ref4 = spring1.getBean(Application.class);
		System.out.println(ref4);
		Chocolate ref5 = spring1.getBean(Chocolate.class);
		System.out.println(ref5);
		City ref6 = spring1.getBean(City.class);
		System.out.println(ref6);
		Cycle ref7 = spring1.getBean(Cycle.class);
		System.out.println(ref7);
		Fish ref8 = spring1.getBean(Fish.class);
		System.out.println(ref8);
		God ref9 = spring1.getBean(God.class);
		System.out.println(ref9);
		Mall ref10 = spring1.getBean(Mall.class);
		System.out.println(ref10);
		Mask ref11 = spring1.getBean(Mask.class);
		System.out.println(ref11);
		Milk ref12 = spring1.getBean(Milk.class);
		System.out.println(ref12);
		Park ref13 = spring1.getBean(Park.class);
		System.out.println(ref13);
		Patient ref14 = spring1.getBean(Patient.class);
		System.out.println(ref14);
		Road ref16=spring1.getBean(Road.class);
		System.out.println(ref16);
		Temple ref15 = spring1.getBean(Temple.class);
		System.out.println(ref15);
	}

}
