package com.proyecto.principal.entidades;

public class Comidas {

	protected String nombre;
	protected String valoracion;
	protected String tipo;
	protected String subTipo;
	protected boolean gluten;
	
	public Comidas() {
		
	}

	public Comidas(String nombre, String valoracion, String tipo, String subTipo, boolean gluten) {
		super();
		this.nombre = nombre;
		this.valoracion = valoracion;
		this.tipo = tipo;
		this.subTipo = subTipo;
		this.gluten = gluten;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getValoracion() {
		return valoracion;
	}

	public void setValoracion(String valoracion) {
		this.valoracion = valoracion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getSubTipo() {
		return subTipo;
	}

	public void setSubTipo(String subTipo) {
		this.subTipo = subTipo;
	}

	public boolean isGluten() {
		return gluten;
	}

	public void setGluten(boolean gluten) {
		this.gluten = gluten;
	}
}
