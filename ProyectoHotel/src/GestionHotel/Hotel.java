public class Hotel {
    private String nombre;
    private int[] habitaciones;
    private double[][] precios;
    private boolean abierto;

    public Hotel(String nombre, int[] habitaciones, double[][] precios, boolean abierto) {
        this.nombre = nombre;
        this.habitaciones = habitaciones;
        this.precios = precios;
        this.abierto = abierto;
    }

    public String getNombre() {
        return nombre;
    }

    public int[] getHabitaciones() {
        return habitaciones;
    }

    public double[][] getPrecios() {
        return precios;
    }

    public boolean isAbierto() {
        return abierto;
    }

    // Métodos para reservar, cerrar, abrir habitaciones, etc.
    public void reservarHabitacion(int numeroHabitacion) {
        // Implementación de la reserva de habitación
        System.out.println(nombre + " reserva habitación " + numeroHabitacion);
        abierto = true;

    }

    public void cerrarHabitacion(int numeroHabitacion) {
        // Implementación de cerrar habitación
        System.out.println(nombre + " cerró habitación " + numeroHabitacion);
        abierto = false;
    }

    public void abrirHabitacion(int numeroHabitacion) {
        // Implementación de abrir habitación  
        System.out.println(nombre + " abrió habitación " + numeroHabitacion);
        abierto = true;

    }

    public void cambiarEstadoHabitacion(int numeroHabitacion, boolean abierto) {
        // Implementación para cambiar el estado de la habitación
        this.abierto = abierto;

    }

    public void cambiarEstadoHotel(boolean abierto) {
        // Implementación para cambiar el estado del hotel
        this.abierto = abierto;
        System.out.println(nombre + " cambió el estado del hotel");

    }

    public void agregarHabitacion(int numeroHabitacion) {
        // Implementación para agregar una nueva habitación
        System.out.println(nombre + " agregó habitación " + numeroHabitacion);
        habitaciones[numeroHabitaciones] = numeroHabitacion;
        numeroHabitaciones++;
    }

    public void quitarHabitacion(int numeroHabitacion) {
        // Implementación para quitar una habitación
        System.out.println(nombre + " quitó habitación " + numeroHabitacion);
        for (int i = 0; i < numeroHabitaciones; i++) {
            if (habitaciones[i] == numeroHabitacion) {
                for (int j = i; j < numeroHabitaciones - 1; j++) {
                    habitaciones[j] = habitaciones[j + 1];
                }
                numeroHabitaciones--;
            }
        }
    }

    public void cambiarPrecioHabitacion(int numeroHabitacion, double precio) {
        // Implementación para cambiar el precio de una habitación
        System.out.println(nombre + " cambió el precio de la habitación " + numeroHabitacion);
        precios[numeroHabitacion][0] = precio;
        precios[numeroHabitacion][1] = precio;
        precios[numeroHabitacion][2] = precio;
        precios[numeroHabitacion][3] = precio;
        precios[numeroHabitacion][4] = precio;
    }

    public void cambiarNumeroHabitaciones(int numeroHabitaciones) {
        // Implementación para cambiar el número de habitaciones
        System.out.println(nombre + " cambió el número de habitaciones");
        this.numeroHabitaciones = numeroHabitaciones;
        
    }
}

