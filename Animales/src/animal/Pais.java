package animal;

public class Pais {

	//ATRIBUTOS
	protected String nombre; 
	protected long habitantes; 
	protected String continente;
	
	//CONSTRUCTORES
	
	public Pais() {
	}


	public Pais(String nombre, long habitantes, String continente) {
		super();
		this.nombre = nombre;
		this.habitantes = habitantes;
		this.continente = continente;
	}

	//GETTERS AND SETTERS 
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the numeroHabitantes
	 */
	public long getNumeroHabitantes() {
		return habitantes;
	}


	/**
	 * @param numeroHabitantes the numeroHabitantes to set
	 */
	public void setNumeroHabitantes(long numeroHabitantes) {
		this.habitantes = numeroHabitantes;
	}


	/**
	 * @return the continente
	 */
	public String getContinente() {
		return continente;
	}


	/**
	 * @param continente the continente to set
	 */
	public void setContinente(String continente) {
		this.continente = continente;
	} 
	
	
	
		

	

}
