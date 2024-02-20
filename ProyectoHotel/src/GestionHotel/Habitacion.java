package GestionHotel;

public class Habitacion {
	 private String tipo;
	    private int cantidadDisponible;
	    private double precio;

	    public Habitacion(String tipo, int cantidadDisponible, double precio) {
	        this.tipo = tipo;
	        this.cantidadDisponible = cantidadDisponible;
	        this.precio = precio;
	    }

	    // Métodos getters y setters
	    public String getTipo() {
	        return tipo;
	    }
	    public void setTipo(String tipo) {
	        this.tipo = tipo;
	    }
	    public int getCantidadDisponible() {
	        return cantidadDisponible;
	    }
	    public void setCantidadDisponible(int cantidadDisponible) {
	        this.cantidadDisponible = cantidadDisponible;
	    }
	    public double getPrecio() {
	        return precio;
	    }
	    public void setPrecio(double precio) {
	        this.precio = precio;
	    }
}
