package miParte.repositorios;

import java.util.ArrayList;

import miParte.objetos.Usuarios;

public class ListasDeUsuarios {
	 public void usuarios(Usuarios usuarioRegistrado) {
	   		ArrayList<Usuarios> usuariosRegistrados = new ArrayList<>();
	   		
	           // Acceder a los usuarios almacenados en el ArrayList
	           for (Usuarios usuario : usuariosRegistrados) {
	               System.out.println("Nombre: " + usuario.getNombreUsuario() );
	           }
	   	}
}
