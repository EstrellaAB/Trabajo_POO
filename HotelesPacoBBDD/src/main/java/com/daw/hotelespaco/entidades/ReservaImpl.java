package com.daw.hotelespaco.entidades;

import java.sql.Date;

public class ReservaImpl {

	//ATRIBUTOS 
		private int idReserva;	
		private int idPago;	
		private int idHotel;
		private int idHabitacion;
		private Date fecha_entrada;
		private Date fecha_salida;
		
		
		
		
//		CONSTRUCTORES
	public ReservaImpl() {
		super();
	}

	public ReservaImpl(int idReserva, int idPago, int idHotel, int idHabitacion, Date fecha_entrada,
			Date fecha_salida) {
		super();
		this.idReserva = idReserva;
		this.idPago = idPago;
		this.idHotel = idHotel;
		this.idHabitacion = idHabitacion;
		this.fecha_entrada = fecha_entrada;
		this.fecha_salida = fecha_salida;
	}

	/**
	 * @return the idReserva
	 */
	public int getIdReserva() {
		return idReserva;
	}

	/**
	 * @param idReserva the idReserva to set
	 */
	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}

	/**
	 * @return the idPago
	 */
	public int getIdPago() {
		return idPago;
	}

	/**
	 * @param idPago the idPago to set
	 */
	public void setIdPago(int idPago) {
		this.idPago = idPago;
	}

	/**
	 * @return the idHotel
	 */
	public int getIdHotel() {
		return idHotel;
	}

	/**
	 * @param idHotel the idHotel to set
	 */
	public void setIdHotel(int idHotel) {
		this.idHotel = idHotel;
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
	 * @return the fecha_entrada
	 */
	public Date getFecha_entrada() {
		return fecha_entrada;
	}

	/**
	 * @param fecha_entrada the fecha_entrada to set
	 */
	public void setFecha_entrada(Date fecha_entrada) {
		this.fecha_entrada = fecha_entrada;
	}

	/**
	 * @return the fecha_salida
	 */
	public Date getFecha_salida() {
		return fecha_salida;
	}

	/**
	 * @param fecha_salida the fecha_salida to set
	 */
	public void setFecha_salida(Date fecha_salida) {
		this.fecha_salida = fecha_salida;
	}

	
}
