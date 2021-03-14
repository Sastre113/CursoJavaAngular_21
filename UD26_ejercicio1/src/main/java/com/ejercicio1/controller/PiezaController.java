/**
 * 
 */
package com.ejercicio1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ejercicio1.dto.Pieza;
import com.ejercicio1.service.PiezaServiceImpl;

/**
 * @author Miguel A. Sastre
 *
 */

@RestController
@RequestMapping("/api")
public class PiezaController {

	@Autowired
	PiezaServiceImpl piezaServiceImpl;
	
	@GetMapping("/piezas")
	public List<Pieza> listarPiezas(){
		return piezaServiceImpl.listarPiezas();
	}
	
	@PostMapping("/piezas")
	public Pieza añadirPieza(@RequestBody Pieza pieza) {
		return piezaServiceImpl.añadirPieza(pieza);
	}
	
	@GetMapping("/piezas/{id}")
	public Pieza getPiezaXId(@PathVariable(name = "id") Long id) {
		return piezaServiceImpl.getPiezaXId(id);
	}
	
	@PutMapping("/piezas/{id}")
	public Pieza actualizarPieza(@PathVariable(name = "id") Long id, @RequestBody Pieza pieza) {
		Pieza ptPieza = new Pieza();
		
		ptPieza = piezaServiceImpl.getPiezaXId(id);
		
		ptPieza.setNombre(pieza.getNombre());
		
		return piezaServiceImpl.actualizarPieza(ptPieza);
	}
	
	@DeleteMapping("/piezas/{id}")
	public void eliminarPieza(@PathVariable(name = "id") Long id) {
		piezaServiceImpl.eliminarPieza(id);
	}
}
