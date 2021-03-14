/**
 * 
 */
package com.ejercicio4.service;

import java.util.List;

import com.ejercicio4.dto.Equipo;

/**
 * @author Miguel A. Sastre
 *
 */
public interface IEquipoService {
	
	public List<Equipo> listarEquipos();
	
	public Equipo añadirEquipo(Equipo equipo);
	
	public Equipo actualizarEquipo(Equipo equipo);
	
	public void eliminarEquipo(String id);
	
	public Equipo getEquipoXId(String id);
	
}
