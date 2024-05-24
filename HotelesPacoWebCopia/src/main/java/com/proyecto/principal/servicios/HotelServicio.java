package com.proyecto.principal.servicios;

import java.util.ArrayList;

import com.proyecto.principal.entidades.HabitacionImpl;
import com.proyecto.principal.entidades.HotelImpl;

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