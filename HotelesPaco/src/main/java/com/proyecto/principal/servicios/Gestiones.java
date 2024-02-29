package com.proyecto.principal.servicios;

import java.util.ArrayList;
import java.util.Scanner;

import com.proyecto.principal.entidades.Comidas;
import com.proyecto.principal.entidades.Entrantes;
import com.proyecto.principal.entidades.Postres;
import com.proyecto.principal.entidades.Primeros;
import com.proyecto.principal.entidades.Segundos;
import com.proyecto.principal.repositorios.Colores;
import com.proyecto.principal.repositorios.ListaComidas;

public class Gestiones {
	
	private Scanner sc;
	private ListaComidas gestion;
	
	
	
	
	public void menu() {
		sc = new Scanner(System.in); 
		gestion = new ListaComidas();
		gestion.comidasIniciadas();
	
		
		boolean ok = true;
		
		while(ok) {
			
			
			System.out.println("Añadir comida/Listado/Ver dias/Salir: ");
			String eleccion = sc.nextLine();
			
			switch(eleccion) {
				
			case "añadir":
				masComida();
				break; 
			case "listado":
				verComidas();
				break;
			case "ver dias":
				aleatorio();
				break;
			case "salir":
				System.out.println("\nSaliendo...");
				ok=false;
				break;
			default:
				System.err.println("Introduzca una opcion valida");
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
			System.out.println("¿Tiene gluten?: ");
			String cond = sc.nextLine();
				switch(cond) {
					case "si": 
						comida = new Entrantes(true);
						break;
					case "no":
						comida = new Entrantes(false);
						break;
				}
			recorroArray(comida);
			break;
		case "primero":
			System.out.println("¿Tiene gluten?");
			String cond2 = sc.nextLine();
				switch(cond2) {
					case "si": 
						comida = new Primeros(true);
						break;
					case "no":
						comida = new Primeros(false);
						break;
				}
			recorroArray(comida);
			break;
		case "segundo":
			System.out.println("¿Tiene gluten?");
			String cond3 = sc.nextLine();
				switch(cond3) {
					case "si": 
						comida = new Segundos(true);
						break;
					case "no":
						comida = new Segundos(false);
						break;
				}
			recorroArray(comida);			
			break;
		case "postre":
			System.out.println("¿Tiene gluten?");
			String cond4 = sc.nextLine();
				switch(cond4) {
					case "si": 
						comida = new Postres(true);
						break;
					case "no":
						comida = new Postres(false);
						break;
				}
			recorroArray(comida);						
			break;
		default:
			System.err.println("Introduzca una opcion valida");
			break;
		}
	}
	
	public void recorroArray(Comidas comida) {
		
		ArrayList<Comidas> listaComidas = gestion.getListaComidas();
		
		for(int i =0;i<listaComidas.size();i++) {
			Comidas c = listaComidas.get(i);
			
			if (c.getClass() == comida.getClass() && c.isGluten() == comida.isGluten()) {  //mirar bien esto que es importante
				System.out.println("Nombre: "+c.getNombre()+"  "+Colores.yellow+c.getValoracion()+Colores.reset);
			}
			
		}
	}
	
	
		
	public void aleatorio() {
		gestion.dias();
	}
	
	
	
}
