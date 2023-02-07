package com.design.patterns.designpatterns.cadenademando;

import java.util.ArrayList;
import java.util.List;

public class UnidadDeMando {

	private List<Unidad> ejercito;
	
	public UnidadDeMando() {
		this.ejercito=new ArrayList<>();
	}
	public void anadirEjercito(Unidad unidad) {
		this.ejercito.add(unidad);
	}
	public void ejecutaOrder(String order) {
		this.ejercito.get(0).ejecutarOrder(order);
	}
}
