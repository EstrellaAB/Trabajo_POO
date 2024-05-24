package com.daw.hotelespaco.repositorio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.daw.hotelespaco.entidades.PagoImpl;

public class PagoRepositorio {
	
	public void insertarPago (PagoImpl pago) {
		
		try {
		ConexionBBDD conexionBBDD = new ConexionBBDD(); 
		Connection conexion = conexionBBDD.conectar();

		String sql = "INSERT INTO Pagos(titularTarjeta, numTarjeta, mesCaducidad, anyoCaducidad) VALUES(?, ?, ?, ?)";
		PreparedStatement ps = conexion.prepareStatement(sql);
		ps.setString(1, pago.getTitularTarjeta());
		ps.setInt(2, pago.getNumTarjeta());
		ps.setDate(3, pago.getMesCaducidad());
		ps.setDate(4,pago.getAnyoCaducidad());
		
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
