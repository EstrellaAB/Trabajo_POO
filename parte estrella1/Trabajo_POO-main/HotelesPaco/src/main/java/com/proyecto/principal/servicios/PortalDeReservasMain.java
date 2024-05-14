package com.proyecto.principal.servicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.proyecto.principal.entidades.HabitacionImpl;
import com.proyecto.principal.entidades.HotelImpl;
import com.proyecto.principal.repositorios.HotelRepository;

public class PortalDeReservasMain {

	private static Scanner sc;

	public void programaPpal() {

		ArrayList<HotelImpl> listaHotelesRepositorio = cargarDatosHotelDesdeArchivo();

		// Bienvenida
		mensajeBienvenida();
		
		// Elegir barrio y Resumen del pedido
		realizarReserva(listaHotelesRepositorio, sc);
		
		// confirmar reserva
		
		confirmarReserva(); 

	}

	 public ArrayList<HotelImpl> cargarDatosHotelDesdeArchivo() {
	        
		 ArrayList<HotelImpl> result = new ArrayList<HotelImpl>();

	        try {
	        	File archivo = new File ("hoteles.txt");
	        	FileReader fr = new FileReader(archivo);
	        	BufferedReader br = new BufferedReader(fr);
	            String linea;
	            
	            do {
	            	linea = br.readLine();
	            	if (linea != null) {	            		
	            		HotelImpl hotel = obtenerDatosLineaFichero(linea); 
	            		if(hotel != null) {
	            			result.add(hotel); 
	            		}	            		
	            	}
	            } while (linea != null);
	            
	            br.close();
	            fr.close();
	            
	        } catch (IOException e) {
	            escribirEnArchivo("Se ha producido un error al leer el archivo");
	            e.printStackTrace();
	            
	        } catch (NumberFormatException e) {
	            System.err.println("Error: Formato de número incorrecto en el archivo");
	            e.printStackTrace();
	        }

	        return result;
	    }
	 
	 public  HotelImpl obtenerDatosLineaFichero(String linea) {
		 HotelImpl hotel = null; 
		 HotelRepository hotelRepository = new HotelRepository();
		 
		 String [] datos = linea.split(";"); 
		 
		 if(datos.length == 6) {
			 hotel = new HotelImpl(); 
			 Integer precioIndividual = getPrecios(datos, 2);
			 Integer precioDoble = getPrecios(datos, 3);
			 Integer precioTriple = getPrecios(datos, 4);
			 Integer precioCuadruple = getPrecios(datos, 5);
			 
			 if (validarNombre(datos, linea) && validarBarrio(datos, linea) && validarPrecio(datos, linea) ) { 
				 ArrayList<Integer> preciosHabitaciones = hotelRepository.setListaPreciosHabitaciones(precioIndividual, precioDoble, precioTriple, precioCuadruple);
				 hotel = hotelRepository.cargarDatosHotel(datos[0], datos[1], preciosHabitaciones);
				 
			 } else {
				 hotel = null;
			 }
		 }
		 
		 return hotel; 
	 }
	 
	 
	 public Integer getPrecios(String[] datos, int i) {
		 Integer precio = 0;
		 
		 try { 
			 
			 precio = Integer.parseInt(datos[i]);
			 
			 
		 } catch (Exception e) {
			
		 }
		 
		 return precio;
	 }
	 
	 public boolean validarNombre(String[]datos, String linea) {
		 boolean esValido = false; 
		 	if (datos[0].length()<30) {
		 		esValido = true; 
		 	}else {
		 		escribirEnArchivo("Error en la linea: " + linea + " porque el nombre es muy largo");
		 	}
		 return esValido;
	 }
	 
	 public boolean validarBarrio(String[]datos, String linea) {
		 boolean esValido = false;
		 if (datos[0].length() < 30) {
		 		esValido = true; 
		 	}else {
		 		escribirEnArchivo("Error en la linea: " + linea + " porque el nombre es muy largo");
		 	}
		 		 
		 return esValido;
	 }
	 
	 public boolean validarPrecio(String[]datos, String linea) {
		 boolean esValido = false;
		 
		 int precio = Integer.parseInt(datos[2]); 
		 
		 if(precio > 0) {
			 esValido = true;
		 }else {
			 escribirEnArchivo("Error en la linea: " + linea + " , el precio debe ser mayor a 0");
		 }
		 
		 return esValido;
	 }
	
	
	 public void escribirEnArchivo(String error) {

			File archivo = new File("errores.log");
			try {
				// pongo el true en FileWriter para que solo me genere
				// un nuevo archivo que contenga la info del error
				FileWriter fw = new FileWriter(archivo, true);
				BufferedWriter bw = new BufferedWriter(fw);

				bw.write("\n" + error);
				bw.flush();
				bw.close();
				fw.close();

			} catch (IOException e) {
				e.printStackTrace();
			}

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
