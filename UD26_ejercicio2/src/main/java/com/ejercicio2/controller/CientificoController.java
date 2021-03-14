/**
 * 
 */
package com.ejercicio2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ejercicio2.dto.Cientifico;
import com.ejercicio2.service.CientificoServiceImpl;

/**
 * @author Miguel A. Sastre
 *
 */

@RestController
@RequestMapping("/api")
public class CientificoController {

	@Autowired
	CientificoServiceImpl cientificoServiceImpl;
	
	@GetMapping("/cientificos")
	public List<Cientifico> listarCientificos(){
		return cientificoServiceImpl.listarCientificos();
	}
	
	@PostMapping("/cientificos")
	public Cientifico añadirCientifico(@RequestBody Cientifico cientifico) {
		return cientificoServiceImpl.añadirCientifico(cientifico);
	}
	
	@GetMapping("/cientificos/{id}")
	public Cientifico getCientificoXId(@PathVariable(name = "id") String id) {
		return cientificoServiceImpl.getCientificoXId(id);
	}
	
	@PutMapping("/cientificos/{id}")
	public Cientifico actualizarCientifico(@PathVariable(name = "id") String id, @RequestBody Cientifico cientifico) {
		Cientifico ptCientifico = new Cientifico();
		
		ptCientifico = cientificoServiceImpl.getCientificoXId(id);
		
		ptCientifico.setDni(cientifico.getDni());
		ptCientifico.setNomApel(cientifico.getNomApel());
		
		return cientificoServiceImpl.actualizarCientifico(ptCientifico);
	}
	
	@DeleteMapping("/cientificos/{id}")
	public void eliminarCientifico(@PathVariable(name = "id") String id) {
		cientificoServiceImpl.eliminarCientifico(id);
	}
}
