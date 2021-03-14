/**
 * 
 */
package com.ejercicio4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ejercicio4.dto.Equipo;
import com.ejercicio4.service.EquipoServiceImpl;

/**
 * @author Miguel A. Sastre
 *
 */

@RestController
@RequestMapping("/api")
public class EquipoController {

	@Autowired
	EquipoServiceImpl equipoServiceImpl;
	
	@GetMapping("/equipo")
	public List<Equipo> listarEquipos(){
		return equipoServiceImpl.listarEquipos();
	}
	
	@PostMapping("/equipo")
	public Equipo añadirEquipo(@RequestBody Equipo equipo) {
		return equipoServiceImpl.añadirEquipo(equipo);
	}
	
	@GetMapping("/equipo/{id}")
	public Equipo getEquipoXId(@PathVariable(name = "id") String id) {
		return equipoServiceImpl.getEquipoXId(id);
	}
	
	@PutMapping("/equipo/{id}")
	public Equipo actualizarEquipo(@PathVariable(name = "id") String id, @RequestBody Equipo equipo) {
		Equipo ptEquipo = new Equipo();
		
		ptEquipo = equipoServiceImpl.getEquipoXId(id);
		
		ptEquipo.setNumSerie(equipo.getNumSerie());
		ptEquipo.setNombre(equipo.getNombre());
		ptEquipo.setFacultad(equipo.getFacultad());
		
		return equipoServiceImpl.actualizarEquipo(ptEquipo);
	}
	
	@DeleteMapping("/equipo/{id}")
	public void eliminarEquipo(@PathVariable(name = "id") String id) {
		equipoServiceImpl.eliminarEquipo(id);
	}
}
