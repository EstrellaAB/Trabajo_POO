package servicios;

import java.util.Scanner;

import objetos.HabitacionImpl;
import objetos.HotelImpl;
import objetos.ReservaImpl;

public class ReservaServicio {
	
	public int seleccionarMesReserva(Scanner sc) {
		System.out.println("Indique el mes de entrada: (MM) ");
		Utilidades util = new Utilidades();
		
		int mes = util.escribirNumero(sc);
		//validar que sea entre los 12 meses
		while(!validarMesReserva(mes)) {
			mes = util.escribirNumero(sc);
		}
		return mes; 
	}
	
	
	//validar mes
	public boolean validarMesReserva (int mes) {
		boolean esValido = false;
		
		if (mes >= 1 && mes <= 12) {
			esValido = true;
		}else {
			System.err.println("Valor introducido no es correcto, inténtelo de nuevo");
		}
		return esValido;
	}
	
	public int seleccionarDiaReserva(int mes, Scanner sc) {
		System.out.println("Indique el día de entrada:");
		Utilidades util = new Utilidades();
		
		int dia = util.escribirNumero(sc);
		while (!validarDiasReserva(dia, mes)) {
			dia = util.escribirNumero(sc);
		}
		return dia; 
	}	
	
	
	public boolean validarDiasReserva (int dia, int mes) {
		Boolean esValido = false;
		
		switch(mes) {
		case 1, 3, 5, 7, 8, 10, 12: 
			if (dia <= 31) {
				esValido = true;
			}
		case 4, 6, 9, 11: 
			if (dia <= 30) {
				esValido = true;
			}
		case 2: 
			if (dia <= 29) {
				esValido = true;
			}
		}
		if (!esValido) {
			System.err.println("Valor introducido no es correcto, inténtelo de nuevo");
		}
		return esValido; 
	}
	
	
	public int seleccionarNumeroNoches(Scanner sc) {
		// imprimir mensaje
		System.out.println("Número de noches (Mínimo 2): ");
		// escribir el número de noches
		int numeroNoches = escribirNumeroNoches(sc);
		// validar que sea al menos 2 noches
		while (!validarNoches(numeroNoches)) {
			numeroNoches = escribirNumeroNoches(sc);
		}

		return numeroNoches;
	}
	

	public int escribirNumeroNoches(Scanner sc) {
		Utilidades util = new Utilidades();
		
		int numeroNoches = util.escribirNumero(sc);

		return numeroNoches;
	}

	public boolean validarNoches(int numeroNoches) {
		Boolean esValido = false;

		if (numeroNoches >= 2) {
			esValido = true;
		} else {
			System.err.println("El número mínimo de noches es 2");
		}
		return esValido;

	}
	
	public int calcularPrecio(int numeroNochesSeleccionado, HabitacionImpl habitacionSeleccionada) {		
		
		int precioTotal = 0;		
		
		precioTotal = numeroNochesSeleccionado * habitacionSeleccionada.getPrecioHabitacion();

		return precioTotal;
	}
	
	public void crearReserva(HotelImpl hotelSeleccionado, HabitacionImpl habitacionSeleccionada, int mesReservaSeleccionado, int diaInicioReservaSeleccionado, int numeroNochesSeleccionado, int precioFinal) {
		
		// crear el objeto reserva
		String nombreHotel = hotelSeleccionado.getNombre();
		int numPersonasHabitacion = habitacionSeleccionada.getNumPersonas();
		
		ReservaImpl r = new ReservaImpl(nombreHotel, numPersonasHabitacion, mesReservaSeleccionado, diaInicioReservaSeleccionado, numeroNochesSeleccionado, precioFinal);
		// imprimir reserva
		System.out.println(r);
	}
	
	
	// A PARTIR DE AQUI NUEVO AÑADIDO :) 
	// CONFIRMACION RESERVA 
	
	
	public String confirmacionReserva (Scanner sc) {
		System.out.println("¿Está conforme con su reserva? [S/N]");
		String confirmacion = ""; 
			
		while (!validarConfirmacion(confirmacion)) {
			confirmacion = sc.nextLine();
		}

		return confirmacion;
		
	}
	
	public boolean validarConfirmacion(String confirmacion) {
		boolean esValido = false; 
		
		if(confirmacion.equals("S")|| confirmacion.equals("N")||confirmacion.equals("s")||confirmacion.equals("n")) {
			esValido = true; 
		}else {
			System.out.println("Debe escribir S/N para aceptar o cancelar la reserva");
		}
		
		return esValido; 
	}
}
