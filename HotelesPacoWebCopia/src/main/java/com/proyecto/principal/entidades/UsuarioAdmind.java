package com.proyecto.principal.entidades;

public class UsuarioAdmind extends Usuarios{

	protected String nombreAdmin = "Guillamon";
	protected String passAdmin = "Guillamon1234";
	
	public UsuarioAdmind() {
		super();
	}

	public UsuarioAdmind(String nombreAdmin, String passAdmin) {
		super();
		this.nombreAdmin = nombreAdmin;
		this.passAdmin = passAdmin;
	}

	
}
