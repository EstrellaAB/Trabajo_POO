package trabajoParteEstrella;

import java.util.Random;
import java.util.Scanner;

public class Login extends Registrar{
	public Login(String nombreUsuario, String contraseña) {
		super(nombreUsuario, contraseña);
	}
	
	public static Scanner sc = new Scanner(System.in);
	
	// Función para el login de un usuario
	
    public static void login(Usuario usuario) {
        // Variables para almacenar nombre de usuario y contraseña
        String contraseña;
        char nom = 'B'; // Variable de control para bucle de autenticación

        // bucle para la autenticación del usuario
        Random random = new Random();
        int randomNum = random.nextInt(10000);
        while (nom == 'B') {
            // Solicitar nombre de usuario
            System.out.println("Ingrese su nombre de usuario:");
            String inputUsuario = sc.next();

            // Verificación de humano a través de un número aleatorio
            System.out.println("Para verificar que eres un humano, ingresa el siguiente número: " + randomNum);
            System.out.println("Ingrese el número que aparece arriba: ");
            int usuarioNum = sc.nextInt();

            if (usuarioNum == randomNum && inputUsuario.equals(usuario.nombreUsuario)) {
                // Verificación de la contraseña
                for (int intentos = 3; intentos > 0; intentos--) {
                    System.out.println("Ingrese su contraseña:");
                    contraseña = sc.next();
                    if (usuario.verificarContraseña(contraseña)) {
                        System.out.println("Has entrado en la sesión de " + usuario.nombreUsuario);
                        intentos = 0; // Sale del bucle de intentos
                    } else {
                        System.out.println("Error, contraseña incorrecta.");
                        intentos--; // Disminuye el número de intentos
                        System.out.println("Te quedan " + intentos);
                    }
                }
            } else {
                System.out.println("Número incorrecto o nombre de usuario inválido, por favor inténtalo de nuevo.");
            }
        }
    }
}
