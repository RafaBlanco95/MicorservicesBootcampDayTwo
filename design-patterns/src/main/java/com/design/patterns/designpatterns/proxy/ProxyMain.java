package com.design.patterns.designpatterns.proxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProxyMain {

	public static void main(String[] args) {
		SpringApplication.run(ProxyMain.class, args);
		
		PersonProxyI personProxy=new PersonProxy("Rafa",27);
		SecondProxy secondProxy=new SecondProxy(personProxy);
		secondProxy.operation();
		
	}
}
