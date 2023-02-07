package com.design.patterns.designpatterns.prototype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;




public class MainPrototype {
	
	@Autowired
	private static ApplicationContext context;


		public static void main(String[] args) {
			SpringApplication.run(MainPrototype.class, args);
			// Person Rafa= (Person)context.getBean("personPrototype");
			// Rafa.getName();
		}
		
		
		

}
