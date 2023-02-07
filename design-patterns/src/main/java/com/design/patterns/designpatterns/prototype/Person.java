package com.design.patterns.designpatterns.prototype;

public class Person implements Clonable {

	private String name;
	private int age;
	
	public Person() {
		
	}
	
	public Person(String name, int age) {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public Person clone() {
		return new Person(this.name,this.age);
	}
	
}
