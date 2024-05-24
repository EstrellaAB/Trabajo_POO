package com.daw.hotelespaco.repositorio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.daw.hotelespaco.entidades.HabitacionImpl;
import com.daw.hotelespaco.entidades.HotelImpl;


public class HotelRepositorio {
	
	public ArrayList<HotelImpl> obtenerTodosLosHoteles() {
		ArrayList<HotelImpl> resultado = new ArrayList<HotelImpl>();
		
		try {
			ConexionBBDD conexionBBDD = new ConexionBBDD(); 			
			Connection conexion = conexionBBDD.conectar();

			String sql = "SELECT * "
					+ "FROM hoteles h "
					+ "ORDER BY h.nombre ASC";
			
			PreparedStatement ps = conexion.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				
				HotelImpl hotel = new HotelImpl();
				hotel.setId(rs.getInt("id_hotel"));
				hotel.setNombre(rs.getString("Nombre"));
				hotel.setBarrio(rs.getString("Barrio"));
				
				resultado.add(hotel);
			}
			
			rs.close();
			ps.close();
			
			conexionBBDD.desconectar(conexion);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return resultado;
	}
	
	
	public ArrayList<HabitacionImpl> otenerHabitacionesHotelSeleccionado(int idHotel) {
		ArrayList<HabitacionImpl> resultado = new ArrayList<HabitacionImpl>();
		
		try {
			ConexionBBDD conexionBBDD = new ConexionBBDD(); 			
			Connection conexion = conexionBBDD.conectar();

			String sql = "SELECT * "
					+ "FROM Habitaciones h "
					+ "WHERE id_hotel = ?";
			
			PreparedStatement ps = conexion.prepareStatement(sql);
			ps.setInt(1, idHotel);
			
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				
				HabitacionImpl habitacion = new HabitacionImpl();
				habitacion.setIdHabitacion(rs.getInt("id_habitacion"));
				habitacion.setTipo(rs.getString("Tipo"));
				habitacion.setNumPersonas(rs.getInt("numPersonas"));
				habitacion.setPrecioHabitacion(rs.getInt("Precio"));
				habitacion.setOcupada(rs.getBoolean("Ocupada"));
				
				resultado.add(habitacion);
			}
			
			rs.close();
			ps.close();
			
			conexionBBDD.desconectar(conexion);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return resultado;
	}
}
