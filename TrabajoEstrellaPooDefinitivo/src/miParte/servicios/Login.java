package miParte.servicios;

import java.util.ArrayList;
import java.util.Scanner;

import miParte.objetos.UsuarioAdmind;
import miParte.objetos.UsuarioNormal;
import miParte.objetos.Usuarios;


public class Login {
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
	public void inicioSesion() {
		try {
			System.out.println("Introduzca como quiere iniciar seccion: 1 usuario 2 Administrador. ");
			int opcionUsu= sc.nextInt();
		    
			switch(opcionUsu) {
			case 1: 
				loginUsuario(sc);
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
    public static void loginUsuario (Scanner sc) {
    	UsuarioNormal usuario = new UsuarioNormal();
        System.out.println("Ingrese su nombre de usuario:");
        String usu = sc.next();
	        if (usuario.getNombreUsuario().equals(usu)) {
	          
	            System.out.println("Ingrese su contraseña:");
	            String cont = sc.next();
	            if (usuario.getNombreUsuario().equals(cont)) {
	                System.out.println("Has entrado en la sesión de " + usuario.getNombreUsuario());
	            } else {
	                System.out.println("Error, contraseña incorrecta.");
	            }
	        }else {
	        	System.out.println("NOmbre incorrecto");
	        }
    }
	
	// Funcion para el login de un administrador
    public static void admin(Scanner sc) {
    	UsuarioAdmind usuario = new UsuarioAdmind();
        System.out.println("Ingrese su nombre de usuario:");
        String intentoUsuario = sc.next();
        if (usuario.getNombreUsuario().equals(intentoUsuario)) {
            System.out.println("Ingrese la contraseña:");
            String cont = sc.next();
            if (cont.equals("guillamon")) {
                System.out.println("Has entrado en la sesión de administrador de " + usuario.getNombreUsuario());
            } else {
                System.out.println("Error, contraseña incorrecta.");
            }
        }
    }
}
