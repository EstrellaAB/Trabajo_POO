package com.proyecto.principal.entidades;

public class Entrantes extends Comidas{

	
	
	public Entrantes() {
		 
	}
	
	public Entrantes(boolean gluten) {
		this.gluten = gluten;
	}
	
	public Entrantes(String nombre, String valoracion, boolean gluten) {
		super(nombre, valoracion, gluten);
		
	}

	

	
	
	
	
}
