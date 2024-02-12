package trabajoParteEstrella;

import java.util.ArrayList;
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


	// Método para verificar la contraseña
       boolean verificarContraseña(String contraseña) {
            return this.contraseña.equals(contraseña);
        }
       public void usuarios(Usuario usuarioRegistrado) {
   		ArrayList<Usuario> usuariosRegistrados = new ArrayList<>();
   		
           // Acceder a los usuarios almacenados en el ArrayList
           for (Usuario usuario : usuariosRegistrados) {
               System.out.println("Nombre: " + usuario.getNombreUsuario() );
           }
   	}
    
}