package trabajoParteEstrella;

import java.util.Scanner;

public class Usuario {
	public static Scanner sc = new Scanner(System.in); // Instancia de Scanner para entrada estándar

    // Clase para representar usuarios
		
        protected String nombreCompleto;
        protected String nombreUsuario;
        protected String contraseña;
        protected int fechaCumple;

        // Constructor
        

		public Usuario(String nombreCompleto, String nombreUsuario, String contraseña, int fechaCumple) {
			this.nombreCompleto = nombreCompleto;
			this.nombreUsuario = nombreUsuario;
			this.contraseña = contraseña;
			this.fechaCumple = fechaCumple;
		}


		public Usuario() {
		}
		
		

		public Usuario(String nombreUsuario, String contraseña) {
			this.nombreUsuario = nombreUsuario;
			this.contraseña = contraseña;
		}


		// Método para verificar la contraseña
       boolean verificarContraseña(String contraseña) {
            return this.contraseña.equals(contraseña);
        }
    

		//cambiar mayus 

		public void usuarios(Usuario usuarioRegistrado) {
			
		}
		
}
