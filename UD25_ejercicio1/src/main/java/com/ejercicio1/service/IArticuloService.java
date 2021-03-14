/**
 * 
 */
package com.ejercicio1.service;

import java.util.List;

import com.ejercicio1.dto.Articulo;
import com.ejercicio1.dto.Fabricante;

/**
 * @author Miguel A. Sastre
 *
 */
public interface IArticuloService {
	
	public List<Articulo> listarArticulos();
	
	public Articulo añadirArticulos(Articulo articulo);
	
	public Articulo actualizarArticulos(Articulo articulo);
	
	public void eliminarArticulos(Long id);
	
	public Articulo getArticulosXId(Long id);
}
