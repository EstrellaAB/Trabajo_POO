package GestionHoteles2;
import java.util.ArrayList;


//Clase Hotel que hereda de GestionHotel e implementa la interfaz Reserva
class Hotel extends GestionHotel implements Reserva {
 private int numeroHabitaciones;
 private String[] tiposHabitaciones;
 private double[] preciosHabitaciones;
 private boolean estado;
 ArrayList<Habitacion> habitaciones;

 Hotel() {}
 
 Hotel(String nombre, ArrayList<Habitacion> habitaciones) {
     this.nombre = nombre;
     this.habitaciones = habitaciones;
 }

 Hotel(String nombre, int numeroHabitaciones, String[] tiposHabitaciones, double[] preciosHabitaciones) {
     this.nombre = nombre;
     this.numeroHabitaciones = numeroHabitaciones;
     this.tiposHabitaciones = tiposHabitaciones;
     this.preciosHabitaciones = preciosHabitaciones;
     this.estado = true; // Por defecto, el hotel está abierto
     this.habitaciones = new ArrayList<Habitacion>(); // Inicializar habitaciones
     for (int i = 0; i < numeroHabitaciones; i++) {
         this.habitaciones.add(new Habitacion(tiposHabitaciones[i], preciosHabitaciones[i], true));
         }
 }

 @Override
 public void reservar() {
     for (Habitacion habitacion : habitaciones) {
         habitacion.reservar();
     }
 }

 @Override
 public void cancelarReserva() {
     for (Habitacion habitacion : habitaciones) {
         habitacion.cancelarReserva();
     }
 }

 @Override
 public void mostrarInformacion() {
     System.out.println("Nombre del hotel: " + nombre);
     System.out.println("Número de habitaciones: " + numeroHabitaciones);
     System.out.println("Tipos de habitaciones disponibles:");
     for (String tipo : tiposHabitaciones) {
         System.out.println("- " + tipo);
     }
     System.out.println("Precios de habitaciones:");
     for (double precio : preciosHabitaciones) {
         System.out.println("- " + precio);
     }
     System.out.println("Estado: " + (estado ? "Abierto" : "Cerrado"));
 }

 public void cerrarHotel() {
     estado = false;
 }

 public void reabrirHotel() {
     estado = true;
 }

 public ArrayList<Double> getPreciosHabitaciones() {
     ArrayList<Double> precios = new ArrayList<Double>();
     for (double precio : preciosHabitaciones) {
         precios.add(precio);
     }
     return precios;
 }
}