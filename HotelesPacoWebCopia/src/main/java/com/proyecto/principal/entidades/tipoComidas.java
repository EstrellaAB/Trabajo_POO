package com.proyecto.principal.entidades;

import java.util.ArrayList;

public class tipoComidas {
	
	private ArrayList<Comidas> tipoComidas;
	
	public tipoComidas() {
		
	}

	public tipoComidas(ArrayList<Comidas> tipoComidas) {
		super();
		this.tipoComidas = tipoComidas;
	}

	public ArrayList<Comidas> getTipoComidas() {
		return tipoComidas;
	}

	public void setTipoComidas(ArrayList<Comidas> tipoComidas) {
		this.tipoComidas = tipoComidas;
	}
}
