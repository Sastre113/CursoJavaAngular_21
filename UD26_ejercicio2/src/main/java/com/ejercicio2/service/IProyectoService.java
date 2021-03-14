/**
 * 
 */
package com.ejercicio2.service;

import java.util.List;

import com.ejercicio2.dto.Proyecto;

/**
 * @author Miguel A. Sastre
 *
 */
public interface IProyectoService {
	
	public List<Proyecto> listarProyectos();
	
	public Proyecto añadirProyecto(Proyecto pieza);
	
	public Proyecto actualizarProyecto(Proyecto pieza);
	
	public void eliminarProyecto(String id);
	
	public Proyecto getProyectoXId(String id);
	
}
