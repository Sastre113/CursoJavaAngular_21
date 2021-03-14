/**
 * 
 */
package com.ejercicio4.service;

import java.util.List;

import com.ejercicio4.dto.Equipo;
import com.ejercicio4.dto.Reserva;

/**
 * @author Miguel A. Sastre
 *
 */
public interface IReservaService {
	
	public List<Reserva> listarReserva();
	
	public Reserva añadirReserva(Reserva reserva);

	public Reserva actualizarReserva(Reserva reserva);
	
	public void eliminarReserva(String id);
	
	public Reserva getReservaXId(String id);
}
