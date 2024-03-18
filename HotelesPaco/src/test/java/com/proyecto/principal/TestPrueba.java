package com.proyecto.principal;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.proyecto.principal.entidades.UsuarioNormal;
import com.proyecto.principal.entidades.Usuarios;
import com.proyecto.principal.servicios.Login;
import com.proyecto.principal.servicios.Menu;

class TestPrueba {
	Menu menu = new Menu ();
	@Test
	public void testMenuInicial() {
		int entrada = 1;
		int resultado = menu.menu(entrada); 
		assertEquals(entrada,resultado);
	}
	@Test
	public void testMenuInicial2() {
		int entrada = 4;
		int resultado = menu.menu(entrada); 
		assertEquals(entrada,resultado);
	}
	
	@Test
	public void testMenuInicial3() {
		String entrada = "W";
		String resultado = menu.menu(entrada); 
		assertEquals(entrada,resultado);
	}
	Login login = new Login();
	

	@Test
	public void testMenuLogin() {
		int entrada = 1;
		int resultado = login.registrar(entrada); 
		assertEquals(entrada,resultado);
	}
	@Test
	public void testMenuLogin2() {
		int entrada = 2;
		int resultado = login.registrar2(entrada); 
		assertEquals(entrada,resultado);
	}
	@Test
	public void testMenuInicial4() {
		String entrada = "N";
		String resultado = login.registrar3(entrada); 
		assertEquals(entrada,resultado);
	}
	ArrayList<Usuarios> usuariosRegistrados = new ArrayList<>();
    Usuarios usuario = new UsuarioNormal();
   
	@Test
	public void testLoginUsuarioContraseñaCorrecta() {
		usuario.setNombreUsuario("ana");
        usuario.setContraseña("Anagomez1!");
        usuariosRegistrados.add(usuario);
        
        login.loginUsuario("ana","Anagomez1!",usuariosRegistrados);
	}
	 @Test
	    public void testLoginUsuarioContraseñaIncorrecta() {
	        usuario.setNombreUsuario("ana");
	        usuario.setContraseña("algo");
	        usuariosRegistrados.add(usuario);

	        login.loginUsuario("ana", "algo", usuariosRegistrados);
	    }
	 @Test
	    public void testLoginUsuarioIncorrecto() {
	        usuario.setNombreUsuario("enrique");
	        usuario.setContraseña("Anagomez1!");
	        usuariosRegistrados.add(usuario);

	        login.loginUsuario("enrique", "Anagomez10!", usuariosRegistrados);
	    }
	 
	 @Test
		public void testLoginAdminContraseñaCorrecta() {
			usuario.setNombreUsuario("ana");
	        usuario.setContraseña("Guillamon10!");
	        usuariosRegistrados.add(usuario);
	        
	        login.loginAdmin("ana","Guillamon10!",usuariosRegistrados);
		}
	 @Test
	    public void testLoginAdminContraseñaIncorrecta() {
	        usuario.setNombreUsuario("ana");
	        usuario.setContraseña("nosequeponer");
	        usuariosRegistrados.add(usuario);

	        login.loginAdmin("ana", "nosequeponer", usuariosRegistrados);
	    }
	 @Test
	    public void testLoginAdminUsuarioIncorrecto() {
	        usuario.setNombreUsuario("enrique");
	        usuario.setContraseña("Guillamon10!");
	        usuariosRegistrados.add(usuario);

	        login.loginAdmin("enrique", "Guillamon10!", usuariosRegistrados);
	    }
	 @Test
		public void testMenuClasesEnrique() {
			String entrada = "gestor de menus";
			String resultado = login.selectorClasesEnrique(entrada); 
			assertEquals(entrada,resultado);
		}
	 @Test
		public void testMenuClasesEnriqueIncorrecto() {
			String entrada = "gestion de menus";
			String resultado = login.selectorClasesEnrique(entrada); 
			assertEquals(entrada,resultado);
		}
	 @Test
		public void testMenuClasesSara() {
			String entrada = "gestor de reservas";
			String resultado = login.selectorClasesSara(entrada); 
			assertEquals(entrada,resultado);
		}
	 
	 @Test
		public void testMenuClasesSaraIncorrecto() {
			String entrada = "gestor";
			String resultado = login.selectorClasesSara(entrada); 
			assertEquals(entrada,resultado);
		}
}
