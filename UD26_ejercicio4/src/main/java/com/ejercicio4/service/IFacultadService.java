/**
 * 
 */
package com.ejercicio4.service;

import java.util.List;

import com.ejercicio4.dto.Facultad;

/**
 * @author Miguel A. Sastre
 *
 */
public interface IFacultadService {
	
	public List<Facultad> listarFacultads();
	
	public Facultad añadirFacultad(Facultad facultad);
	
	public Facultad actualizarFacultad(Facultad facultad);
	
	public void eliminarFacultad(Long id);
	
	public Facultad getFacultadXId(Long id);
	
}
