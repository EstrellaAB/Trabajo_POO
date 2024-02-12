package entidades;

public class Primeros extends Comidas{

	
public Primeros() {
		
	}
	

	public Primeros(boolean gluten) {
		this.gluten = gluten;
	}

	public Primeros(String nombre, String valoracion, boolean gluten) {
		super(nombre, valoracion, gluten);
		
	}
}
