/**
 * 
 */
package com.ejercicio1.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ejercicio1.dto.Articulo;
import com.ejercicio1.service.ArticuloServiceImpl;

/**
 * @author Miguel A. Sastre
 *
 */
@RestController
@RequestMapping("/api")
public class ArticuloController {

	@Autowired
	ArticuloServiceImpl articuloServiceImpl;
	
	@GetMapping("/articulos")
	public List<Articulo> listarArticulos() {
		return articuloServiceImpl.listarArticulos();
	}

	@PostMapping("/articulos")
	public Articulo añadirArticulos(@RequestBody Articulo articulo) {
		return articuloServiceImpl.añadirArticulos(articulo);
	}

	@PutMapping("/articulos/{codigo}")
	public Articulo actualizarArticulos(@PathVariable(name="codigo")Long id,Articulo articulo) {
		Articulo ptArticulo = new Articulo();
		
		ptArticulo = articuloServiceImpl.getArticulosXId(id);
		
		ptArticulo.setNombre(articulo.getNombre());
		ptArticulo.setPrecio(articulo.getPrecio());
		ptArticulo.setFabricante(articulo.getFabricante());
		
		return articuloServiceImpl.actualizarArticulos(ptArticulo);
	}

	@DeleteMapping("/articulos/{codigo}")
	public void eliminarArticulos(@PathVariable(name="codigo") Long id) {
		articuloServiceImpl.eliminarArticulos(id);
	}

	@GetMapping("/articulos/{codigo}")
	public Articulo getArticulosXId(@PathVariable(name="codigo") Long id) {
		return articuloServiceImpl.getArticulosXId(id);
	}

	
}
