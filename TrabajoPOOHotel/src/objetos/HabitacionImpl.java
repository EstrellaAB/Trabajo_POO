package objetos;

public class HabitacionImpl implements Habitacion{
	private int numPersonas;
	private int precioHabitacion;
	
	
	
	public HabitacionImpl() {
		super();
	}

	public HabitacionImpl(int numPersonas, int precioHabitacion) {
		super();
		this.numPersonas = numPersonas;
		this.precioHabitacion = precioHabitacion;
	}

	/**
	 * @return the numPersonas
	 */
	public int getNumPersonas() {
		return numPersonas;
	}

	/**
	 * @param numPersonas the numPersonas to set
	 */
	public void setNumPersonas(int numPersonas) {
		this.numPersonas = numPersonas;
	}

	/**
	 * @return the precioHabitacion
	 */
	public int getPrecioHabitacion() {
		return precioHabitacion;
	}

	/**
	 * @param precioHabitacion the precioHabitacion to set
	 */
	public void setPrecioHabitacion(int precioHabitacion) {
		this.precioHabitacion = precioHabitacion;
	}

	@Override
	public String toString() {
		// TODO: POR EJEMPLO UN SWITCH QUE IMPRIMA "Habitación Individual con un precio de X"
		return "HabitacionImpl [numPersonas=" + numPersonas + ", precioHabitacion=" + precioHabitacion + "]";
	}
	
	
}
