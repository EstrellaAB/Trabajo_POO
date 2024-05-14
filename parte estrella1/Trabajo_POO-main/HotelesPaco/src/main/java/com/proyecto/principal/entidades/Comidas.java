package com.proyecto.principal.entidades;

public abstract class Comidas {

	private String nombre;
	private String valoracion;
	protected boolean gluten;
	
	
	public Comidas() {
		
	}
	
	public Comidas(String nombre, String valoracion, boolean gluten) {
		super();
		this.nombre = nombre;
		this.valoracion = valoracion;
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

	public boolean isGluten() {
		return gluten;
	}

	public void setGluten(boolean gluten) {
		this.gluten = gluten;
	}

	public static Object leerValoracion() {
		String valoracion = "*****";		
		return valoracion;
	}

	public Object leerGluten() {
		boolean gluten = true;		
		return gluten;
	}

	public void setTipo(String tipo) {
		// TODO Auto-generated method stub
		
	}
}