package com.proyecto.principal.servicios;

import java.util.ArrayList;
import java.util.Scanner;

import com.proyecto.principal.entidades.HabitacionImpl;
import com.proyecto.principal.entidades.HotelImpl;

public class HotelServicio {
	
	public void imprimirHoteles(ArrayList<HotelImpl> listaHotelesRepositorio) {
		System.out.println("Los hoteles que tenemos disponibles son:");
		
		for (int i = 0; i < listaHotelesRepositorio.size(); i++) {
			System.out.println(i + 1 + " - " + listaHotelesRepositorio.get(i));
		}
	}
	
	public HotelImpl seleccionarHotel(ArrayList<HotelImpl> listaHotelesRepositorio, Scanner sc) {
		
		System.out.println("Introduzca el número del hotel donde quiere hospedarse");
		Utilidades util = new Utilidades();
		
		// introducir un numero
		int numeroHotelIntroducidoPorUsuario = util.escribirNumero(sc);
		
		// validor numero
		while (!validarNumeroHotelSeleccionado(numeroHotelIntroducidoPorUsuario, listaHotelesRepositorio)) {
			numeroHotelIntroducidoPorUsuario = util.escribirNumero(sc);
		}
		
		HotelImpl hotelSeleccionado = listaHotelesRepositorio.get(numeroHotelIntroducidoPorUsuario - 1); // restamos 1 porque el usuario introduce entre 1 y tamaño de hoteles creados y la lista empieza en 0 hasta tamaño -1
		System.out.println("Ha seleccionado el hotel " + hotelSeleccionado);
		return hotelSeleccionado;
		
		
		// pintar el hotel seleccionado
		
	}
	
	public boolean validarNumeroHotelSeleccionado(int numeroHotelIntroducidoPorUsuario, ArrayList<HotelImpl> listaHotelesRepositorio) {
		boolean esValido = false;
		
		if (numeroHotelIntroducidoPorUsuario >= 1 && numeroHotelIntroducidoPorUsuario <= listaHotelesRepositorio.size()) {
			esValido = true;
		} else {
			System.err.println("No ha seleccionado un número válido vuelve a intentarlo:");
		}

		return esValido;
	}
	
	public HabitacionImpl seleccionarTipoHabitaciones(HotelImpl hotelSeleccionado, Scanner sc) {
		System.out.println("Número de personas: ");
		
		// obtener la lista de habitaciones del hotel
		ArrayList<HabitacionImpl> listaHabitaciones = hotelSeleccionado.getListaHabitaciones();
		
		// imprimir las habitaciones y precios del hotel seleccionado
		Utilidades util = new Utilidades();
		int numeroInquilinosHabitacion = util.escribirNumero(sc);
		// usuario elige la habitacion que quiere y lo valido 
		
		while(!validarNumeroPersonasHabitacion(numeroInquilinosHabitacion, listaHabitaciones)) {
			numeroInquilinosHabitacion = util.escribirNumero(sc); 
		}
		
		// imprimir la eleccion del usuario
		
		HabitacionImpl tipoHabitacionSeleccionada = listaHabitaciones.get(numeroInquilinosHabitacion - 1);  // restamos 1 para sincronizar el numero de personas con la habitacion correcta
		System.out.println("Ha seleccionado " + tipoHabitacionSeleccionada);
		return tipoHabitacionSeleccionada;
	}
	
	public boolean validarNumeroPersonasHabitacion(int numeroInquilinosHabitacion, ArrayList<HabitacionImpl> listaHabitaciones) {
		boolean esValido = false;
		
		if(numeroInquilinosHabitacion >= 1 && numeroInquilinosHabitacion <= 4) {
			esValido = true;
		}else {
			System.err.println("El numero introducido es incorrecto, vuelva a intentarlo");
		}
		return esValido; 
		
		
	}

}
