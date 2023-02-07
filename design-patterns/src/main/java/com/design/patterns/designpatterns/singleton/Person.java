package com.design.patterns.designpatterns.singleton;

public class Person {

	private static Person INSTANCE=null;
	private String name; 
	private int age;
	
	private Person() {
		
	}
	
	public static Person getInstance() {
	    if(INSTANCE == null) {
		INSTANCE=new Person();
	    }
		return INSTANCE;
		
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
