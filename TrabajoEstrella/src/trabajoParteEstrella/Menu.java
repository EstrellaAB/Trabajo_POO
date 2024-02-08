package trabajoParteEstrella;

import java.util.Scanner;

public class Menu {
	
	public void menu() {
	    try {
	    	Scanner sc = new Scanner(System.in);
	        boolean repit = true;
	        Usuario usuarioRegistrado = null; // Usuario registrado después del registro
	        Administrador admin = new Administrador("admin", "guillamonApruebame");
	
	        while (repit) {
	            // Menu
	            int hacerUsu;
	            System.out.println("Bienvenido a hoteles Paco. ¿Qué quieres hacer?");
	            System.out.println("1. Registrarse.");
	            System.out.println("2. Iniciar sesión.");
	            System.out.println("3. Iniciar sesión administrador.");
	            System.out.println("4. Salir.");
	            hacerUsu = sc.nextInt(); // Lee la opción ingresada por el usuario
	
	            switch (hacerUsu) { // Proceso para saber la opción elegida por el usuario
	                case 1:
	                    new Registrar(null, null).estrella();
	                    break;
	
	                case 2:
	                    if (usuarioRegistrado != null) {
	                        usuarioRegistrado.usuarios(usuarioRegistrado); // Ejecuto el proceso de inicio de sesión del usuario
	                    } else {
	                        System.out.println("Primero debes registrarte.");
	                    }
	                    break;
	
	                case 3:
	                	LoginAdmin.loginAdmin(admin); // Ejecuto el proceso de inicio de sesión del administrador
	                    break;
	
	                case 4:
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
