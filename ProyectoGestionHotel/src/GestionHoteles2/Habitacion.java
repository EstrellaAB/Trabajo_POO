package GestionHoteles2;
//Clase Habitacion que hereda de GestionHotel e implementa la interfaz Reserva
class Habitacion extends GestionHotel implements Reserva {
 String tipo;

 Habitacion(String tipo, double precio, boolean disponibilidad) {
     this.tipo = tipo;
     this.precio = precio;
     this.disponibilidad = disponibilidad;
 }

 @Override
 public void reservar() {
     if (disponibilidad) {
         disponibilidad = false; // Marcar la habitación como no disponible
         System.out.println("La habitación ha sido reservada.");
     } else {
         System.out.println("La habitación no está disponible para reservar.");
     }
 }

 @Override
 public void mostrarInformacion() {
     System.out.println("Tipo de habitación: " + tipo);
     System.out.println("Precio: " + precio);
     System.out.println("Disponibilidad: " + (disponibilidad ? "Disponible" : "No disponible"));
 }

 @Override
 public void cancelarReserva() {
     if (!disponibilidad) {
         disponibilidad = true; // Marcar la habitación como disponible
         System.out.println("La reserva de la habitación ha sido cancelada.");
     } else {
         System.out.println("No hay reserva que cancelar para esta habitación.");
     }
 }
 
}
