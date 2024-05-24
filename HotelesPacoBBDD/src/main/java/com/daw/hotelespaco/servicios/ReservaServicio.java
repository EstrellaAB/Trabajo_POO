package com.daw.hotelespaco.servicios;

import java.sql.Date;

import com.daw.hotelespaco.entidades.ReservaImpl;
import com.daw.hotelespaco.repositorio.ReservaRepository;

public class ReservaServicio {
	
	public ReservaImpl crearObjetoReserva(Date fechaEntrada, Date fechaSalida, int idPago, int idHotel, int IdHabitacion) {
		ReservaImpl resultado = new ReservaImpl();
		resultado.setFecha_entrada(fechaEntrada);
		resultado.setFecha_salida(fechaSalida);
		resultado.setIdPago(idPago);
		resultado.setIdHotel(idHotel);
		resultado.setIdHabitacion(IdHabitacion);
		
		return resultado;
	}
	
	public void insertarReserva(ReservaImpl reserva) {
		
		// LLAMAR AL REPOSITORIO
		
		ReservaRepository reservaRepo = new ReservaRepository();
		reservaRepo.insertarReserva(reserva);
	}

}
