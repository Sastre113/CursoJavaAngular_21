/**
 * 
 */
package com.ejercicio4.service;

import java.util.List;

import com.ejercicio4.dto.Pelicula;

/**
 * @author Miguel A. Sastre
 *
 */
public interface IPeliculaService {
	
	public List<Pelicula> listarPeliculas();
	
	public Pelicula añadirPelicula(Pelicula pelicula);
	
	public Pelicula actualizarPelicula(Pelicula pelicula);
	
	public void eliminarPelicula(Long id);
	
	public Pelicula getPeliculaXId(Long id);
	
}
