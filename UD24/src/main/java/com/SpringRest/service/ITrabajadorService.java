/**
 * 
 */
package com.SpringRest.service;

import java.util.List;

import com.SpringRest.dto.Trabajador;


/**
 * @author Miguel A. Sastre
 *
 */
public interface ITrabajadorService {
	
	/**
	 * CRUD estandar
	 */
	public List<Trabajador> listarTrabajadores();
	
	public Trabajador añadirTrabajador(Trabajador trabajador);
	
	public Trabajador getOneTrabajador(Integer id);
	
	public Trabajador actualizarTrabajador(Trabajador trabajador);
	
	public void eliminarTrabajador(Integer id);
	
	/**
	 * Métodos adicionales
	 */
	
	public List<Trabajador> listarTrabajadoresXTrabajo(String trabajo);
	
}
