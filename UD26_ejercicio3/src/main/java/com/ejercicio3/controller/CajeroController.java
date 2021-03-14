/**
 * 
 */
package com.ejercicio3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ejercicio3.dto.Cajero;
import com.ejercicio3.service.CajeroServiceImpl;

/**
 * @author Miguel A. Sastre
 *
 */

@RestController
@RequestMapping("/api")
public class CajeroController {

	@Autowired
	CajeroServiceImpl cajeroServiceImpl;
	
	@GetMapping("/cajeros")
	public List<Cajero> listarCajeros(){
		return cajeroServiceImpl.listarCajeros();
	}
	
	@PostMapping("/cajeros")
	public Cajero añadirCajero(@RequestBody Cajero cajero) {
		return cajeroServiceImpl.añadirCajero(cajero);
	}
	
	@GetMapping("/cajeros/{id}")
	public Cajero getCajeroXId(@PathVariable(name = "id") Long id) {
		return cajeroServiceImpl.getCajeroXId(id);
	}
	
	@PutMapping("/cajeros/{id}")
	public Cajero actualizarCajero(@PathVariable(name = "id") Long id, @RequestBody Cajero cajero) {
		Cajero ptCajero = new Cajero();
		
		ptCajero = cajeroServiceImpl.getCajeroXId(id);
		
		ptCajero.setNombre(cajero.getNombre());
		
		return cajeroServiceImpl.actualizarCajero(ptCajero);
	}
	
	@DeleteMapping("/cajeros/{id}")
	public void eliminarCajero(@PathVariable(name = "id") Long id) {
		cajeroServiceImpl.eliminarCajero(id);
	}
}
