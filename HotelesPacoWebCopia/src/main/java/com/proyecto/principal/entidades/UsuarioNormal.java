package com.proyecto.principal.entidades;

public class UsuarioNormal extends Usuarios{

	public UsuarioNormal() {
		super();
	}

	public UsuarioNormal(String nombreCompleto, String nombreUsuario, String contraseña, int fechaCumple,
			String[][] usuarios, int capacidadMaxima, int numUsuarios) {
		super(nombreCompleto, nombreUsuario, contraseña, fechaCumple, usuarios, capacidadMaxima, numUsuarios);
	}
	
public void ex(String correo, String nombreUsuario, String contrasena) {
		
		System.out.println(correo +""+ nombreUsuario+""+contrasena);
	}
	
}