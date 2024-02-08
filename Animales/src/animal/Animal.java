package animal;

public abstract class Animal implements Acciones{
	
	//ATRIBUTOS
	protected int patas; 
	protected double peso;
	protected Pais pais;
	
	//CONSTRUCTORES
	public Animal() {
		
	}

	public Animal(int patas, double peso, Pais pais) {
		super();
		this.patas = patas;
		this.peso = peso;
		this.pais = pais;
	}

	// GETTERS AND SETTERS 
	
	/**
	 * @return the patas
	 */
	public int getPatas() {
		return patas;
	}


	/**
	 * @param patas the patas to set
	 */
	public void setPatas(int patas) {
		this.patas = patas;
	}


	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}


	/**
	 * @param peso the peso to set
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}


	/**
	 * @return the pais
	 */
	public Pais getPais() {
		return pais;
	}


	/**
	 * @param pais the pais to set
	 */
	public void setPais(Pais pais) {
		this.pais = pais;
	} 
	
}
