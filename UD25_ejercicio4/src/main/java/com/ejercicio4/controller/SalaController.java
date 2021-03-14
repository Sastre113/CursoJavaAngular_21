/**
 * 
 */
package com.ejercicio4.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ejercicio4.dto.Sala;
import com.ejercicio4.service.SalaServiceImpl;

/**
 * @author Miguel A. Sastre
 *
 */
@RestController
@RequestMapping("/api")
public class SalaController {

	@Autowired
	SalaServiceImpl salaServiceImpl;
	
	@GetMapping("/salas")
	public List<Sala> listarSalas() {
		return salaServiceImpl.listarSalas();
	}

	@PostMapping("/salas")
	public Sala añadirSalas(@RequestBody Sala sala) {
		return salaServiceImpl.añadirSalas(sala);
	}

	@PutMapping("/salas/{codigo}")
	public Sala actualizarSalas(@PathVariable(name="codigo")Long codigo,Sala sala) {
		Sala ptSala = new Sala();
		
		ptSala = salaServiceImpl.getSalasXId(codigo);
		
		ptSala.setNombre(sala.getNombre());
		ptSala.setPelicula(sala.getPelicula());
		
		return salaServiceImpl.actualizarSalas(ptSala);
	}

	@DeleteMapping("/salas/{codigo}")
	public void eliminarSalas(@PathVariable(name="codigo") Long codigo) {
		salaServiceImpl.eliminarSalas(codigo);
	}

	@GetMapping("/salas/{codigo}")
	public Sala getSalasXId(@PathVariable(name="codigo") Long codigo) {
		return salaServiceImpl.getSalasXId(codigo);
	}

	
}
