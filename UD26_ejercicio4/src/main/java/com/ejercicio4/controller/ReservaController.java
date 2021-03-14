/**
 * 
 */
package com.ejercicio4.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ejercicio4.dto.Reserva;
import com.ejercicio4.service.ReservaServiceImpl;

/**
 * @author Miguel A. Sastre
 *
 */
@RestController
@RequestMapping("/api")
public class ReservaController {

	@Autowired
	ReservaServiceImpl reservaServiceImpl;
	
	@GetMapping("/reservas")
	public List<Reserva> listarReserva() {
		return reservaServiceImpl.listarReserva();
	}

	@PostMapping("/reservas")
	public Reserva añadirReserva(@RequestBody Reserva reserva) {
		return reservaServiceImpl.añadirReserva(reserva);
	}

	@PutMapping("/reservas/{id}")
	public Reserva actualizarReserva(@PathVariable(name="id")String id,Reserva reserva) {
		Reserva ptReserva = new Reserva();
		
		ptReserva = reservaServiceImpl.getReservaXId(id);
		
		ptReserva.setComienzo(reserva.getComienzo());
		ptReserva.setFin(reserva.getFin());
	
		return reservaServiceImpl.actualizarReserva(ptReserva);
	}

	@DeleteMapping("/reservas/{id}")
	public void eliminarReserva(@PathVariable(name="id") String id) {
		reservaServiceImpl.eliminarReserva(id);
	}

	@GetMapping("/reservas/{id}")
	public Reserva getReservaXId(@PathVariable(name="id") String id) {
		return reservaServiceImpl.getReservaXId(id);
	}

	
}
