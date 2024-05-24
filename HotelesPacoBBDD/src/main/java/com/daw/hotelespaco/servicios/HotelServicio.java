package com.daw.hotelespaco.servicios;

import java.util.ArrayList;

import com.daw.hotelespaco.entidades.HabitacionImpl;
import com.daw.hotelespaco.entidades.HotelImpl;
import com.daw.hotelespaco.repositorio.HotelRepositorio;

public class HotelServicio {
	
	// Metodo que obtiene los hoteles
	
	public ArrayList<HotelImpl> obtenerTodosLosHoteles() {
		ArrayList<HotelImpl> resultado = new ArrayList<HotelImpl>();
		HotelRepositorio hotelRepo = new HotelRepositorio();
		
		resultado = hotelRepo.obtenerTodosLosHoteles();		
		
		return resultado;
	}
	
	// Metodo que obtiene a partir de un hotel las habitaciones
	public ArrayList<HabitacionImpl> otenerHabitacionesHotelSeleccionado(int idHotel) {
		ArrayList<HabitacionImpl> resultado = new ArrayList<HabitacionImpl>();
		HotelRepositorio hotelRepo = new HotelRepositorio();
		
		resultado = hotelRepo.otenerHabitacionesHotelSeleccionado(idHotel);
		
		return resultado;
		
	}

}
