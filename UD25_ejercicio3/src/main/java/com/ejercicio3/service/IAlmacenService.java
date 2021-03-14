/**
 * 
 */
package com.ejercicio3.service;

import java.util.List;

import com.ejercicio3.dto.Almacen;

/**
 * @author Miguel A. Sastre
 *
 */
public interface IAlmacenService {
	
	public List<Almacen> listarAlmacenes();
	
	public Almacen añadirAlmacen(Almacen almacen);
	
	public Almacen actualizarAlmacen(Almacen almacen);
	
	public void eliminarAlmacen(Long codigo);
	
	public Almacen getAlmacenXId(Long codigo);
	
}
