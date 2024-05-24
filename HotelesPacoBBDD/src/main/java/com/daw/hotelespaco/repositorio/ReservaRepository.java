package com.daw.hotelespaco.repositorio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.daw.hotelespaco.entidades.ReservaImpl;

public class ReservaRepository {
	
	// TODO: Insert
	public void insertarReserva(ReservaImpl reserva) {
		
		try {
			ConexionBBDD conexionBBDD = new ConexionBBDD(); 
			Connection conexion = conexionBBDD.conectar();

			String sql = "INSERT INTO Reservas(idReserva, idPago, idHotel, idHabitacion, fecha_entrada, fecha_salida) VALUES(?, ?, ?, ?, ?, ?)";
			PreparedStatement ps = conexion.prepareStatement(sql);
			ps.setInt(1, reserva.getIdReserva());
			ps.setInt(2, reserva.getIdPago());
			ps.setInt(3, reserva.getIdHotel());
			ps.setInt(4, reserva.getIdHabitacion());
			ps.setDate(5, reserva.getFecha_entrada());
			ps.setDate(6, reserva.getFecha_salida());
			ps.executeUpdate();
			ps.close();
			
			conexionBBDD.desconectar(conexion);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
