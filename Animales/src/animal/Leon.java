package animal;

public class Leon extends Animal {

	//CONSTRUCTORES 
	public Leon() {
	}

	public Leon(int patas, double peso, Pais pais) {
		super(patas, peso, pais);
	}

	//METODOS
	public void emitirSonido() {
		System.out.println("El león gruñe");
	}
	
	public void comer() {
		System.out.println("El leon come buitres");
	}
	
	public void desplazarse() {
		System.out.println("El león corre por la selva buscando jirafas");
	
	}
}
