package trabajoParteEstrella;
import java.util.Scanner;
public class LoginAdmin extends Usuario{
	public static Scanner sc = new Scanner(System.in);
	// Clase para representar el administrador
    	
        // Constructor
        
        protected LoginAdmin(String nombreUsuario, String contraseña) {
			super(nombreUsuario, contraseña);
			
		}
		// Método para verificar la contraseña del administrador
        boolean verificarContraseña(String contraseña) {
            return this.contraseña.equals(contraseña);
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
}