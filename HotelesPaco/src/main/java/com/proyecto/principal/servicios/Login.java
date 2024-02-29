package com.proyecto.principal.servicios;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import com.proyecto.principal.entidades.UsuarioAdmind;
import com.proyecto.principal.entidades.Usuarios;

public class Login extends Usuarios {
	public Scanner sc = new Scanner (System.in);
		
		public void registrar(Usuarios usuario, ArrayList <Usuarios>usuariosRegistrados) {
			
			boolean malcon = true;
		    boolean malfec = true;
		    
		    System.out.println("Ingrese su nombre.");
		    usuario.setNombreCompleto(sc.next());

		    System.out.println("Ingrese su nombre de usuario:");
		    usuario.setNombreUsuario( sc.next());

		    while (malcon) {
		        System.out.println("Ingrese su contraseña:");
		        usuario.setContraseña( sc.next());

		        System.out.println("Confirme su contraseña:");
		        String confirmarContrasena = sc.next();

		        if (usuario.getContraseña().equals(confirmarContrasena)) {
		            if (!usuario.getContraseña().matches("^(?=.*[A-Z])(?=.*[!@#$&*])(?=.*[0-9]).{8,}$")) {
		                System.out.println("La contraseña no cumple con los requisitos mínimos.");
		                System.out.println("Debe contener al menos una letra mayúscula, un carácter especial (!@#$&*)");
		                System.out.println("y un número, y tener una longitud mínima de 8 caracteres.");    
		            }else {
		            	System.out.println("Contraseña creada correctamente.");
			            malcon = false; 
			            
		            }
		        }
		    }    
		    while (malfec) {
		        System.out.println("Ingrese su año de nacimiento: ");
		        usuario.setFechaCumple((sc.nextInt()));
		        int añoActual = 2024; //año actual
		        int edad = añoActual - usuario.getFechaCumple();
		 
		        if (edad < 18) {
		            System.out.println("Lo siento, debes ser mayor de edad para registrarte.");
		            return;
		        } else {
		            malfec = false;
		            
		            System.out.println("Registro exitoso. Esta es la información ingresada, si tiene algun error no dudes en contactarnos:");
		            System.out.println("Nombre completo: " + usuario.getNombreCompleto());
		            System.out.println("Nombre de usuario: " + usuario.getNombreUsuario());
		            System.out.println("Fecha de nacimiento: " + usuario.getFechaCumple() );
		            System.out.println(" ");
		        }
		    }
		    usuariosRegistrados.add(usuario);
	}
	public void inicioSesion(ArrayList<Usuarios> usuariosRegistrados) {
		try {
			System.out.println("Introduzca como quiere iniciar sesion: 1 usuario 2 Administrador. ");
			int opcionUsu= sc.nextInt();
		    
			switch(opcionUsu) {
			case 1: 
				loginUsuario(sc, usuariosRegistrados);
			break;
			case 2: 
				admin(sc);
			break;
			
			default:
				System.out.println("Incorrecto");
				break;
			}
	    } catch (java.util.InputMismatchException a) {
	        System.out.println("No puedes ingresar letras.");
	    }
	}
	
	// Funcion para el login de un usuario
    public void loginUsuario (Scanner sc, ArrayList<Usuarios> usuariosRegistrados) {

    	Random random = new Random();
	    int randomNum = random.nextInt(10000);
	    for (Usuarios usuario : usuariosRegistrados) {
    	char nom = 'B'; // Variable de control para bucle de autenticación
        System.out.println("Ingrese su nombre de usuario:");
        String usu = sc.next();
	        if (usuario.getNombreUsuario().equals(usu)) { 

	            System.out.println("Ingrese su contraseña:");
	            String cont = sc.next();
	            if (usuario.getContraseña().equals(cont)) {
	    		    while (nom == 'B') {
	    		    	 System.out.println("Para verificar que eres un humano, ingresa el siguiente número: " + randomNum);
	    			        System.out.println("Ingrese el número que aparece arriba: ");
	    			        int usuarioNum = sc.nextInt();
	    			
	    			        if (usuarioNum == randomNum) {
	    			            // Verificación de la contraseña
	    			            for (int intentos = 3; intentos > 0; intentos--) {
	    		
	    			                    nom = 'N'; // Cambia el valor para salir del bucle
					                System.out.println("Has entrado en la sesión de " + usuario.getNombreUsuario()); 
					               
					                selectorClases();
				    		    }
    			            }
	    		    }
		    } else {
            System.out.println("Error, contraseña incorrecta.");
		    }
    }else {
    	System.out.println("Nombre Incorrecto");
    	}
	    }
    }
	
	// Funcion para el login de un administrador
    public void admin(Scanner sc) {
    	UsuarioAdmind usuario = new UsuarioAdmind();
        System.out.println("Ingrese su nombre de usuario:");
        String nom = sc.next();
        if (usuario.getNombreUsuario().equals(nom)) {
            System.out.println("Ingrese la contraseña:");
            String cont = sc.next();
            if (cont.equals("Guillamon10!")) {
                System.out.println("Has entrado en la sesión de administrador de " + usuario.getNombreUsuario());
            } else {
                System.out.println("Error, contraseña incorrecta.");
            }
        }
    }
    
    public void selectorClases() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Seleccione si quiere ir al gestor de menus, o a la gestión de reservas: ");
    	String eleccion = sc.nextLine();
    	
    		switch(eleccion) {
    			
    			case "gestor de menus":
    				new Gestiones().menu();
    				break;
    			case "gestor de reservas":
    				new PortalDeReservasMain().programaPpal();
    				break;
    			default:
    				System.err.println("Introduzca una opción válida.");
    				break;
    		}
    }
}
