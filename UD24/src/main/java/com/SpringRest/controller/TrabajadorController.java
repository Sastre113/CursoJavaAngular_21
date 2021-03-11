/**
 * 
 */
package com.SpringRest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import com.SpringRest.dto.Trabajador;
import com.SpringRest.service.TrabajadorServiceImpl;

/**
 * @author Miguel A. Sastre
 *
 */

@RestController
@RequestMapping("/api")
public class TrabajadorController {
	
	@Autowired
	TrabajadorServiceImpl trabajadorServiceImpl;
	
	@GetMapping("/trabajadores")
	public List<Trabajador> listarTrabajadores(){
		return trabajadorServiceImpl.listarTrabajadores();
	}
	
	@PostMapping("/trabajadores")
	public Trabajador añadirTrabajador(@RequestBody Trabajador trabajador) {
		return trabajadorServiceImpl.añadirTrabajador(trabajador);
	}
	
	@GetMapping("/trabajadores/{id}")
	public Trabajador getOneTrabajador(@PathVariable(name = "id") Integer id) {
		return trabajadorServiceImpl.getOneTrabajador(id);
	}
	
	@PutMapping("/trabajadores/{id}")
	public Trabajador actualizarTrabajador(@PathVariable(name = "id") Integer id, @RequestBody Trabajador trabajador) {
		Trabajador ptTrabajador = new Trabajador();
		
		ptTrabajador = trabajadorServiceImpl.getOneTrabajador(id);
		
		ptTrabajador.setNomApel(trabajador.getNomApel());
		ptTrabajador.setTrabajo(trabajador.getTrabajo());
		
		return trabajadorServiceImpl.actualizarTrabajador(ptTrabajador);
	}
	
	@DeleteMapping("/trabajadores/{id}")
	public void eliminarTrabajador(@PathVariable(name = "id") Integer id) {
		trabajadorServiceImpl.eliminarTrabajador(id);
	}
}
