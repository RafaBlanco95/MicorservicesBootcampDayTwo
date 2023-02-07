package com.design.patterns.designpatterns.decorator;



public class Person implements PersonI {

	private String name;
	private int age;
	
	public Person() {
		super();
	}

	@Override
	public String getName() {
		
		return this.name;
	}

	@Override
	public void setName(String name) {
		this.name=name;
		
	}

	@Override
	public int getAge() {
		return this.age;
	}

	@Override
	public void setAge(int age) {
		this.age=age;
		
	}

	
}

	