package com.design.patterns.designpatterns.proxy;

public abstract class AbstractPersonProxy implements PersonProxyI{

	private PersonProxyI personProxyI;
	public AbstractPersonProxy(PersonProxyI personProxyI) {
		this.personProxyI=personProxyI;
	}
	
	public abstract void before();
	
	public abstract void after();

	@Override
	public void operation() {
		before();
		personProxyI.operation();
		after();
		
	}

}