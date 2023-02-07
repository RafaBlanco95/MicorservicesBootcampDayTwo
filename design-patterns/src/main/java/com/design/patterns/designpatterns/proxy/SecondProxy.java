package com.design.patterns.designpatterns.proxy;

public class SecondProxy extends AbstractPersonProxy{

	
	public SecondProxy(PersonProxyI personProxyI) {
		super(personProxyI);
		
	}

	public void before(){
		System.out.println("Antes");
	}
	
	public void after() {
		System.out.println("Después");
	}
	

}
