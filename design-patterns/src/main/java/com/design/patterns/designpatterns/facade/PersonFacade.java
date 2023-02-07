package com.design.patterns.designpatterns.facade;

public class PersonFacade {

	private Person person;
	
	public PersonFacade(int age) {
		person= new Person();
		person.setAge(age);
	}
	
	public boolean requisitoEdad() {
		boolean flag=false;
	if(person.getAge()>20 && person.getAge()<30) {
		flag=true;
	}
	
	return flag;
		
		
	}
}
