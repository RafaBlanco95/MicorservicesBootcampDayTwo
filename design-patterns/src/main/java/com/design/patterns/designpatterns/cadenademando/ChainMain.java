package com.design.patterns.designpatterns.cadenademando;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class ChainMain {

	public static void main(String[] args) {
		SpringApplication.run(ChainMain.class, args);
		
		
		Unidad capi=new Unidad("Capitán");
		Unidad comandante= new Unidad("Comandante");
		capi.estableceMando(comandante);
		Unidad soldado= new Unidad("Soldado");
		comandante.estableceMando(soldado);
		
		UnidadDeMando unidadDeMando= new UnidadDeMando();
		unidadDeMando.anadirEjercito(capi);
		unidadDeMando.anadirEjercito(comandante);
		unidadDeMando.anadirEjercito(soldado);
		
		
		unidadDeMando.ejecutaOrder("Matar a Aurelio");
	}
}
