package com.proyecto.principal.repositorios;

import java.util.ArrayList;

import com.proyecto.principal.entidades.HabitacionImpl;
import com.proyecto.principal.entidades.HotelImpl;

public class HotelRepository {
	
	
	public HotelImpl cargarDatosHotel(String nombreHotel, String barrioHotel, ArrayList<Integer> listaPreciosHabitaciones) {
		ArrayList<HabitacionImpl> listaHabitaciones = new ArrayList<HabitacionImpl>();
		
		// los hoteles tienen por defecto habitaciones para 1, 2, 3 o 4 personas. No hay mas tipos de habitación
		
		
//		for(Integer precio : listaPreciosHabitaciones)
		for (int i = 0; i < listaPreciosHabitaciones.size(); i++) {
			HabitacionImpl habitacion = new HabitacionImpl(i + 1, listaPreciosHabitaciones.get(i));
			listaHabitaciones.add(habitacion);
			
		}		
		
		HotelImpl result = new HotelImpl(nombreHotel, barrioHotel, listaHabitaciones); // a la izq del igual se pone la interfz a la dcha la clase
			
		return result;
		
	}
	
	public ArrayList<Integer> setListaPreciosHabitaciones(int precioIndividual, int precioDoble, int precioTriple, int precioCuadruple) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		result.add(precioIndividual);
		result.add(precioDoble);
		result.add(precioTriple);
		result.add(precioCuadruple);
		
		return result;
	}

}
