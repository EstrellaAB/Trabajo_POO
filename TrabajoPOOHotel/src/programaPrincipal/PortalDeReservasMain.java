package programaPrincipal;

import java.util.ArrayList;
import java.util.Scanner;

import objetos.HabitacionImpl;
import objetos.HotelImpl;
import repositorio.HotelRepository;
import servicios.HotelServicio;
import servicios.ReservaServicio;

public class PortalDeReservasMain {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);

		programaPpal();
		
		System.out.println("Fin de programa");

		sc.close();

	}

	public static void programaPpal() {

		ArrayList<HotelImpl> listaHotelesRepositorio = cargarDatosHotel();

		// Bienvenida
		mensajeBienvenida();
		
		// Elegir barrio y Resumen del pedido
		realizarReserva(listaHotelesRepositorio);

	}

	public static ArrayList<HotelImpl> cargarDatosHotel() {

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
	

	public static void mensajeBienvenida() {
		System.out.println("BIENVENIDO!");
		System.out.println("Este es el portal de HOTELES PACO S.A. donde puede realizar su reserva.");

	}
	
	public static void realizarReserva(ArrayList<HotelImpl> listaHotelesRepositorio) {

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
	
	
	public static int seleccionarMesReserva() {
		ReservaServicio rs = new ReservaServicio();
		
		int mesReservaSeleccionado = rs.seleccionarMesReserva(sc);
		return mesReservaSeleccionado;
	}
	
	public static int seleccionarDiaReserva(int mesReservaSeleccionado) {
		ReservaServicio rs = new ReservaServicio();
		
		int diaInicioReservaSeleccionado = rs.seleccionarDiaReserva(mesReservaSeleccionado, sc);
		return diaInicioReservaSeleccionado;
	}
	
	public static int seleccionarNumeroNoches() {
		ReservaServicio rs = new ReservaServicio();
		
		int diaInicioReservaSeleccionado = rs.seleccionarNumeroNoches(sc);
		return diaInicioReservaSeleccionado;
	}
	
	
	public static int calcularPrecio(int numeroNochesSeleccionado, HabitacionImpl habitacionSeleccionada) {
		ReservaServicio rs = new ReservaServicio();
		
		int precioFinal = rs.calcularPrecio(numeroNochesSeleccionado, habitacionSeleccionada);
		return precioFinal;
	}
	
	public static void resumenReserva(HotelImpl hotelSeleccionado, HabitacionImpl habitacionSeleccionada, int mesReservaSeleccionado, int diaInicioReservaSeleccionado, int numeroNochesSeleccionado, int precioFinal) {
		
		ReservaServicio rs = new ReservaServicio();
		rs.crearReserva(hotelSeleccionado, habitacionSeleccionada, mesReservaSeleccionado, diaInicioReservaSeleccionado, numeroNochesSeleccionado, precioFinal);
	}
}
