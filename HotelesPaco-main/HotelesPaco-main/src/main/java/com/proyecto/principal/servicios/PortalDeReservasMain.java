package com.proyecto.principal.servicios;

import java.util.ArrayList;
import java.util.Scanner;

import com.proyecto.principal.entidades.HabitacionImpl;
import com.proyecto.principal.entidades.HotelImpl;
import com.proyecto.principal.repositorios.HotelRepository;

public class PortalDeReservasMain {

	private static Scanner sc;

	public void programaPpal() {

		ArrayList<HotelImpl> listaHotelesRepositorio = cargarDatosHotel();

		// Bienvenida
		mensajeBienvenida();
		
		// Elegir barrio y Resumen del pedido
		realizarReserva(listaHotelesRepositorio, sc);
		
		// confirmar reserva
		
		confirmarReserva(); 

	}

	public  ArrayList<HotelImpl> cargarDatosHotel() {

		ArrayList<HotelImpl> result = new ArrayList<HotelImpl>();
		// cargar datos
		HotelRepository hotelRepository = new HotelRepository();
		// cargar Lista de precios de hoteles
		ArrayList<Integer> preciosHotelSantaCruz = hotelRepository.setListaPreciosHabitaciones(75, 115, 170, 215);
		ArrayList<Integer> preciosElArenal = hotelRepository.setListaPreciosHabitaciones(80, 110, 160, 200); 
		ArrayList<Integer> preciosFeria = hotelRepository.setListaPreciosHabitaciones(95, 140, 185, 220);
		ArrayList<Integer> preciosAlfalfa = hotelRepository.setListaPreciosHabitaciones(85, 110, 165, 210);
		ArrayList<Integer> preciosSanGil = hotelRepository.setListaPreciosHabitaciones(65, 95, 125, 160);

		// cargar hoteles

		HotelImpl hotelSantaCruz = hotelRepository.cargarDatosHotel("Hotel Santa Cruz", "Santa Cruz", preciosHotelSantaCruz);
		HotelImpl hotelElArenal = hotelRepository.cargarDatosHotel("Hotel El Arenal", "El Arenal", preciosElArenal);
		HotelImpl hotelFeria = hotelRepository.cargarDatosHotel("Hotel Feria", "Feria", preciosFeria);
		HotelImpl hotelAlfalfa = hotelRepository.cargarDatosHotel("Hotel Alfalfa", "Alfalfa", preciosAlfalfa);
		HotelImpl hotelSanGil = hotelRepository.cargarDatosHotel("Hotel San Gil", "San Gil", preciosSanGil);

		result.add(hotelSantaCruz);
		result.add(hotelElArenal);
		result.add(hotelFeria);
		result.add(hotelAlfalfa);
		result.add(hotelSanGil);

		return result;
	}	
	

	public void mensajeBienvenida() {
		System.out.println("BIENVENIDO!");
		System.out.println("Este es el portal de HOTELES PACO S.A. donde puede realizar su reserva.");

	}
	
	public void realizarReserva(ArrayList<HotelImpl> listaHotelesRepositorio, Scanner sc) {

		// Mostrar los hoteles disponibles
		HotelServicio hs = new HotelServicio();
		hs.imprimirHoteles(listaHotelesRepositorio);
		
		// el usuario selecciona un hotel de la lista
		HotelImpl hotelSeleccionado = hs.seleccionarHotel(listaHotelesRepositorio, sc);

		
		// seleccionarHabitaciones
		HabitacionImpl habitacionSeleccionada = hs.seleccionarTipoHabitaciones(hotelSeleccionado, sc);
		
		// mes, día y número de noches que quiere hospedarse 
		int mesReservaSeleccionado = seleccionarMesReserva();
		int diaInicioReservaSeleccionado = seleccionarDiaReserva(mesReservaSeleccionado);
		int numeroNochesSeleccionado = seleccionarNumeroNoches();
		
		// calculamos el precio final
		int precioFinal = calcularPrecio(numeroNochesSeleccionado, habitacionSeleccionada);
		
		resumenReserva(hotelSeleccionado, habitacionSeleccionada, mesReservaSeleccionado, diaInicioReservaSeleccionado, numeroNochesSeleccionado, precioFinal);
	}
	
	
	public int seleccionarMesReserva() {
		ReservaServicio rs = new ReservaServicio();
		
		int mesReservaSeleccionado = rs.seleccionarMesReserva(sc);
		return mesReservaSeleccionado;
	}
	
	public int seleccionarDiaReserva(int mesReservaSeleccionado) {
		ReservaServicio rs = new ReservaServicio();
		
		int diaInicioReservaSeleccionado = rs.seleccionarDiaReserva(mesReservaSeleccionado, sc);
		return diaInicioReservaSeleccionado;
	}
	
	public int seleccionarNumeroNoches() {
		ReservaServicio rs = new ReservaServicio();
		
		int diaInicioReservaSeleccionado = rs.seleccionarNumeroNoches(sc);
		return diaInicioReservaSeleccionado;
	}
	
	
	public int calcularPrecio(int numeroNochesSeleccionado, HabitacionImpl habitacionSeleccionada) {
		ReservaServicio rs = new ReservaServicio();
		
		int precioFinal = rs.calcularPrecio(numeroNochesSeleccionado, habitacionSeleccionada);
		return precioFinal;
	}
	
	public void resumenReserva(HotelImpl hotelSeleccionado, HabitacionImpl habitacionSeleccionada, int mesReservaSeleccionado, int diaInicioReservaSeleccionado, int numeroNochesSeleccionado, int precioFinal) {
		
		ReservaServicio rs = new ReservaServicio();
		rs.crearReserva(hotelSeleccionado, habitacionSeleccionada, mesReservaSeleccionado, diaInicioReservaSeleccionado, numeroNochesSeleccionado, precioFinal);
	}
	
	
	public void confirmarReserva() {
		// imprimir mensaje confirmacion
		// seleccionar confirmacion
		String confirmacion = confirmacionReserva(); 
		// si está ok -> pago
		// no ok -> menu principal
		if (confirmacion.equals("S") ||confirmacion.equals("s")) {
			pagoReserva();
		} else {
			programaPpal();
		}
		
	}
	
	public String confirmacionReserva () {
		ReservaServicio rs = new ReservaServicio();
		
		String confirmacion = rs.confirmacionReserva(); 
		return confirmacion; 
	}
	
	public void pagoReserva() {
		//mensaje para ver qué pago quiere
		//ver qué opcion quiere
		int opcionPago = seleccionarOpcionPago(); 
		// pago 1 -> pago total
		if (opcionPago == 1) {
			pagoTarjetaDirecto();
		} else if (opcionPago == 2) {
			// pago 2 -> tarjeta como garantía;
			pagoTarjetaGarantia();
		}
		//mensaje de cierre 
		
		mensajeCierre(); 
	}
	
	public int seleccionarOpcionPago() {
		PagoServicio ps = new PagoServicio();
		
		int opcionPago = ps.seleccionarOpcionPago(sc); 
		return opcionPago; 		
	}
	
	public void pagoTarjetaDirecto() {
		PagoServicio ps = new PagoServicio();
		//titular Tarjeta
		ps.escribirTitularTarjeta(); 
		//numero Tarjeta
		ps.numeroTarjeta(); 
		//mes caducidad
		ps.fechaMesCaducidad(); 
		// anio caducidad
		ps.fechaAnioCaducidad(); 
		// cvv
		ps.numeroCVV(); 
	}
	
	public void pagoTarjetaGarantia() {
		PagoServicio ps = new PagoServicio();
		//titular Tarjeta
		ps.escribirTitularTarjeta(); 
		//numero Tarjeta
		ps.numeroTarjeta(); 
		//mes caducidad
		ps.fechaMesCaducidad();		
		// anio caducidad
		ps.fechaAnioCaducidad(); 
	}
	
	public void mensajeCierre() {
		PagoServicio ps = new PagoServicio();
		ps.mensajeCierre();
	}
	
	
	
	
	
	
}
