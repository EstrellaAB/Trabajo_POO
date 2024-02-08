package trabajoParteEstrella;
import java.util.Random;
import java.util.Scanner;

public class TrabajoEstrella {
    // Declaro el objeto Scanner
    public static Scanner sc = new Scanner(System.in); // Instancia de Scanner para entrada estándar
    public static String nombreUsuario;
    public static String contraseña;
    public static String nombreCompleto;
    public static String confirmarContraseña;
    // Clase para representar usuarios
    static class Usuario {
        String nombreCompleto;
        String nombreUsuario;
        String contraseña;
        int fechaCumple;

        // Constructor
        Usuario(String nombreCompleto, String nombreUsuario, String contraseña, int fechaCumple) {
            this.nombreCompleto = nombreCompleto;
            this.nombreUsuario = nombreUsuario;
            this.contraseña = contraseña;
            this.fechaCumple = fechaCumple;
        }

        // Método para verificar la contraseña
        boolean verificarContraseña(String contraseña) {
            return this.contraseña.equals(contraseña);
        }
    }

    // Clase para representar el administrador
    static class Administrador {
        String nombreUsuario;
        String contraseña;

        // Constructor
        Administrador(String nombreUsuario, String contraseña) {
            this.nombreUsuario = nombreUsuario;
            this.contraseña = contraseña;
        }

        // Método para verificar la contraseña del administrador
        boolean verificarContraseña(String contraseña) {
            return this.contraseña.equals(contraseña);
        }
    }

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

    // Función para el login de un administrador
    public static void loginAdmin(Administrador admin) {
        // Solicitar nombre de usuario para el administrador
        System.out.println("Ingrese su nombre de usuario:");
        String inputUsuario = sc.next();

        if (inputUsuario.equals(admin.nombreUsuario)) {
            // Verificación de contraseña para el administrador
            System.out.println("Ingrese la contraseña:");
            String inputContraseña = sc.next();
            if (admin.verificarContraseña(inputContraseña)) {
                // Ejecutar tareas del administrador...
                System.out.println("Has entrado en la sesión de administrador de " + admin.nombreUsuario);
            } else {
                System.out.println("Error, contraseña incorrecta.");
            }
        } else {
            System.out.println("Nombre de usuario no encontrado.");
        }
    }

    // Función principal (main) del programa
    public static void main(String[] args) {
        try {
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
                    	boolean malcon = true;
                        boolean malfec = true;
 
                        System.out.println("Ingrese su nombre:");
                        nombreCompleto = sc.next();
 
                        System.out.println("Ingrese su nombre de usuario:");
                        nombreUsuario = sc.next();
 
                        while (malcon) {
                            System.out.println("Ingrese su contraseña:");
                            contraseña = sc.next();
 
                            System.out.println("Confirme su contraseña:");
                            confirmarContraseña = sc.next();
 
                            if (contraseña.equals(confirmarContraseña)) {
                                System.out.println("Contraseña creada correctamente.");
                                malcon = false;                           
                                
	                            if (!contraseña.matches("^(?=.*[A-Z])(?=.*[!@#$&*])(?=.*[0-9]).{8,}$")) {
	                                System.out.println("La contraseña no cumple con los requisitos mínimos.");
	                                System.out.println("Debe contener al menos una letra mayúscula, un carácter especial (!@#$&*)");
	                                System.out.println("y un número, y tener una longitud mínima de 8 caracteres.");    
	                            }
                            }
                        }    
                        while (malfec) {
                            System.out.println("Ingrese su fecha de nacimiento (dd/mm/yyyy): ");
                            String fechaCumple = sc.next();
                            int añoActual = 2024; //año actual
                            int añoNacimiento = Integer.parseInt(fechaCumple.substring(6));
                            int edad = añoActual - añoNacimiento;
                     
                            if (edad < 18) {
                                System.out.println("Lo siento, debes ser mayor de edad para registrarte.");
                                return;
                            } else {
                                malfec = false;
                                System.out.println("Registro exitoso. Esta es la información ingresada, si tiene algun error no dudes en contactarnos:");
                                System.out.println("Nombre completo: " + nombreCompleto);
                                System.out.println("Nombre de usuario: " + nombreUsuario);
                                System.out.println("Fecha de nacimiento: " + fechaCumple );
                                System.out.println(" ");
                            }
                        }
                        break;

                    case 2:
                        if (usuarioRegistrado != null) {
                            login(usuarioRegistrado); // Ejecuto el proceso de inicio de sesión del usuario
                        } else {
                            System.out.println("Primero debes registrarte.");
                        }
                        break;

                    case 3:
                        loginAdmin(admin); // Ejecuto el proceso de inicio de sesión del administrador
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