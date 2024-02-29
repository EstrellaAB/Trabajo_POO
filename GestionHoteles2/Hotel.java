package GestionHoteles2;


import java.util.ArrayList;

class Hotel extends GestionHotel implements Reserva {
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

    // Método de la interfaz Reserva
    @Override
    public void reservar() {
        // Lógica para reservar habitación en el hotel
        System.out.println("Hotel reservado");
        this.estado = false;
        System.out.println("Estado: " + (estado? "Abierto" : "Cerrado"));
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
    // Método de la interfaz Reserva
    @Override
    public void cancelarReserva() {
        // Lógica para cancelar reserva de habitación en el hotel
        System.out.println("Hotel cancelado");
        this.estado = false;
        System.out.println("Estado: " + (estado? "Abierto" : "Cerrado"));
    }

    // Otros métodos
    public void cerrarHotel() {
        estado = false;
    }

    public void reabrirHotel() {
        estado = true;
    }

    public ArrayList<Double> getPreciosHabitaciones() {
        ArrayList<Double> precios = new ArrayList<>();
        for (double precio : preciosHabitaciones) {
            precios.add(precio);
        }
        return precios;
    }

    // Métodos para gestionar las habitaciones
    public void addHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }

    public Habitacion getHabitacion(int index) {
        return habitaciones.get(index);
    }
}

