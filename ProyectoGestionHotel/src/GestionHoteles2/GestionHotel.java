package GestionHoteles2;

//Clase abstracta GestionHotel
abstract class GestionHotel {
 String nombre;
 double precio;
 boolean disponibilidad;

 // Métodos abstractos
 abstract void reservar();
 abstract void cancelarReserva();
 abstract void mostrarInformacion();
}
