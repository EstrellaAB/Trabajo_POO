package com.proyecto.principal.repositorios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBBDD {
	
	public static final String CONEXION_URL = "jdbc:mariadb://localhost:3306/PRUEBA_DAW";
	public static final String USER = "root";
	public static final String PASSWORD = "root";
	
	public Connection conectar() {
		Connection conexion = null;

		try {
            Class.forName("org.mariadb.jdbc.Driver");
            conexion = DriverManager.getConnection(
                    CONEXION_URL, USER, PASSWORD);
            System.out.println("Conectado...");
            
            
        } catch (SQLException | ClassNotFoundException ce) {
            ce.printStackTrace();
        }
        
        return conexion;
	}
	
	public void cerrarConexion(Connection conexion) {
		try {
			conexion.close();
			System.out.println("Desconectado!!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}