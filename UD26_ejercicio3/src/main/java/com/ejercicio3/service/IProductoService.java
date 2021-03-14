/**
 * 
 */
package com.ejercicio3.service;

import java.util.List;

import com.ejercicio3.dto.Producto;

/**
 * @author Miguel A. Sastre
 *
 */
public interface IProductoService {
	
	public List<Producto> listarProductoes();
	
	public Producto añadirProducto(Producto producto);
	
	public Producto actualizarProducto(Producto producto);
	
	public void eliminarProducto(Long id);
	
	public Producto getProductoXId(Long id);
	
}
