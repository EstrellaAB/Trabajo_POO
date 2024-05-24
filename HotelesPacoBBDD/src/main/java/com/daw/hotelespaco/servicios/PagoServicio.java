package com.daw.hotelespaco.servicios;

import java.sql.Date;

import com.daw.hotelespaco.entidades.PagoImpl;
import com.daw.hotelespaco.repositorio.PagoRepositorio;

public class PagoServicio {
	
	public PagoImpl crearObjetoPago (String titularTarjeta, int numTarjeta, Date mesCaducidad, Date anioCaducidad) {
		
		PagoImpl resultado = new PagoImpl(); 
		
		resultado.setTitularTarjeta(titularTarjeta);
		resultado.setNumTarjeta(numTarjeta);
		resultado.setMesCaducidad(mesCaducidad);
		resultado.setAnyoCaducidad(anioCaducidad);
		
		return resultado; 
	}
	public PagoImpl insertarPago(PagoImpl pago) {
	    PagoRepositorio pagoRepositorio = new PagoRepositorio();
	    pagoRepositorio.insertarPago(pago);
	    return pago;
	}

}
