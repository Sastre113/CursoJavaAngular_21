/**
 * 
 */
package com.ejercicio1.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ejercicio1.dto.Suministra;
import com.ejercicio1.service.SuministraServiceImpl;

/**
 * @author Miguel A. Sastre
 *
 */
@RestController
@RequestMapping("/api")
public class SuministraController {

	@Autowired
	SuministraServiceImpl suministraServiceImpl;
	
	@GetMapping("/suministra")
	public List<Suministra> listarSuministra() {
		return suministraServiceImpl.listarSuministra();
	}

	@PostMapping("/suministra")
	public Suministra añadirSuministra(@RequestBody Suministra suministra) {
		return suministraServiceImpl.añadirSuministra(suministra);
	}

	@PutMapping("/suministra/{codigoPieza}")
	public Suministra actualizarSuministra(@PathVariable(name="codigoPieza")Integer id,Suministra suministra) {
		Suministra ptSuministra = new Suministra();
		
		ptSuministra = suministraServiceImpl.getSuministraXCodigoPieza(id);
		
		ptSuministra.setPieza(suministra.getPieza());
		ptSuministra.setProveedor(suministra.getProveedor());
		ptSuministra.setPrecio(suministra.getPrecio());
		
		return suministraServiceImpl.actualizarSuministra(ptSuministra);
	}

	@DeleteMapping("/suministra/{codigoPieza}")
	public void eliminarSuministra(@PathVariable(name="codigoPieza") Integer id) {
		suministraServiceImpl.eliminarSuministra(id);
	}

	@GetMapping("/suministra/{codigoPieza}")
	public Suministra getSuministraXId(@PathVariable(name="codigoPieza") Integer id) {
		return suministraServiceImpl.getSuministraXCodigoPieza(id);
	}

	
}
