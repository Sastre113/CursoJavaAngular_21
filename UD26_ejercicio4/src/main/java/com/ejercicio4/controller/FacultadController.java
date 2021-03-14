/**
 * 
 */
package com.ejercicio4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ejercicio4.dto.Facultad;
import com.ejercicio4.service.FacultadServiceImpl;

/**
 * @author Miguel A. Sastre
 *
 */

@RestController
@RequestMapping("/api")
public class FacultadController {

	@Autowired
	FacultadServiceImpl facultadServiceImpl;
	
	@GetMapping("/facultades")
	public List<Facultad> listarFacultads(){
		return facultadServiceImpl.listarFacultads();
	}
	
	@PostMapping("/facultades")
	public Facultad añadirFacultad(@RequestBody Facultad facultad) {
		return facultadServiceImpl.añadirFacultad(facultad);
	}
	
	@GetMapping("/facultades/{id}")
	public Facultad getFacultadXId(@PathVariable(name = "id") Long id) {
		return facultadServiceImpl.getFacultadXId(id);
	}
	
	@PutMapping("/facultades/{id}")
	public Facultad actualizarFacultad(@PathVariable(name = "id") Long id, @RequestBody Facultad facultad) {
		Facultad ptFacultad = new Facultad();
		
		ptFacultad = facultadServiceImpl.getFacultadXId(id);
		
		ptFacultad.setNombre(facultad.getNombre());
		
		return facultadServiceImpl.actualizarFacultad(ptFacultad);
	}
	
	@DeleteMapping("/facultades/{id}")
	public void eliminarFacultad(@PathVariable(name = "id") Long id) {
		facultadServiceImpl.eliminarFacultad(id);
	}
}
