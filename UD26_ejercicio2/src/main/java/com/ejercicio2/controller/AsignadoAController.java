/**
 * 
 */
package com.ejercicio2.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ejercicio2.dto.AsignadoA;
import com.ejercicio2.service.AsignadoAServiceImpl;

/**
 * @author Miguel A. Sastre
 *
 */
@RestController
@RequestMapping("/api")
public class AsignadoAController {

	@Autowired
	AsignadoAServiceImpl asignadoAServiceImpl;
	
	@GetMapping("/asignadoa")
	public List<AsignadoA> listarAsignadoA() {
		return asignadoAServiceImpl.listarAsignadoA();
	}

	@PostMapping("/asignadoa")
	public AsignadoA añadirAsignadoA(AsignadoA asignadoA) {
		return asignadoAServiceImpl.añadirAsignadoA(asignadoA);
	}

	@PutMapping("/asignadoa/{id}")
	public AsignadoA actualizarAsignadoA(@PathVariable(name="id")Integer id,AsignadoA asignadoA) {
		AsignadoA ptAsignadoA = new AsignadoA();
		
		ptAsignadoA = asignadoAServiceImpl.getAsignadoAXId(id);
		
		ptAsignadoA.setCientifico(asignadoA.getCientifico());
		ptAsignadoA.setProyecto(asignadoA.getProyecto());
		
		return asignadoAServiceImpl.actualizarAsignadoA(ptAsignadoA);
	}

	@DeleteMapping("/asignadoa/{id}")
	public void eliminarAsignadoA(@PathVariable(name="id") Integer id) {
		asignadoAServiceImpl.eliminarAsignadoA(id);
	}

	@GetMapping("/asignadoa/{id}")
	public AsignadoA getAsignadoAXId(@PathVariable(name="id") Integer id) {
		return asignadoAServiceImpl.getAsignadoAXId(id);
	}

	
}
