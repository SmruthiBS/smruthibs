package com.xworkz.spring.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.spring.beans.Actor;
import com.xworkz.spring.beans.Rocket;
import com.xworkz.spring.beans.Season;

@Configuration
@ComponentScan("com.xworkz.spring")
public class SpringConfig {
	@Bean
	public Rocket isro() {
		Rocket rocket=new Rocket();
		return rocket;}
		@Bean
		public Actor ganesh() {
			Actor actor=new Actor("ganesh","kannada",42);
			return actor;
	

}
		@Bean
		public Season rainy() {
			Season season=new Season();
			season.setName("rainy");
			season.setDuration(6);
			season.setStartingMonth("april");
			return season;
			}
}
