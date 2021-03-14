/**
 * 
 */
package com.ejercicio3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ejercicio3.dto.Almacen;
import com.ejercicio3.service.AlmacenServiceImpl;

/**
 * @author Miguel A. Sastre
 *
 */

@RestController
@RequestMapping("/api")
public class AlmacenController {

	@Autowired
	AlmacenServiceImpl almacenServiceImpl;
	
	@GetMapping("/almacenes")
	public List<Almacen> listarAlmacens(){
		return almacenServiceImpl.listarAlmacenes();
	}
	
	@PostMapping("/almacenes")
	public Almacen añadirAlmacen(@RequestBody Almacen almacen) {
		return almacenServiceImpl.añadirAlmacen(almacen);
	}
	
	@GetMapping("/almacenes/{codigo}")
	public Almacen getAlmacenXId(@PathVariable(name = "codigo") Long codigo) {
		return almacenServiceImpl.getAlmacenXId(codigo);
	}
	
	@PutMapping("/almacenes/{codigo}")
	public Almacen actualizarAlmacen(@PathVariable(name = "codigo") Long codigo, @RequestBody Almacen almacen) {
		Almacen ptAlmacen = new Almacen();
		
		ptAlmacen = almacenServiceImpl.getAlmacenXId(codigo);
		
		ptAlmacen.setLugar(almacen.getLugar());
		ptAlmacen.setCapacidad(almacen.getCapacidad());
		
		return almacenServiceImpl.actualizarAlmacen(ptAlmacen);
	}
	
	@DeleteMapping("/almacenes/{codigo}")
	public void eliminarAlmacen(@PathVariable(name = "codigo") Long codigo) {
		almacenServiceImpl.eliminarAlmacen(codigo);
	}
}
