package com.daw.hotelespaco.entidades;

public class HotelImpl {
	
	private int id;
	private String nombre;
	private String barrio;
	
	
	public HotelImpl() {
		
	}

	// TODO: AÑADIR ATRIBUTOS
	public HotelImpl(String nombre, String barrio) {
		super();
		this.nombre = nombre;
		this.barrio = barrio;
	}
	


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the barrio
	 */
	public String getBarrio() {
		return barrio;
	}


	/**
	 * @param barrio the barrio to set
	 */
	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}


	@Override
	public String toString() {
		return nombre + ", situado en " + barrio;
	}



}
