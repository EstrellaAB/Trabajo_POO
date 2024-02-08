package animal;

public class Main {
	public static void main(String[] args) {
		
		Pais paisPerro = new Pais ("España", 48000000, "Europa"); 
		Pais paisLeon = new Pais ("Angola", 34500000, "Africa"); 
		Pais paisElefante = new Pais ("Botsbuana", 258800000, "África"); 
		
		System.out.println("PERRO: ");
		Perro p = new Perro(4, 40, paisPerro, "Labrador");
		p.emitirSonido();
		p.comer();
		p.desplazarse();
		
		System.out.println("LEON: ");
		Leon l = new Leon(4, 180.0, paisLeon); 
		l.emitirSonido();
		l.comer();
		l.desplazarse();
		
		System.out.println("ELEFANTE: ");
		Elefante el = new Elefante(4, 6000, paisElefante); 
		el.emitirSonido();
		el.comer();
		el.desplazarse();
		
	}

}
