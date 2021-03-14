/**
 * 
 */
package com.ejercicio4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ejercicio4.dto.Pelicula;
import com.ejercicio4.service.PeliculaServiceImpl;

/**
 * @author Miguel A. Sastre
 *
 */

@RestController
@RequestMapping("/api")
public class PeliculaController {

	@Autowired
	PeliculaServiceImpl peliculaServiceImpl;
	
	@GetMapping("/peliculas")
	public List<Pelicula> listarPeliculas(){
		return peliculaServiceImpl.listarPeliculas();
	}
	
	@PostMapping("/peliculas")
	public Pelicula añadirPelicula(@RequestBody Pelicula pelicula) {
		return peliculaServiceImpl.añadirPelicula(pelicula);
	}
	
	@GetMapping("/peliculas/{codigo}")
	public Pelicula getPeliculaXId(@PathVariable(name = "codigo") Long codigo) {
		return peliculaServiceImpl.getPeliculaXId(codigo);
	}
	
	@PutMapping("/peliculas/{codigo}")
	public Pelicula actualizarPelicula(@PathVariable(name = "codigo") Long codigo, @RequestBody Pelicula pelicula) {
		Pelicula ptPelicula = new Pelicula();
		
		ptPelicula = peliculaServiceImpl.getPeliculaXId(codigo);
		
		ptPelicula.setNombre(pelicula.getNombre());
		ptPelicula.setCalificacionEdad(pelicula.getCalificacionEdad());
		
		return peliculaServiceImpl.actualizarPelicula(ptPelicula);
	}
	
	@DeleteMapping("/peliculas/{codigo}")
	public void eliminarPelicula(@PathVariable(name = "codigo") Long codigo) {
		peliculaServiceImpl.eliminarPelicula(codigo);
	}
}
