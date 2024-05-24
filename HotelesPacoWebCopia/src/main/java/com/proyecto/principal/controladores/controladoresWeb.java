package com.proyecto.principal.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class controladoresWeb {

	@GetMapping("index")
	public ModelAndView landPage() {
		
		ModelAndView maw = new ModelAndView("index");
		
		return maw;
		}
	
	@GetMapping("inicioSesion")
	public ModelAndView inicioSesion() {
		
		ModelAndView maw = new ModelAndView("inicioSesion");
		
		return maw;
	}
	
	@GetMapping("Login")
	public ModelAndView LogIn(String correo, String nombreUsuario, String contrasena) {
		
		ModelAndView maw = new ModelAndView("Login");
		
		return maw;
	}

	
	@GetMapping("reservaHote")
	public ModelAndView reservaHotel() {
		
		ModelAndView maw = new ModelAndView("reservaHote");
		
		return maw;
	}

	@GetMapping("informacion")
	public ModelAndView informacion() {
		
		ModelAndView maw = new ModelAndView("informacion");
		
		return maw;
	}
	
	@GetMapping("habitaciones")
	public ModelAndView habitaciones() {
		
		ModelAndView maw = new ModelAndView("habitaciones");
		
		return maw;
	}

	@GetMapping("habIndividual")
	public ModelAndView habIndividual() {
		
		ModelAndView maw = new ModelAndView("habIndividual");
		
		return maw;
	}
	@GetMapping("habDoble")
	public ModelAndView habDoble() {
		
		ModelAndView maw = new ModelAndView("habDoble");
		
		return maw;
	}
	@GetMapping("habSuite")
	public ModelAndView habSuite() {
		
		ModelAndView maw = new ModelAndView("habSuite");
		
		return maw;
	}
	
	
	
	
	
	
	
	
	
	}
	