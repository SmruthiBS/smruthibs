package com.xworkz.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.bean.Chrome;
import com.xworkz.spring.bean.FireBox;
import com.xworkz.spring.configuration.BrowserConfigaration;


public class BrowserRunner {
	public static void main(String[] args) {
		ApplicationContext spring1 = new AnnotationConfigApplicationContext(BrowserConfigaration.class);
		Chrome chrome=spring1.getBean(Chrome.class);
		chrome.browse();
	
		FireBox firebox=spring1.getBean(FireBox.class);
		firebox.browse();
		
	}

}
