package gestionHoteles;

public abstract class GestionHoteles {

    protected String nombre;
    protected double precio;
    protected boolean disponible;
    
    public GestionHoteles() {}

    public GestionHoteles(String nombre, double precio, boolean disponible){
    	super();
    	this.nombre = nombre;
        this.precio = precio;
        this.disponible = disponible;
    }


    
    public abstract void Reservar();

    public abstract void MostrarInformacion();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }



	public void CancelarReserva(int tipoHabitacion) {
		// TODO Auto-generated method stub
		
	}



	public void Reservar(int tipoHabitacion) {
		// TODO Auto-generated method stub
		
	}


}
