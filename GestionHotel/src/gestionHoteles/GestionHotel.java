package gestionHoteles;

//Clase abstracta GestionHotel

abstract class GestionHotel {
    String nombre;
    double precio;
    boolean disponibilidad;

    // Métodos abstractos
    abstract void mostrarInformacion();
}