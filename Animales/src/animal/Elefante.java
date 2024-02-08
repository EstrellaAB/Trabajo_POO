package animal;

public class Elefante extends Animal {
	
	public Elefante() {
	}
	
	public Elefante(int patas, double peso, Pais pais) {
		super(patas, peso, pais);
	}
	
	//METODOS 
	
	public void emitirSonido() {
		System.out.println("El elefante emite un barrito");
	}
	
	public void comer() {
		System.out.println("el elefante come hierba");
	}
	
	public void desplazarse() {
		System.out.println("el elefante se desplaza por la selva");
	
	}

	
}
