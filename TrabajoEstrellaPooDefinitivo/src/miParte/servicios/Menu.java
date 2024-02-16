package miParte.servicios;

import java.util.ArrayList;
import java.util.Scanner;

import miParte.objetos.UsuarioNormal;
import miParte.objetos.Usuarios;
public class Menu {
	//constructor
	
	public void menu() {
		ArrayList<Usuarios> usuariosRegistrados = new ArrayList<Usuarios>();
		
		try {
			Scanner sc = new Scanner(System.in);
		    boolean repit = true;
		    Login login= new Login();
			while (repit) {
			    // Menu
			int hacerUsu;
			System.out.println("Bienvenido a hoteles Paco. ¿Qué quieres hacer?");
			System.out.println("1. Registrarse.");
			System.out.println("2. Iniciar sesión.");
			System.out.println("3. Salir.");
			hacerUsu = sc.nextInt(); // Lee la opción ingresada por el usuario
			UsuarioNormal usuario = new UsuarioNormal();
			switch (hacerUsu) { // Proceso para saber la opción elegida por el usuario
			    case 1:
			    	
			        login.registrar(usuario, usuariosRegistrados);
			        break;
			        
			    case 2:
			    	login.inicioSesion();
			        break;
			
			    case 3:
			        repit = false; // Salgo del bucle while para terminar el programa
			        System.out.println("Has salido del programa. ¡Adiós!");
			        break;
			
			    default:
			        System.out.println("No ingresaste un número válido.");
			}
			}
	        sc.close(); // Cierro el Scanner al finalizar el programa
	    } catch (java.util.InputMismatchException a) {
	        System.out.println("No puedes ingresar letras.");
	    }
	}   
}
