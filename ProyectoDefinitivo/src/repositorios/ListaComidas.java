package repositorios;

import java.util.ArrayList;
import java.util.Scanner;

import entidades.Entrantes;
import entidades.Primeros;
import entidades.Segundos;
import entidades.Postres;
import entidades.Comidas;

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
		
	Comidas e1 = new Entrantes();
		e1.setNombre("Ensalas de aguacate y mozzarella");
		e1.setGluten(true);
		e1.setValoracion("☆☆☆☆☆");
		listaComidas.add(e1);
	 
	Comidas e2 = new Entrantes();
		e2.setNombre("Turrón salado de queso y pistacho");
		e2.setGluten(true);
		e2.setValoracion("☆☆☆☆☆");
		listaComidas.add(e2);
		
	Comidas e3 = new Entrantes();
		e3.setNombre("Piruletas crujientes de parmesano");
		e3.setGluten(true);
		e3.setValoracion("☆☆☆☆☆");
		listaComidas.add(e3);
		
	Comidas e4 = new Entrantes();
		e4.setNombre("Hummus con remolacha");
		e4.setGluten(true);
		e4.setValoracion("☆☆☆☆☆");
		listaComidas.add(e4);
		
	Comidas e5 = new Entrantes();
		e5.setNombre("Verduras rellenas de arroz");
		e5.setGluten(true);
		e5.setValoracion("☆☆☆☆☆");
		listaComidas.add(e5);

		
		//p=primeros
		
		
	Comidas p1 = new Primeros();
		p1.setNombre("Puré de calabacín");
		p1.setGluten(true);
		p1.setValoracion("☆☆☆☆☆");
		listaComidas.add(p1);
	 
	Comidas p2 = new Primeros();
		p2.setNombre("Sopa de pollo");
		p2.setGluten(true);
		p2.setValoracion("☆☆☆☆☆");
		listaComidas.add(p2);
		
	Comidas p3 = new Primeros();
		p3.setNombre("Judías verdes con patatas");
		p3.setGluten(true);
		p3.setValoracion("☆☆☆☆☆");
		listaComidas.add(p3);
		
	Comidas p4 = new Primeros();
		p4.setNombre("Almejas a la marinera");
		p4.setGluten(true);
		p4.setValoracion("☆☆☆☆☆");
		listaComidas.add(p4);
		
	Comidas p5 = new Primeros();
		p5.setNombre("Crema de cebolla");
		p5.setGluten(true);
		p5.setValoracion("☆☆☆☆☆");	
		listaComidas.add(p5);
		
		
		//s=segundos
		
		
	Comidas s1 = new Segundos();
		s1.setNombre("Costillas de cordero asado");
		s1.setGluten(true);
		s1.setValoracion("☆☆☆☆☆");
		listaComidas.add(s1);
	 
	Comidas s2 = new Segundos();
		s2.setNombre("Merluza en salsa verde");
		s2.setGluten(true);
		s2.setValoracion("☆☆☆☆☆");
		listaComidas.add(s2);
		
	Comidas s3 = new Segundos();
		s3.setNombre("Rape con salsa americana");
		s3.setGluten(true);
		s3.setValoracion("☆☆☆☆☆");
		listaComidas.add(s3);
		
	Comidas s4 = new Segundos();
		s4.setNombre("Estofado de ternera a la cerveza");
		s4.setGluten(true);
		s4.setValoracion("☆☆☆☆☆");
		listaComidas.add(s4);
		
	Comidas s5 = new Segundos();
		s5.setNombre("Pollo a la miel");
		s5.setGluten(true);
		s5.setValoracion("☆☆☆☆☆");
		listaComidas.add(s5);
		
		
		//pp=postres
		
		
	Comidas pp1 = new Postres();
		pp1.setNombre("Mousse de frutas del bosque");
		pp1.setGluten(true);
		pp1.setValoracion("☆☆☆☆☆");
		listaComidas.add(pp1);
	 
	Comidas pp2 = new Postres();
		pp2.setNombre("Souflé de mango y coco");
		pp2.setGluten(true);
		pp2.setValoracion("☆☆☆☆☆");
		listaComidas.add(pp2);
		
	Comidas pp3 = new Postres();
		pp3.setNombre("Pastel de zanahoria de la casa");
		pp3.setGluten(true);
		pp3.setValoracion("☆☆☆☆☆");
		listaComidas.add(pp3);
		
	Comidas pp4 = new Postres();
		pp4.setNombre("Blondie con sorbete de vainilla");
		pp4.setGluten(true);
		pp4.setValoracion("☆☆☆☆☆");
		listaComidas.add(pp4);
		
	Comidas pp5 = new Postres();
		pp5.setNombre("Helado de té e infusiones");
		pp5.setGluten(true);
		pp5.setValoracion("☆☆☆☆☆");
		listaComidas.add(pp5);
		
		
		//LOS SIGUIENTES PLATOS SON SIN GLUTEN	
			
		
		//se=sin gluten entrantes
		
	Comidas se1 = new Entrantes();
		se1.setNombre("Tartaletas de queso de cabra e higos");
		se1.setGluten(false);
		se1.setValoracion("☆☆☆☆☆");
		listaComidas.add(se1);	

		
	Comidas se2 = new Entrantes();
		se2.setNombre("Rollo de sobrasada y miel");
		se2.setGluten(false);
		se2.setValoracion("☆☆☆☆☆");
		listaComidas.add(se2);	
	
		
	Comidas se3 = new Entrantes();
		se3.setNombre("Paté con zanahoria");
		se3.setGluten(false);
		se3.setValoracion("☆☆☆☆☆");
		listaComidas.add(se3);	
	
		
	Comidas se4 = new Entrantes();
		se4.setNombre("Cake de queso y bacon");
		se4.setGluten(false);
		se4.setValoracion("☆☆☆☆☆");
		listaComidas.add(se4);	
	
		
	Comidas se5 = new Entrantes();
		se5.setNombre("Rollo de espinacas, queso y jamón");
		se5.setGluten(false);
		se5.setValoracion("☆☆☆☆☆");
		listaComidas.add(se5);	
		
		
		//sp=sin gluten primero
		
		
	Comidas sp1 = new Primeros();
		sp1.setNombre("Revuelto de espinacas y langostinos");
		sp1.setGluten(false);
		sp1.setValoracion("☆☆☆☆☆");
		listaComidas.add(sp1);	

		
	Comidas sp2 = new Primeros();
		sp2.setNombre("Sopa de arroz con picadillo");
		sp2.setGluten(false);
		sp2.setValoracion("☆☆☆☆☆");
		listaComidas.add(sp2);	
	
		
	Comidas sp3 = new Primeros();
		sp3.setNombre("Ensalada de patatas asadas");
		sp3.setGluten(false);
		sp3.setValoracion("☆☆☆☆☆");
		listaComidas.add(sp3);	
	
		
	Comidas sp4 = new Primeros();
		sp4.setNombre("Garbanzos a la riojana");
		sp4.setGluten(false);
		sp4.setValoracion("☆☆☆☆☆");
		listaComidas.add(sp4);	
	
		
	Comidas sp5 = new Primeros();
		sp5.setNombre("Patatas con sepia");
		sp5.setGluten(false);
		sp5.setValoracion("☆☆☆☆☆");
		listaComidas.add(sp5);	
		
	
		//ss=sin gluten segundo
		
		
	Comidas ss1 = new Segundos();
		ss1.setNombre("Arroz con pollo y verduras");
		ss1.setGluten(false);
		ss1.setValoracion("☆☆☆☆☆");
		listaComidas.add(ss1);	

		
	Comidas ss2 = new Segundos();
		ss2.setNombre("Marmitako");
		ss2.setGluten(false);
		ss2.setValoracion("☆☆☆☆☆");
		listaComidas.add(ss2);	
	
		
	Comidas ss3 = new Segundos();
		ss3.setNombre("Paella mixta con marisco");
		ss3.setGluten(false);
		ss3.setValoracion("☆☆☆☆☆");
		listaComidas.add(ss3);	
	
		
	Comidas ss4 = new Segundos();
		ss4.setNombre("Ñoquis a la boloñesa");
		ss4.setGluten(false);
		ss4.setValoracion("☆☆☆☆☆");
		listaComidas.add(ss4);	
	
		
	Comidas ss5 = new Segundos();
		ss5.setNombre("Sardinas asadas");
		ss5.setGluten(false);
		ss5.setValoracion("☆☆☆☆☆");
		listaComidas.add(ss5);
		
		
		//spp=sin gluten postre
		

		Comidas spp1 = new Postres();
			spp1.setNombre("Tarta de santiago");
			spp1.setGluten(false);
			spp1.setValoracion("☆☆☆☆☆");
			listaComidas.add(spp1);

			
		Comidas spp2 = new Postres();
			spp2.setNombre("Cremoso de chocolate con merengue de naranja");
			spp2.setGluten(false);
			spp2.setValoracion("☆☆☆☆☆");
			listaComidas.add(spp2);
		
			
		Comidas spp3 = new Postres();
			spp3.setNombre("Flan de mascarpone");
			spp3.setGluten(false);
			spp3.setValoracion("☆☆☆☆☆");
			listaComidas.add(spp3);
		
			
		Comidas spp4 = new Postres();
			spp4.setNombre("Semifrío de plátano y macadamia");
			spp4.setGluten(false);
			spp4.setValoracion("☆☆☆☆☆");
			listaComidas.add(spp4);
		
		
		Comidas spp5 = new Postres();
			spp5.setNombre("Arroz con leche");
			spp5.setGluten(false);
			spp5.setValoracion("☆☆☆☆☆");
			listaComidas.add(spp5);
		
	
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
	}
	
}

public void datos(Comidas comida) {
	
	sc = new Scanner(System.in); 
	
	System.out.println("Nombre de la comida: ");
	comida.setNombre(sc.nextLine());
	System.out.println("Valoracion: ");
	comida.setValoracion(sc.nextLine());
	System.out.println("¿Tiene gluten?: ");
	String eleccion = sc.nextLine();
	
	switch(eleccion) {
		
	case "si":
		comida.setGluten(true);
		break;
	case "no":
		comida.setGluten(false);
		break;
	}
	
	listaComidas.add(comida);
}
	
}
