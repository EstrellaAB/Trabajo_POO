//package com.proyecto.principal;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertFalse;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//import java.util.ArrayList;
//
//import org.junit.jupiter.api.Test;
//
//import com.proyecto.principal.entidades.Comidas;
//import com.proyecto.principal.entidades.Entrantes;
//import com.proyecto.principal.entidades.HabitacionImpl;
//import com.proyecto.principal.entidades.UsuarioNormal;
//import com.proyecto.principal.entidades.Usuarios;
//import com.proyecto.principal.repositorios.HotelRepository;
//import com.proyecto.principal.servicios.Gestiones;
//import com.proyecto.principal.servicios.HotelServicio;
//import com.proyecto.principal.servicios.Login;
//import com.proyecto.principal.servicios.Menu;
//import com.proyecto.principal.servicios.PagoServicio;
//import com.proyecto.principal.servicios.ReservaServicio;
//import com.proyecto.principal.servicios.Utilidades;
//
//class TestPrueba {
//	
//	Menu menu = new Menu();
//	Login login = new Login(); 
//	ArrayList<Usuarios> usuariosRegistrados = new ArrayList<>();
//	Usuarios usuario = new UsuarioNormal();
//	Utilidades util = new Utilidades(); 
//	HotelServicio hs = new HotelServicio(null); 
//	ReservaServicio rs = new ReservaServicio();
//	PagoServicio ps = new PagoServicio();
//	ArrayList<Comidas> listaComidas;
//	Comidas comida = new Entrantes();
//	
//	
//	@Test
//	public void testMenuInicial() {
//		int entrada = 1;
//		int resultado = menu.menu(entrada); 
//		assertEquals(entrada,resultado);
//	}
//	
//	@Test
//	public void testMenuInicial2() {
//		int entrada = 4;
//		int resultado = menu.menu(entrada); 
//		assertEquals(entrada,resultado);
//	}
//	
//	@Test
//	public void testMenuInicial3() {
//		String entrada = "W";
//		String resultado = menu.menu(entrada); 
//		assertEquals(entrada,resultado);
//	}
//	
//	@Test
//	public void testMenuLogin() {
//		int entrada = 1;
//		int resultado = login.registrar(entrada); 
//		assertEquals(entrada,resultado);
//	}
//	
//	@Test
//	public void testMenuLogin2() {
//		int entrada = 2;
//		int resultado = login.registrar2(entrada); 
//		assertEquals(entrada,resultado);
//	}
//	
//	@Test
//	public void testMenuInicial4() {
//		String entrada = "N";
//		String resultado = login.registrar3(entrada); 
//		assertEquals(entrada,resultado);
//	}
//	
//	@Test
//	public void testLoginUsuarioContraseñaCorrecta() {
//		usuario.setNombreUsuario("ana");
//		usuario.setContraseña("Anagomez1!");
//		usuariosRegistrados.add(usuario);
//		
//		login.loginUsuario("ana","Anagomez1!",usuariosRegistrados);
//	}
//	
//	@Test
//	public void testLoginUsuarioContraseñaIncorrecta() {
//	    usuario.setNombreUsuario("ana");
//		usuario.setContraseña("algo");
//		usuariosRegistrados.add(usuario);
//		
//		login.loginUsuario("ana", "algo", usuariosRegistrados);
//	}
//	
//	 @Test
//    public void testValidarEdadMenorDeEdad() {
//        int añoNacimiento = 2005;
//        int añoActual = 2024; 
//        int edad = añoActual - añoNacimiento;
//
//        if (edad < 18) {
//            assertFalse(edad >= 18);
//        } else {
//            assertTrue(edad >= 18);
//        }
//    }
//	
//    @Test
//    public void testValidarEdadMayorDeEdad() {
//        int añoNacimiento = 1990; 
//        int añoActual = 2024;
//        int edad = añoActual - añoNacimiento;
//
//        if (edad < 18) {
//            assertFalse(edad >= 18);
//        } else {
//            assertTrue(edad >= 18); 
//        }
//    }
//	
//	 @Test
//    public void testLoginUsuarioIncorrecto() {
//        usuario.setNombreUsuario("enrique");
//	    usuario.setContraseña("Anagomez1!");
//	    usuariosRegistrados.add(usuario);
//	
//	    login.loginUsuario("enrique", "Anagomez10!", usuariosRegistrados);
//    }
//	 
//	 @Test
//	public void testLoginAdminContraseñaCorrecta() {
//		usuario.setNombreUsuario("ana");
//	    usuario.setContraseña("Guillamon10!");
//	    usuariosRegistrados.add(usuario);
//	    
//	    login.loginAdmin("ana","Guillamon10!",usuariosRegistrados);
//	}
//	 
//	 @Test
//    public void testLoginAdminContraseñaIncorrecta() {
//        usuario.setNombreUsuario("ana");
//	    usuario.setContraseña("nosequeponer");
//	    usuariosRegistrados.add(usuario);
//	
//	    login.loginAdmin("ana", "nosequeponer", usuariosRegistrados);
//    }
//	 
//	 @Test
//    public void testLoginAdminUsuarioIncorrecto() {
//        usuario.setNombreUsuario("enrique");
//	    usuario.setContraseña("Guillamon10!");
//	    usuariosRegistrados.add(usuario);
//	
//	    login.loginAdmin("enrique", "Guillamon10!", usuariosRegistrados);
//    }
//	 
//	 @Test
//	public void testMenuClasesEnrique() {
//		String entrada = "gestor de menus";
//		String resultado = login.selectorClasesEnrique(entrada); 
//		assertEquals(entrada,resultado);
//	}
//	 
//	 @Test
//	public void testMenuClasesEnriqueIncorrecto() {
//		String entrada = "gestion de menus";
//		String resultado = login.selectorClasesEnrique(entrada); 
//		assertEquals(entrada,resultado);
//	}
//	 
//	 @Test
//	public void testMenuClasesSara() {
//		String entrada = "gestor de reservas";
//		String resultado = login.selectorClasesSara(entrada); 
//		assertEquals(entrada,resultado);
//	}
//	 
//	 @Test
//	public void testMenuClasesSaraIncorrecto() {
//		String entrada = "gestor";
//		String resultado = login.selectorClasesSara(entrada); 
//		assertEquals(entrada,resultado);
//	}
//	 
//	 @Test
//    public void testSetListaPreciosHabitaciones() {
//        int precioIndividual = 100;
//        int precioDoble = 200;
//        int precioTriple = 300;
//        int precioCuadruple = 400;
//
//        ArrayList<Integer> esperado = new ArrayList<>();
//        esperado.add(precioIndividual);
//        esperado.add(precioDoble);
//        esperado.add(precioTriple);
//        esperado.add(precioCuadruple);
//
//        HotelRepository hotelRepositorio = new HotelRepository();
//        ArrayList<Integer> result = hotelRepositorio.setListaPreciosHabitaciones(precioIndividual, precioDoble, precioTriple, precioCuadruple);
//
//        assertEquals(esperado, result);
//    } 
// 
//		 
//	 @Test
//    public void testCalcularPrecio() {
//        int numeroNochesSeleccionado = 5;
//        HabitacionImpl habitacionSeleccionada = new HabitacionImpl(100); 
//
//        int esperado = 500; 
//
//        int resultado = rs.calcularPrecio(numeroNochesSeleccionado, habitacionSeleccionada);
//
//        assertEquals(esperado, resultado);
//    }
// 
//	
//	 @Test
//    public void testValidarNumeroPersonasHabitacionValido() {
//        ArrayList<HabitacionImpl> listaHabitaciones = new ArrayList<>();
//        
//        assertTrue(hs.validarNumeroPersonasHabitacion(3, listaHabitaciones));
//    }
//	
//    @Test
//    public void testValidarNumeroPersonasHabitacionInvalido() {
//        ArrayList<HabitacionImpl> listaHabitaciones = new ArrayList<>();
//        
//        assertFalse(hs.validarNumeroPersonasHabitacion(0, listaHabitaciones));
//        assertFalse(hs.validarNumeroPersonasHabitacion(5, listaHabitaciones));
//    }
//	
//	@Test
//	public void testEscribirNumero() {
//	    int entrada = 5;
//	    int resultado = util.escribirNumero(entrada);
//	
//	    assertEquals(entrada, resultado);
//	}
//	
//	public void testValidarEsribirNumero() {
//		String entrada = "hola"; 
//		int resultado = util.escribirNumero(entrada);
//		
//		assertEquals(entrada, resultado);
//	}
//	
//	 @Test
//	 public void testSeleccionarMesReserva() {
//	   int entrada = 11; 
//	   int resultado = rs.seleccionarMesReserva(entrada);
//	   
//	   assertEquals(entrada, resultado);
//	 }
//	 
//	  	  
//	 @Test
//	 public void testValidarMesReservaMesInvalido() {
//	    int mesInvalido = 13;
//	    boolean resultadoEsperado = false;
//	    boolean resultadoActual = rs.validarMesReserva(mesInvalido); 
//	    
//	    assertEquals(resultadoEsperado, resultadoActual);
//    }
//	 
//	 @Test 
//	 public void testSeleccionarDiaReserva() {
//		 int entrada = 3; 
//		 int resultado = rs.seleccionarDiaReserva(entrada); 
//		 
//		 assertEquals(entrada, resultado);  
//	 }
//	
//	@Test 
//	public void testDiaReservaInvalido() {
//		int entrada = 32; 
//		int resultado = rs.validarDiasReserva(entrada); 
//		 assertEquals(entrada, resultado);
//	}
//	 
//	 @Test
//	 public void testSeleccionarNumeroNoches() {
//		 int entrada = 4; 
//		 int resultado = rs.seleccionarNumeroNoches(entrada);
//		 
//		 assertEquals(entrada, resultado);
//	 }
//	 
//	 @Test
//	 public void testValidarNumeroNoches() {
//		 int entrada = 1; 
//		 int resultado = rs.seleccionarNumeroNoches(entrada);
//		 
//		 assertEquals(entrada, resultado);
//	 }
//	 
//	 @Test 
//	 public void testConfirmarReserva() {
//		 String entrada = "s"; 
//		 String resultado = rs.confirmacionReserva(entrada); 
//		 
//		 assertEquals(entrada, resultado);
//	 }
//	 
//	 @Test 
//	 public void testConfirmarReservaInvalido() {
//		 String entrada = "j"; 
//		 String resultado = rs.confirmacionReserva(entrada);
//		 
//		 assertEquals(entrada, resultado);		 
//	 }
//	 
//	 @Test
//     public void testSeleccionarOpcionPago() {
//		 int entrada = 1; 
//	     int resultado = ps.seleccionarOpcionPago(entrada);
//	      
//	     assertEquals(entrada, resultado);
//	 }
//	  
//	  @Test
//	  public void testSeleccionarOpcionPagoInvalido() {
//		 int entrada = 3; 
//	     int resultado = ps.seleccionarOpcionPago(entrada);
//	      
//	     assertEquals(entrada, resultado);
//	  }
//	  
//	  @Test
//	  public void testNumeroTarjeta() {
//		 String entrada = "1234567890123456"; 
//	     String resultado = ps.numeroTarjeta(entrada);
//	      
//	     assertEquals(entrada, resultado);
//	  }
//	  
//	  @Test
//      public void testNumeroTarjetaInvalido() {
//		 String entrada = "1234567890"; 
//	     String resultado = ps.numeroTarjeta(entrada);
//	      
//	     assertEquals(entrada, resultado);
//	  }
//	  
//	  @Test
//	  public void testAnioCaducidad() {
//		  int entrada = 25; 
//		  int resultado = ps.fechaAnioCaducidad(entrada);
//		  
//		  assertEquals(entrada, resultado);
//	  }
//	  
//	 @Test
//	  public void testValidarAnioCaducidad() {
//		 int entrada = 22; 
//		 int resultado = ps.fechaAnioCaducidad(entrada);
//		  
//		 assertEquals(entrada, resultado);
//	  }
//	 
//	 @Test
//	  public void testCVV() {
//	      int entrada = 534; 
//	      int resultado = ps.numeroCVV(entrada); 
//	        
//	      assertEquals(entrada,resultado);
//	  }
//	
//	 @Test
//	  public void testValidarCVV() {
//	      int entrada = 13; 
//	      int resultado = ps.numeroCVV(entrada); 
//	        
//	      assertEquals(entrada,resultado);
//	  }
//	  
//	@Test
//	public void testRecorroArray() {
//		Gestiones gestiones = new Gestiones(); 
//        
//        ArrayList<Comidas> listaComidas = new ArrayList<>();
//	   
//        gestiones.recorroArray(listaComidas);
//	        
//    }
//	    
//    @Test
//    public void testMenu() {
//        Gestiones gestiones = new Gestiones(); 
//        
//        gestiones.menu("añadir");
//	    gestiones.menu("listado");
//	    gestiones.menu("ver dias");
//	    gestiones.menu("salir");
//	     
//		}
//		
//	@Test
//	public void testleerValoracion() {
//		String valoracion = "*****";
//		 
//		assertEquals(valoracion, Comidas.leerValoracion());
//		 
//	}
//		
//	@Test
//	public void testleerValoracionMal() {
//		String valoracion = "*****";
//		
//		assertEquals(valoracion, Comidas.leerValoracion());
//		
//	}
//		
//	@Test
//	public void testLeersluten() {
//		boolean gluten = true;
//		 
//		assertEquals(gluten, comida.leerGluten());
//		
//	}
//		
//	@Test
//	public void testLeerslutenMal() {
//		boolean gluten = false;
//			
//		assertEquals(gluten, comida.leerGluten());
//			
//	}
//    
//}
