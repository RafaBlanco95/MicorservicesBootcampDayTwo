package com.design.patterns.designpatterns;

import com.design.patterns.designpatterns.builder.Person;

//import com.design.patterns.designpatterns.singleton.Person;
//import com.design.patterns.designpatterns.prototype.Person;


public class DesignPatternMain 
{
    public static void main( String[] args )
    {
        
    
    	// Person Rafa=Person.getInstance();
        // Rafa.setName("Rafa");
    
    	/*
    	Person Rafa= new Person();
    	Rafa.setAge(27);
    	Rafa.setName("Rafael");
    	
    	Person Rafa2=Rafa.clone();
    	 */
    	
    	Person Rafa= new Person();
    	
    	Rafa.builder().age(27).name("Rafael").build();
    	
    }
}
