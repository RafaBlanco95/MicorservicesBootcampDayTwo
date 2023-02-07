package com.design.patterns.designpatterns.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.design.patterns.designpatterns.builder.Person;

@Configuration
public class Config {

	@Bean
	@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public Person prototypePerson() {
		return new Person();
	}
	
	

	@Bean
	@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
	public Person prototipePerson() {
		return new Person();
	}
}
