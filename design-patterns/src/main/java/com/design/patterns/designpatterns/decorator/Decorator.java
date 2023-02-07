package com.design.patterns.designpatterns.decorator;

public class Decorator implements PersonI{

	private PersonI personI;
	
	public Decorator(PersonI personI) {
		this.personI=personI;
	}

	@Override
	public String getName() {
		
		return personI.getName();
	}

	@Override
	public void setName(String name) {
		personI.setName(name);
		
	}

	@Override
	public int getAge() {
		
		return personI.getAge();
	}

	@Override
	public void setAge(int age) {
		personI.setAge(age);
		
	}

	

	
}
