package GestionHotel;

public class Main {
	   public static void main(String[] args) {
	        // Crear objetos Hotel
	        Hotel[] hoteles = new Hotel[5];
	        for (int i = 0; i < hoteles.length; i++) {
	            hoteles[i] = new Hotel(nombresHoteles[i], habitacionesPorHotel[i], preciosPorHabitacion[i], hotelAbierto[i]);
	        }

	        // Crear el gestor de hoteles
	        GestorDeHoteles gestor = new GestorDeHoteles(hoteles);
	        gestor.crearHoteles();
	        System.out.println();

	        // Llamar a métodos del gestor para interactuar con los hoteles
	        System.out.println("Habitaciones disponibles:");
	        gestor.mostrarHabitacionesDisponibles();
	        System.out.println();
	        System.out.println("Habitaciones ocupadas:");
	        gestor.mostrarHabitacionesOcupadas();
	        
	        // Llamar a métodos del gestor para interactuar con los hoteles
	        System.out.println("Información de los hoteles:");
	        gestor.mostrarInformacionHoteles();
	        System.out.println();
	        System.out.println("Información de las habitaciones:");
	        gestor.mostrarInformacionHabitaciones();
	        System.out.println();
	        System.out.println("Información de los clientes:");
	        gestor.mostrarInformacionClientes();
	        System.out.println();
	        System.out.println("Información de los usuarios:");
	        gestor.mostrarInformacionUsuarios();
	        System.out.println();
	        System.out.println("Información de las reservas:");
	        gestor.mostrarInformacionReservas();
	        
	        // Otros métodos...
	        
	        
	    }
}
