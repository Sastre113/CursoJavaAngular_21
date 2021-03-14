/**
 * 
 */
package com.ejercicio4.service;

import java.util.List;

import com.ejercicio4.dto.Sala;
import com.ejercicio4.dto.Pelicula;

/**
 * @author Miguel A. Sastre
 *
 */
public interface ISalaService {
	
	public List<Sala> listarSalas();
	
	public Sala añadirSalas(Sala sala);
	
	public Sala actualizarSalas(Sala sala);
	
	public void eliminarSalas(Long id);
	
	public Sala getSalasXId(Long id);
}
