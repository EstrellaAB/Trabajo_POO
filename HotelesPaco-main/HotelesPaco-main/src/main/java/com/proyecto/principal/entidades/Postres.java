package com.proyecto.principal.entidades;

public class Postres extends Comidas{

public Postres() {
		
	}

	public Postres(boolean gluten) {
		this.gluten=gluten;
	}
	
	public Postres(String nombre, String valoracion, boolean gluten) {
		super(nombre, valoracion, gluten);
		
	}
}