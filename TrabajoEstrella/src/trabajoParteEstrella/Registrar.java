package trabajoParteEstrella;


public class Registrar extends Usuario{
	
	
	Registrar(String  nombreUsuario, String contraseña) {
		super( nombreUsuario,contraseña);
	}
	
	public void estrella() {
		
		boolean malcon = true;
	    boolean malfec = true;
	    
	    System.out.println("Ingrese su nombre.");
	    String nombreCompleto = sc.next();

	    System.out.println("Ingrese su nombre de usuario:");
	    String nombreUsuario = sc.next();

	    while (malcon) {
	        System.out.println("Ingrese su contraseña:");
	        contraseña = sc.next();

	        System.out.println("Confirme su contraseña:");
	        String confirmarContrasena = sc.next();

	        if (contraseña.equals(confirmarContrasena)) {
	            if (!contraseña.matches("^(?=.*[A-Z])(?=.*[!@#$&*])(?=.*[0-9]).{8,}$")) {
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
	   
	}
}
