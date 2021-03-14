/**
 * 
 */
package com.ejercicio3.service;

import java.util.List;

import com.ejercicio3.dto.Cajero;

/**
 * @author Miguel A. Sastre
 *
 */
public interface ICajeroService {
	
	public List<Cajero> listarCajeros();
	
	public Cajero añadirCajero(Cajero cajero);
	
	public Cajero actualizarCajero(Cajero cajero);
	
	public void eliminarCajero(Long id);
	
	public Cajero getCajeroXId(Long id);
	
}
