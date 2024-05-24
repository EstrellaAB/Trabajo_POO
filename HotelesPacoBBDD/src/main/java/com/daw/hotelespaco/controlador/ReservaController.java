package com.daw.hotelespaco.controlador;

import java.sql.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.daw.hotelespaco.entidades.PagoImpl;
import com.daw.hotelespaco.entidades.ReservaImpl;
import com.daw.hotelespaco.servicios.PagoServicio;
import com.daw.hotelespaco.servicios.ReservaServicio;

public class ReservaController {
	
	@GetMapping("/reserva")
	public ModelAndView nuevaReserva() {
		
		ModelAndView maw = new ModelAndView("reserva");
		
		/*ReservaServicio reservaServicio = new ReservaServicio(); 

		maw.addObject("reserva", reservaServicio.servicioReserva());*/
		
		return maw; 
	}
	
	//TODO: ARREGLAR PAGO. 
	@PostMapping
    public void crearReserva(@RequestParam("titular") String titular, @RequestParam("numero_tarjeta") String numero_tarjeta, 
    		@RequestParam("mes_caducidad") int mes_caducidad, @RequestParam("anio_caducidad") int anio_caducidad,
    		 @RequestParam("id_Hotel") int id_Hotel, @RequestParam("id_habitacion") int id_habitacion,
    		 @RequestParam("fecha_entrada") Date fecha_entrada, @RequestParam("fecha_salida") Date fecha_salida) {
		
        // Crear el registro de pago
		PagoServicio pagoServicio = new PagoServicio();
		PagoImpl pago = pagoServicio.crearObjetoPago(titular, id_habitacion, fecha_entrada, fecha_salida);
		int idPago = pagoServicio.insertarPago(pago);
		
		
		// Reserva
		ReservaServicio reservaServicio = new ReservaServicio();
		ReservaImpl reserva = reservaServicio.crearObjetoReserva(fecha_entrada, fecha_salida, idPago, id_Hotel, id_habitacion);
		
// 		 Llamar al metodo insert de reserva
		reservaServicio.insertarReserva(reserva);
		
        
    }

}
