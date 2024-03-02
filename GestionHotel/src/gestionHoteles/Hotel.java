package gestionHoteles;


import java.util.ArrayList;

class Hotel extends GestionHotel implements AbrirCerrarHotel {
    private int numeroHabitaciones;
    private String[] tiposHabitaciones;
    private double[] preciosHabitaciones;
    private boolean estado;
    private ArrayList<Habitacion> habitaciones;

    Hotel(String nombre, int numeroHabitaciones, String[] tiposHabitaciones, double[] preciosHabitaciones) {
        this.nombre = nombre;
        this.numeroHabitaciones = numeroHabitaciones;
        this.tiposHabitaciones = tiposHabitaciones;
        this.preciosHabitaciones = preciosHabitaciones;
        this.estado = true; // Por defecto, el hotel está abierto

        // Inicializar la lista de habitaciones
        this.habitaciones = new ArrayList<>();
    }

    // Métodos de la interfaz AbrirCerrarHotel
    @Override
    public void abrirHotel() {
        estado = true; // Abrir el hotel
        System.out.println("El hotel ha sido abierto.");
    }

    @Override
    public void cerrarHotel() {
        estado = false; // Cerrar el hotel
        System.out.println("El hotel ha sido cerrado.");
    }

    // Métodos para gestionar las habitaciones
    public void addHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }

    public Habitacion getHabitacion(int index) {
        return habitaciones.get(index);
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
}

