package com.proyecto.principal.entidades;

public class HabitacionImpl implements Habitacion{
	private int numPersonas;
	private int precioHabitacion;
	
	
	
	public HabitacionImpl() {
		super();
	}

	public HabitacionImpl(int numPersonas, int precioHabitacion) {
		super();
		this.numPersonas = numPersonas;
		this.precioHabitacion = precioHabitacion;
	}

	public HabitacionImpl(int i) {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the numPersonas
	 */
	public int getNumPersonas() {
		return numPersonas;
	}

	/**
	 * @param numPersonas the numPersonas to set
	 */
	public void setNumPersonas(int numPersonas) {
		this.numPersonas = numPersonas;
	}

	/**
	 * @return the precioHabitacion
	 */
	public int getPrecioHabitacion() {
		return precioHabitacion;
	}

	/**
	 * @param precioHabitacion the precioHabitacion to set
	 */
	public void setPrecioHabitacion(int precioHabitacion) {
		this.precioHabitacion = precioHabitacion;
	}

	@Override
	public String toString() {
		String tipo = ""; 
		switch (numPersonas) {
			case 1: 
				tipo = "Individual"; 
			break;
			case 2:
				tipo = "Doble"; 
			break;
			case 3:
				tipo = "Triple"; 
			break; 
			case 4:
				tipo = "Cuádruple"; 
			break; 
			
		}
		
		return "Habitacion " + tipo + ", Número de Personas seleccionado = " + numPersonas + ", Precio / noche = " + precioHabitacion +"€";
	}
	
	
}
