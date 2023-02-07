package com.design.patterns.designpatterns.cadenademando;

public class Unidad {

	protected Unidad mando;
	
	protected String nombre;
	
	public Unidad(String nombre) {
		this.nombre=nombre;
	}
	
	public void estableceMando(Unidad mando) {
		this.mando=mando;
	}
	
	public void ejecutarOrder(String orden) {
		if(mando!= null) {
			System.out.println("Ejecuta la orden, "+ mando.nombre);
			mando.ejecutarOrder(orden);
		}else {
			System.out.println(orden);
			
		}
	}
}
