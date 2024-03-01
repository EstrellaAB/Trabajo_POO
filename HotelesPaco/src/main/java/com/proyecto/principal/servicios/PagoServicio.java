package com.proyecto.principal.servicios;

import java.util.Scanner;

import com.proyecto.principal.repositorios.Colores;

public class PagoServicio {
	Scanner sc = new Scanner(System.in); 
	
	
	public int seleccionarOpcionPago(Scanner sc) {
		System.out.println("¿Cómo quiere realizar el pago?");
		System.out.println("1. Pago directo");
		System.out.println("2. Pago en el hotel con tarjeta de garantía");
		
		Utilidades util = new Utilidades(); 
		int opcionPago = util.escribirNumero(); 
		
		while (!validarOpcionesPago(opcionPago)) {
			opcionPago = util.escribirNumero();
		}

		// en caso de que la opcion sea 1: pago directo
		if (opcionPago == 1) {
			System.out.println("Ha seleccionado Pago Directo");
//			DatosDePagoDirecto pdirecto = new DatosDePagoDirecto(); 
		// pero si elige la opcion 2: 
		}else if (opcionPago == 2) {
			System.out.println("Ha seleccionado pago en hotel con tarjeta de garantía");
//			DatosDePagoImpl dp = new DatosDePagoImpl(); 
		}
		return opcionPago; 
	}
	
	public boolean validarOpcionesPago(int opcionPago) {
		Boolean esValido = false;

		if (opcionPago == 1 || opcionPago == 2) {
			esValido = true;
		} else {
			System.err.println("Operación Incorrecta, inténtelo de nuevo");
		}

		return esValido;
	}

	
	
	public void datoDePagoDirecto () {
		//introducir titular tarjeta: 
		escribirTitularTarjeta(); 
		// introducir numero tarjeta y validar: 
		numeroTarjeta(); 
		// introducir mes de caducidad y validar: 
		fechaMesCaducidad(); 
		// introducir año de caducidad y validar: 
		fechaAnioCaducidad(); 
		//introducir cvv y validar: Clase datos pago directo. 
		numeroCVV(); 
		
	}
	
	public void datoDePagoGarantia () {
		//introducir titular tarjeta: 
		escribirTitularTarjeta();
		// introducir numero tarjeta y validar: 
		numeroTarjeta();
		// introducir mes de caducidad y validar: 
		fechaMesCaducidad(); 
		// introducir año de caducidad y validar: 
		fechaAnioCaducidad(); 
		
	}
	
	public String escribirTitularTarjeta () {
		System.out.println("Titular Tarjeta: ");
		String nombreTitular = ""; 
		nombreTitular = sc.nextLine(); 
		
		return nombreTitular; 
	}
	
	public String numeroTarjeta () {
		System.out.println("Número tarjeta (16 dígitos): ");

		String numTarjetaCredito = "";
		numTarjetaCredito = sc.nextLine();

		while (!validarNumeroTarjeta(numTarjetaCredito)) {
			numTarjetaCredito = sc.nextLine();
		}

		return numTarjetaCredito;
	}
	public boolean validarNumeroTarjeta (String numTarjetaCredito) {
		Boolean esValido = false;

		if (numTarjetaCredito.length() == 16) {
			esValido = true;
		} else {
			System.err.println("El número de la tarjeta introducido debe tener 16 dígitos. Vuelva a introducirlos");
		}

		return esValido;
	}
	
	public int fechaMesCaducidad() {
		System.out.println("Mes de caducidad:");
		Utilidades util = new Utilidades (); 
		int numeroMesCaducidad =  util.escribirNumero();

		while (!validarMesCaducidad(numeroMesCaducidad)) {
			numeroMesCaducidad = util.escribirNumero();
		}

		return numeroMesCaducidad;
	}
	public boolean validarMesCaducidad(int mesCaducidad) {
		Boolean esValido = false;

		if (mesCaducidad >= 1 && mesCaducidad <= 12) {
			esValido = true;
		} else {
			System.err.println("El mes introducido no es correcto, vuelve a intentarlo");
		}

		return esValido;
	}
	
	public int fechaAnioCaducidad() {
		System.out.println("Año de caducidad (YY): ");
		Utilidades util = new Utilidades ();
		int numeroAnioCaducidad = util.escribirNumero();

		while (!validarAnioCaducidad(numeroAnioCaducidad)) {
			numeroAnioCaducidad = util.escribirNumero();
		}
		return numeroAnioCaducidad;
	}

	public boolean validarAnioCaducidad(int anioCaducidad) {
		Boolean esValido = false;

		if (anioCaducidad > 23) {
			esValido = true;
		} else {
			System.err.println("El año introducido no es correcto, vuelve a intentarlo");
		}

		return esValido;
	}
	
	public String numeroCVV () {
		System.out.println("CVV: ");
		String numeroCvv = ""; 
		numeroCvv = sc.nextLine(); 
		
		while (!validarCVV(numeroCvv)) {
			numeroCvv = sc.nextLine();
		}
		return numeroCvv; 
	}
	
	public boolean validarCVV(String cvv) {
		Boolean esValido = false;

		if (cvv.length() == 3) {
			esValido = true;
		} else {
			System.err.println("CVV incorrecto, vuelve a intentarlo");
		}

		return esValido;
	}
	
	public void mensajeCierre() {
		System.out.println(Colores.green+"¡ENHORABUENA, SU RESERVA SE HA PROCESADO CORRECTAMENTE!"+Colores.reset);
	}
	
}
