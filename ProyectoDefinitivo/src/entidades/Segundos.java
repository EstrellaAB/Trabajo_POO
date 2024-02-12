package entidades;

public class Segundos extends Comidas{

public Segundos() {
		
	}

	public Segundos(boolean gluten) {
		this.gluten=gluten;
	}
	
	public Segundos(String nombre, String valoracion, boolean gluten) {
		super(nombre, valoracion, gluten);
		
	}
}
