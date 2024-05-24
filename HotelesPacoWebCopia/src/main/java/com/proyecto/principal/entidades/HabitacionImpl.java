package com.proyecto.principal.entidades;

public class HabitacionImpl {
	private int idHabitacion;
	private String tipo;
	private int numPersonas;
	private int precioHabitacion;
	private boolean ocupada;
	
	
	
	public HabitacionImpl() {
		super();
	}

	// TODO: AÑADIR
	public HabitacionImpl(int numPersonas, int precioHabitacion) {
		super();
		this.numPersonas = numPersonas;
		this.precioHabitacion = precioHabitacion;
	}	

	/**
	 * @return the idHabitacion
	 */
	public int getIdHabitacion() {
		return idHabitacion;
	}

	/**
	 * @param idHabitacion the idHabitacion to set
	 */
	public void setIdHabitacion(int idHabitacion) {
		this.idHabitacion = idHabitacion;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
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
		

	/**
	 * @return the ocupada
	 */
	public boolean isOcupada() {
		return ocupada;
	}

	/**
	 * @param ocupada the ocupada to set
	 */
	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
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