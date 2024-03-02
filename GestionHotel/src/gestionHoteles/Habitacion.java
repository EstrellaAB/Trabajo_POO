package gestionHoteles;

class Habitacion extends GestionHotel implements AbrirCerrarHotel {
    String tipo;

    Habitacion(String tipo, double precio, boolean disponibilidad) {
        this.tipo = tipo;
        this.precio = precio;
        this.disponibilidad = disponibilidad;
    }

    @Override
    public void abrirHotel() {
        // No se realiza ninguna acción específica en la habitación al abrir el hotel
        System.out.println("La habitación está disponible.");
    }

    @Override
    public void cerrarHotel() {
        disponibilidad = false; // Al cerrar el hotel, la habitación se hace no disponible
        System.out.println("La habitación ya no está disponible.");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Tipo de habitación: " + tipo);
        System.out.println("Precio: " + precio);
        System.out.println("Disponibilidad: " + (disponibilidad ? "Disponible" : "No disponible"));
    }
}