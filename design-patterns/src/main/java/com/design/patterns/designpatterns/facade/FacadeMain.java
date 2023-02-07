package com.design.patterns.designpatterns.facade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.design.patterns.designpatterns.prototype.MainPrototype;

@SpringBootApplication
public class FacadeMain {
	public static void main(String[] args) {
		SpringApplication.run(FacadeMain.class, args);
		PersonFacade personFacade1=new PersonFacade(28);
		System.out.println(personFacade1.requisitoEdad());
	}
}
