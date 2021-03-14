/**
 * 
 */
package com.ejercicio2.service;

import java.util.List;

import com.ejercicio2.dto.Cientifico;

/**
 * @author Miguel A. Sastre
 *
 */
public interface ICientificoService {
	
	public List<Cientifico> listarCientificos();
	
	public Cientifico añadirCientifico(Cientifico cientifico);
	
	public Cientifico actualizarCientifico(Cientifico cientifico);
	
	public void eliminarCientifico(String id);
	
	public Cientifico getCientificoXId(String id);
	
}
