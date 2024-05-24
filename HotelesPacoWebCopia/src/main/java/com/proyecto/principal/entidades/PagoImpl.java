package com.proyecto.principal.entidades;

import java.sql.Date;

public class PagoImpl {

	private String titularTarjeta;
	private int numTarjeta;
	private Date mesCaducidad;
	private Date anioCaducidad;
		
	
	public PagoImpl() {
		super();
	}

	public PagoImpl(String titularTarjeta, int numTarjeta, Date mesCaducidad, Date anioCaducidad) {
		super();
		this.titularTarjeta = titularTarjeta;
		this.numTarjeta = numTarjeta;
		this.mesCaducidad = mesCaducidad;
		this.anioCaducidad = anioCaducidad;
	}

	/**
	 * @return the titularTarjeta
	 */
	public String getTitularTarjeta() {
		return titularTarjeta;
	}

	/**
	 * @param titularTarjeta the titularTarjeta to set
	 */
	public void setTitularTarjeta(String titularTarjeta) {
		this.titularTarjeta = titularTarjeta;
	}

	/**
	 * @return the numTarjeta
	 */
	public int getNumTarjeta() {
		return numTarjeta;
	}

	/**
	 * @param numTarjeta the numTarjeta to set
	 */
	public void setNumTarjeta(int numTarjeta) {
		this.numTarjeta = numTarjeta;
	}

	/**
	 * @return the mesCaducidad
	 */
	public Date getMesCaducidad() {
		return mesCaducidad;
	}

	/**
	 * @param mesCaducidad the mesCaducidad to set
	 */
	public void setMesCaducidad(Date mesCaducidad) {
		this.mesCaducidad = mesCaducidad;
	}

	/**
	 * @return the anyoCaducidad
	 */
	public Date getAnyoCaducidad() {
		return anioCaducidad;
	}

	/**
	 * @param anyoCaducidad the anyoCaducidad to set
	 */
	public void setAnyoCaducidad(Date anyoCaducidad) {
		this.anioCaducidad = anyoCaducidad;
	}

	@Override
	public String toString() {
		return "DATOS DE PAGO: \r\n - Titular Tarjeta =" + titularTarjeta + "\r\n - Número Tarjeta =" + numTarjeta + "\r\n - Mes de Caducidad="
				+ mesCaducidad + "\r\n - Año de caducidad =" + anioCaducidad ;
	}
	
}