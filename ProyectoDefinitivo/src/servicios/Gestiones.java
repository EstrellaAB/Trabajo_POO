package servicios;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


import entidades.Comidas;
import entidades.Entrantes;
import entidades.Postres;
import entidades.Primeros;
import entidades.Segundos;
import repositorios.ListaComidas;

public class Gestiones {
	
	private Scanner sc;
	private ListaComidas gestion;
	
	
	
	
	public void menu() {
		sc = new Scanner(System.in); 
		gestion = new ListaComidas();
		gestion.comidasIniciadas();
	
		
		boolean ok = true;
		
		while(ok) {
			
			
			System.out.println("Añadir comida/Listado/Salir: ");
			String eleccion = sc.nextLine();
			
			switch(eleccion) {
				
			case "añadir":
				masComida();
				break; 
			case "listado":
				verComidas();
				break;
			case "salir":
				System.out.println("\nSaliendo...");
				ok=false;
				break;
			}
		}
	}
	
	public void masComida() {
		
		gestion.masComida();
		
	}
	

	public void verComidas() {
		
		sc = new Scanner(System.in); 
		
		System.out.println("Que tipo de plato quieres ver");
		String eleccion = sc.nextLine();
		Comidas comida = null;
		
		switch(eleccion){
		
		case "entrante":
			System.out.println("¿Tiene gluten?");
			String cond = sc.nextLine();
				switch(cond) {
					case "si": 
						comida = new Entrantes();
						break;
					case "no":
						comida = new Entrantes();
						break;
				}
			recorroArray(comida);
			break;
		case "primero":
			comida = new Primeros();
			recorroArray(comida);
			break;
		case "segundo":
			comida = new Segundos();
			recorroArray(comida);			
			break;
		case "postre":
			comida = new Postres();
			recorroArray(comida);						
			break;
		}
	}
	
	public void recorroArray(Comidas comida) {
		
		ArrayList<Comidas> listaComidas = gestion.getListaComidas();
		
		for(int i =0;i<listaComidas.size();i++) {
			Comidas c = listaComidas.get(i);
			
			if (c.getClass() == comida.getClass()) {
				System.out.println("Nombre: "+c.getNombre());
			}
			
		}
	}
	
	
	public void generadorAleatorio() {
		
		Random r = new Random();
		
		
	}
	
	
	
	
}
