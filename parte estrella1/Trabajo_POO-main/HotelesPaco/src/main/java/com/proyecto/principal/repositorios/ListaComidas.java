package com.proyecto.principal.repositorios;
 
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
 
import com.proyecto.principal.entidades.Comidas;
import com.proyecto.principal.entidades.Entrantes;
import com.proyecto.principal.entidades.Postres;
import com.proyecto.principal.entidades.Primeros;
import com.proyecto.principal.entidades.Segundos;
 
public class ListaComidas {
	private Scanner sc;
	private ArrayList<Comidas> listaComidas;
	
	
		public ListaComidas() {
		
				}
 
		public ListaComidas(ArrayList<Comidas> listaComidas) {
 
		this.listaComidas = listaComidas;
	}
 
		public ArrayList<Comidas> getListaComidas() {
		return listaComidas;
	}
 
	public void setListaComidas(ArrayList<Comidas> listaComidas) {
		this.listaComidas = listaComidas;
	}
	
	
	
public void comidasIniciadas() {
	
		sc = new Scanner(System.in);
		listaComidas= new ArrayList<Comidas>();
		
		// ★ estrella de voto
		// ☆ estrella de vacio
		
		try(BufferedReader br = new BufferedReader( new FileReader("src/main/java/com/proyecto/principal/repositorios/NuevaListaComidas.csv"))){
			
			String KEEP;
			
			while((KEEP = br.readLine()) != null) {
				
				String[] PARAM = KEEP.split(";");
				
				String tipo =PARAM [0];
				String nombre =PARAM [1];
				String valoracion =PARAM [2];
				boolean gluten = Boolean.parseBoolean(PARAM[3]);
				
				
				
					if(tipo.equals("Entrantes")) {
						
						Comidas e1 = new Entrantes();
						e1.setTipo(tipo);
						e1.setNombre(nombre);
						e1.setValoracion(valoracion);
						e1.setGluten(gluten);
						listaComidas.add(e1);
						
					}else if(tipo.equals("Primeros")) {
						
						Comidas p1 = new Primeros();
						p1.setTipo(tipo);
						p1.setNombre(nombre);
						p1.setValoracion(valoracion);
						p1.setGluten(gluten);
						listaComidas.add(p1);
						
					}else if(tipo.equals("Segundos")) {
						
						Comidas s1 = new Segundos();
						s1.setTipo(tipo);
						s1.setNombre(nombre);
						s1.setValoracion(valoracion);
						s1.setGluten(gluten);
						listaComidas.add(s1);
						
					}else if(tipo.equals("Postres")) {
						
						
						Comidas pp1 = new Postres();
						pp1.setTipo(tipo);
						pp1.setNombre(nombre);
						pp1.setValoracion(valoracion);
						pp1.setGluten(gluten);
						listaComidas.add(pp1);
					}
			}
			
		}catch (IOException e) {
			System.err.println("Error al leer el archivo: " + e.getMessage());
			GestionLogs.errorLogs(
					"Error al leer el archivo: " + e.getMessage() + " No se han cargado los usuarios por defecto.");
		}
			
			
}
 
 
public void dias() {
	
	System.out.println("Ingrese un dia de la semana: ");
	String decision = sc.nextLine();
	switch(decision) {
	case"lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo":
		pruebaAleatorio();
		break;
	default:
		System.err.println("Introduzca un dia valido");
	}
}
public void pruebaAleatorio() {
	
	
	System.out.println("Con o sin: ");
	String decision  = sc.nextLine();
	boolean gluten = false;
	
	switch (decision) {
		case"con":
			gluten = true;
			break;
		case"sin":
			gluten = false;
			break;
		default:
			System.err.println("Introduzca una opcion valida");
			break;
	}
	
	
	metodos(gluten);
}
 
 
public void metodos(boolean gluten) {
	
	// Selecciona aleatoriamente un entrante
		Comidas entranteSeleccionado = seleccionAleatoria(listaComidas, new Entrantes(gluten));
		// Selecciona aleatoriamente un primero
		Comidas primeroSeleccionado = seleccionAleatoria(listaComidas, new Primeros(gluten));
		// Selecciona aleatoriamente un segundo
		Comidas segundoSeleccionado = seleccionAleatoria(listaComidas, new Segundos(gluten));
		// Selecciona aleatoriamente un postre
		Comidas postreSeleccionado = seleccionAleatoria(listaComidas, new Postres(gluten));
		
		System.out.println("Entrante: " + entranteSeleccionado.getNombre()
    		+"\nPrimero: "+primeroSeleccionado.getNombre()
    		+"\nSegundo: "+segundoSeleccionado.getNombre()
    		+"\nPostre: "+postreSeleccionado.getNombre());
        
}
	
 
 
// Método para seleccionar aleatoriamente un tipo de comida de la lista
private static Comidas seleccionAleatoria(ArrayList<Comidas> listaComidas, Comidas tipo) {
    Random random = new Random();
    Comidas comidaSeleccionada = null;
    ArrayList<Comidas> comidasFiltradas = new ArrayList<>();
    for (Comidas comida : listaComidas) {
        if (tipo.getClass() == comida.getClass()) {
            comidasFiltradas.add(comida);
        }
    }
    if (!comidasFiltradas.isEmpty()) {
        comidaSeleccionada = comidasFiltradas.get(random.nextInt(comidasFiltradas.size()));
    }
    return comidaSeleccionada;
}
public void masComida() {
	
	sc = new Scanner(System.in);
	
	System.out.println("Que tipo de plato quieres añadir");
	String eleccion = sc.nextLine();
	Comidas comida = null;
	
	switch(eleccion){
	
	case "entrante":
		comida = new Entrantes();
		datos(comida);
		break;
	case "primero":
		comida = new Primeros();
		datos(comida);
		break;
	case "segundo":
		comida = new Segundos();
		datos(comida);
		break;
	case "postre":
		comida = new Postres();
		datos(comida);
		break;
	default:
		System.err.println("Introduzca una opcion valida");
		break;
	}
	
}
 
		//★ estrella de voto
		// ☆ estrella de vacio
 
public void datos(Comidas comida) {
	
	sc = new Scanner(System.in);
	
	
	System.out.println("Nombre de la comida: ");
	comida.setNombre(sc.nextLine());
	System.out.println("Cuantas estrellas tiene: ");
	String a = sc.nextLine();
	switch(a) {
	case "1":
		comida.setValoracion("★☆☆☆☆");
		break;		
	case "2":
		comida.setValoracion("★★☆☆☆");
		break;		
	case "3":
		comida.setValoracion("★★★☆☆");
		break;		
	case "4":
		comida.setValoracion("★★★★☆");
		break;		
	case "5":
		comida.setValoracion("★★★★★");
		break;
	default:
		System.err.println("Introduzca una opcion valida");
		break;
	}
	
	
	System.out.println("¿Tiene gluten?: ");
	String eleccion = sc.nextLine();
	
	switch(eleccion) {
		
	case "si":
		comida.setGluten(true);
		break;
	case "no":
		comida.setGluten(false);
		break;
	default:
		System.err.println("Introduzca una opcion valida");
		break;
	}
	
	listaComidas.add(comida);
}
	
}