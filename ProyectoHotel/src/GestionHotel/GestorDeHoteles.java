public class GestorDeHoteles {
    private Hotel[] hoteles;

    public GestorDeHoteles(Hotel[] hoteles) {
        this.hoteles = hoteles;
    }

    private void configurarHoteles() {
        hoteles = new Hotel[5]; // Tamaño 5 para los 5 hoteles

        // Inicialización de cada hotel con los datos proporcionados
        for (int i = 0; i < 5; i++) {
            String nombre = nombresHoteles[i];
            int[] habitaciones = habitacionesPorHotel[i];
            double[][] precios = preciosPorHabitacion[i];
            boolean abierto = hotelAbierto[i];

            hoteles[i] = new Hotel(nombre, habitaciones, precios, abierto);
        }

   


    // Métodos adicionales para la gestión de hoteles, como seleccionar hotel, reservar habitación, etc.
    public Hotel seleccionarHotel(int posicion) {
        return hoteles[posicion];
    }
    
    public void reservarHabitacion(int posicion, int numeroHabitacion) {
        hoteles[posicion].reservarHabitacion(numeroHabitacion);
    }
    
    public void cerrarHabitacion(int posicion, int numeroHabitacion) {
        hoteles[posicion].cerrarHabitacion(numeroHabitacion);
    }
    
    public void abrirHabitacion(int posicion, int numeroHabitacion) {
        hoteles[posicion].abrirHabitacion(numeroHabitacion);
    }
    
    public void cambiarEstadoHabitacion(int posicion, int numeroHabitacion, boolean abierto) {
        hoteles[posicion].cambiarEstadoHabitacion(numeroHabitacion, abierto);
    }
    
    public void cambiarEstadoHotel(int posicion, boolean abierto) {
        hoteles[posicion].cambiarEstadoHotel(abierto);
    }
    
    public void cambiarNombreHotel(int posicion, String nombre) {
        hoteles[posicion].cambiarNombreHotel(nombre);
    }
    
    public void agregarHabitacion(int posicion, int numeroHabitacion) {
        hoteles[posicion].agregarHabitacion(numeroHabitacion);
    }
    
    public void quitarHabitacion(int posicion, int numeroHabitacion) {
        hoteles[posicion].quitarHabitacion(numeroHabitacion);
    }
    
    public void cambiarNombreHabitacion(int posicion, int numeroHabitacion, String nombre) {
        hoteles[posicion].cambiarNombreHabitacion(numeroHabitacion, nombre);
    }
    
    public void cambiarDescripcionHabitacion(int posicion, int numeroHabitacion, String descripcion) {
        hoteles[posicion].cambiarDescripcionHabitacion(numeroHabitacion, descripcion);
    }
    
    public void cambiarPrecioHabitacion(int posicion, int numeroHabitacion, double precio) {
        hoteles[posicion].cambiarPrecioHabitacion(numeroHabitacion, precio);
    }
    
    public void cambiarNumeroHabitaciones(int posicion, int numeroHabitaciones) {
        hoteles[posicion].cambiarNumeroHabitaciones(numeroHabitaciones);
    }
    
    public void cambiarNumeroPersonas(int posicion, int numeroPersonas) {
        hoteles[posicion].cambiarNumeroPersonas(numeroPersonas);
    }
    
    public void agregarPersona(int posicion, int numeroPersona) {
        hoteles[posicion].agregarPersona(numeroPersona);
    }
    
    public void quitarPersona(int posicion, int numeroPersona) {
        hoteles[posicion].quitarPersona(numeroPersona);
    }
    
    public void cambiarNombrePersona(int posicion, int numeroPersona, String nombre) {
        hoteles[posicion].cambiarNombrePersona(numeroPersona, nombre);
    }
    
    public void cambiarDescripcionPersona(int posicion, int numeroPersona, String descripcion) {
        hoteles[posicion].cambiarDescripcionPersona(numeroPersona, descripcion);
    }
    
    public void cambiarPrecioPersona(int posicion, int numeroPersona, double precio) {
        hoteles[posicion].cambiarPrecioPersona(numeroPersona, precio);
    }   
	
}
