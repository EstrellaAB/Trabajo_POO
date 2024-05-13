package com.proyecto.principal.entidades;

import java.util.ArrayList;

import com.proyecto.principal.servicios.Utilidades;

public class HotelImpl implements Hotel{
	private String nombre;
	private String barrio;
	private ArrayList<HabitacionImpl> listaHabitaciones;
	
	
	
	public HotelImpl() {
		super();
	}


	public HotelImpl(String nombre, String barrio, ArrayList<HabitacionImpl> listaHabitaciones) {
		super();
		this.nombre = nombre;
		this.barrio = barrio;
		this.listaHabitaciones = listaHabitaciones;
	}


	/**
	 * @return the listaHabitaciones
	 */
	public ArrayList<HabitacionImpl> getListaHabitaciones() {
		return listaHabitaciones;
	}


	/**
	 * @param listaHabitaciones the listaHabitaciones to set
	 */
	public void setListaHabitaciones(ArrayList<HabitacionImpl> listaHabitaciones) {
		this.listaHabitaciones = listaHabitaciones;
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
