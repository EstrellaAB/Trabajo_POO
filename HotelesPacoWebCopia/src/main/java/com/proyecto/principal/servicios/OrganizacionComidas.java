package com.proyecto.principal.servicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class OrganizacionComidas {

    public void comidaKeeper() {

        // Tipo de comida |    subTipo   |  Lista de comidas 
        HashMap<String, HashMap<String, ArrayList<String>>> tipoComidas = new HashMap<>();
        HashMap<String, ArrayList<String>> subTipo = new HashMap<String, ArrayList<String>>();

        tipoComidas.put("Desayuno", new HashMap<String, ArrayList<String>>());
        tipoComidas.get("Desayuno").put("", new ArrayList<String>());
        tipoComidas.get("Desayuno").get("").add("estoEsDesayuno");

        //-------------------------------------------------------------------------------------------------------------------------------

        tipoComidas.put("Almuerzo", new HashMap<String, ArrayList<String>>());

        tipoComidas.get("Almuerzo").put("Entrante", new ArrayList<String>());
        tipoComidas.get("Almuerzo").get("Entrante").add("estoEsEntrante");

        tipoComidas.get("Almuerzo").put("Primero", new ArrayList<String>());
        tipoComidas.get("Almuerzo").get("Primero").add("estoEsPrimero");

        tipoComidas.get("Almuerzo").put("Segundo", new ArrayList<String>());
        tipoComidas.get("Almuerzo").get("Segundo").add("estoEsSegundo");

        tipoComidas.get("Almuerzo").put("Postre", new ArrayList<String>());
        tipoComidas.get("Almuerzo").get("Postre").add("estoEsPostre");

        //-------------------------------------------------------------------------------------------------------------------------------

        tipoComidas.put("Cena", new HashMap<String, ArrayList<String>>());

        tipoComidas.get("Cena").put("Primero", new ArrayList<String>());
        tipoComidas.get("Cena").get("Primero").add("estoEsPrimeroCena");

        tipoComidas.get("Cena").put("Postre", new ArrayList<String>());
        tipoComidas.get("Cena").get("Postre").add("estoEsPostreCena");

        
        
        // Bucle para recorrer y mostrar la estructura de datos
        for (Map.Entry<String, HashMap<String, ArrayList<String>>> tipoComidaEntry : tipoComidas.entrySet()) {
            String tipoComida = tipoComidaEntry.getKey();
            HashMap<String, ArrayList<String>> subTipos = tipoComidaEntry.getValue();

            System.out.println("Tipo de comida: " + tipoComida);

            for (Map.Entry<String, ArrayList<String>> subTipoEntry : subTipos.entrySet()) {
                String subTipoComida = subTipoEntry.getKey();
                ArrayList<String> comidas = subTipoEntry.getValue();
                	if(subTipoComida.equals("")) {
                		
                	}else {
                		
                		System.out.println("  Subtipo: " + subTipoComida);
                	}

                for (String comida : comidas) {
                    System.out.println("    Comida: " + comida);
                }
            }
        }
    }

    public static void main(String[] args) {
        OrganizacionComidas organizacionComidas = new OrganizacionComidas();
        organizacionComidas.comidaKeeper();
    }
}