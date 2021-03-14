/**
 * 
 */
package com.ejercicio1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ejercicio1.dto.Fabricante;
import com.ejercicio1.service.FabricanteServiceImpl;

/**
 * @author Miguel A. Sastre
 *
 */

@RestController
@RequestMapping("/api")
public class FabricanteController {

	@Autowired
	FabricanteServiceImpl fabricanteServiceImpl;
	
	@GetMapping("/fabricantes")
	public List<Fabricante> listarFabricantes(){
		return fabricanteServiceImpl.listarFabricantes();
	}
	
	@PostMapping("/fabricantes")
	public Fabricante añadirFabricante(@RequestBody Fabricante fabricante) {
		return fabricanteServiceImpl.añadirFabricante(fabricante);
	}
	
	@GetMapping("/fabricantes/{id}")
	public Fabricante getFabricanteXId(@PathVariable(name = "id") Long id) {
		return fabricanteServiceImpl.getFabricanteXId(id);
	}
	
	@PutMapping("/fabricantes/{id}")
	public Fabricante actualizarFabricante(@PathVariable(name = "id") Long id, @RequestBody Fabricante fabricante) {
		Fabricante ptFabricante = new Fabricante();
		
		ptFabricante = fabricanteServiceImpl.getFabricanteXId(id);
		
		ptFabricante.setNombre(fabricante.getNombre());
		
		return fabricanteServiceImpl.actualizarFabricante(ptFabricante);
	}
	
	@DeleteMapping("/fabricantes/{id}")
	public void eliminarFabricante(@PathVariable(name = "id") Long id) {
		fabricanteServiceImpl.eliminarFabricante(id);
	}
}
