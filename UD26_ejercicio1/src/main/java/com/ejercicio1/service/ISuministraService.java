/**
 * 
 */
package com.ejercicio1.service;

import java.util.List;

import com.ejercicio1.dto.Suministra;
import com.ejercicio1.dto.Pieza;

/**
 * @author Miguel A. Sastre
 *
 */
public interface ISuministraService {
	
	public List<Suministra> listarSuministra();
	
	public Suministra añadirSuministra(Suministra suministra);
	
	public Suministra actualizarSuministra(Suministra suministra);
	
	public void eliminarSuministra(Integer id);
	
	public Suministra getSuministraXCodigoPieza(Integer id);
}
