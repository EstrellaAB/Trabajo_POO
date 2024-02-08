package animal;

public class Perro extends Animal { //extends hace que herede de animal. 
	
	//ATRIBUTO
	protected String raza;

	//CONSTRUCTORES
	public Perro() {
		
	} 
	
	public Perro (int patas, double peso, Pais pais, String raza) {
		super(patas, peso, pais);
		this.raza = raza; 
	}
	
	
	//METODOS
	public void emitirSonido() {
		System.out.println("el perro ladra");
	}
	
	public void comer() {
		System.out.println("El perro come de un plato");
	}
	
	public void desplazarse() {
		System.out.println("El perro anda moviendo la cola");
	
	}
	
}
