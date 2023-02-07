package com.design.patterns.designpatterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.design.patterns.designpatterns.decorator.Decorator;
//import com.design.patterns.designpatterns.builder.Person;
//import com.design.patterns.designpatterns.singleton.Person;
//import com.design.patterns.designpatterns.prototype.Person;
import com.design.patterns.designpatterns.decorator.Person;
import com.design.patterns.designpatterns.decorator.PersonI;
import com.design.patterns.designpatterns.prototype.MainPrototype;

@SpringBootApplication
public class DesignPatternMain 
{
	

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternMain.class, args);
		// Person Rafa=Person.getInstance();
        // Rafa.setName("Rafa");
    
    	/*
    	Person Rafa= new Person();
    	Rafa.setAge(27);
    	Rafa.setName("Rafael");
    	
    	Person Rafa2=Rafa.clone();
    	 */
    	
    	//Person Rafa= new Person();
    	
    	//Rafa.builder().age(27).name("Rafael").build();
    	
    
    	PersonI personI= new Person();
    	personI.setName("Interfaz");
    	
    	PersonI personI2= new Decorator(personI);
    	
    	System.out.println(personI2.getName());
	}
}
    
    	
    	
    	
    	
    	
    	
    	
    	
    	
    

