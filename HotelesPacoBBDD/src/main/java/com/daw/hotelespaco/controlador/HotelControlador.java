package com.daw.hotelespaco.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.daw.hotelespaco.servicios.HotelServicio;

public class HotelControlador {
	
	
	@GetMapping("/hoteles")
	public ModelAndView obtenerHoteles() {
		
		ModelAndView maw = new ModelAndView("hoteles");
		
		// Llamar al servicio
		HotelServicio hs = new HotelServicio();
		maw.addObject("listaHoteles", hs.obtenerTodosLosHoteles());
		
		return maw;		
	}
	
	
	@GetMapping("/habitaciones")
	public ModelAndView otenerHabitacionesHotelSeleccionado(@RequestParam("hotelId") int idHotel) {
		
		ModelAndView maw = new ModelAndView("hoteles");
		
		// Llamar al servicio
		HotelServicio hs = new HotelServicio();
		maw.addObject("listaHabitaciones", hs.otenerHabitacionesHotelSeleccionado(idHotel));
		
		return maw;		
	}
}
