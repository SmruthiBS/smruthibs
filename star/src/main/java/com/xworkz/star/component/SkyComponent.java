package com.xworkz.star.component;

import org.springframework.stereotype.Component;

@Component
public class SkyComponent {
	public SkyComponent() {
		System.out.println("created " + this.getClass().getSimpleName());

	}

}
