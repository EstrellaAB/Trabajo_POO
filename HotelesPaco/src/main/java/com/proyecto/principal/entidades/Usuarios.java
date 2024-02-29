package com.proyecto.principal.entidades;

public abstract class Usuarios {
	
	protected String nombreCompleto;
    protected String nombreUsuario;
    protected String contraseña;
    protected int fechaCumple;
    private String[][] usuarios;
    private int capacidadMaxima;
    private int numUsuarios;
    
    public Usuarios() {
    	
    }
	public Usuarios(String nombreCompleto, String nombreUsuario, String contraseña, int fechaCumple,
			String[][] usuarios, int capacidadMaxima, int numUsuarios) {
		this.nombreCompleto = nombreCompleto;
		this.nombreUsuario = nombreUsuario;
		this.contraseña = contraseña;
		this.fechaCumple = fechaCumple;
		this.usuarios = usuarios;
		this.capacidadMaxima = capacidadMaxima;
		this.numUsuarios = numUsuarios;
	}
	
	
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public int getFechaCumple() {
		return fechaCumple;
	}
	public void setFechaCumple(int fechaCumple) {
		this.fechaCumple = fechaCumple;
	}
	public String[][] getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(String[][] usuarios) {
		this.usuarios = usuarios;
	}
	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}
	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}
	public int getNumUsuarios() {
		return numUsuarios;
	}
	public void setNumUsuarios(int numUsuarios) {
		this.numUsuarios = numUsuarios;
	}
    
}
