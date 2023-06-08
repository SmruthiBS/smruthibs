package com.xworkz.smruthi_xworkz.configaration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import lombok.extern.slf4j.Slf4j;

@Configuration
@ComponentScan("com.xworkz.smruthi_xworkz")
@Slf4j
public class ZooConfiguration {
	public ZooConfiguration() {
		
log.info("created "+this.getClass().getSimpleName());
	}
	@Bean
	public MultipartResolver resolver() {
		log.info("registering multipartResolver");
		return new StandardServletMultipartResolver();
	}
	@Order(1)
	@Bean
	public ViewResolver viewResolver() {
		log.info("registering custom view resolver");
		return new InternalResourceViewResolver("/", ".jsp");
	}
	@Bean
	public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean() {
		log.info("registering localContainerEntityManagerFactoryBean");
		return new LocalContainerEntityManagerFactoryBean();
	}
public DataSource datasource() {
	log.info("registering data source");
	DriverManagerDataSource dataSource=new DriverManagerDataSource();
	dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
	dataSource.setUrl("jdbc:mysql://localhost:3306/database");
	dataSource.setUsername("root");
	dataSource.setPassword("Xworkzodc@123");
	return dataSource;
	
}
}
