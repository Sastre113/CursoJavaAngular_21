/**
 * 
 */
package com.ejercicio2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ejercicio2.dto.Departamento;
import com.ejercicio2.service.DepartamentoServiceImpl;

/**
 * @author Miguel A. Sastre
 *
 */

@RestController
@RequestMapping("/api")
public class DepartamentoController {

	@Autowired
	DepartamentoServiceImpl departamentoServiceImpl;
	
	@GetMapping("/departamentos")
	public List<Departamento> listarDepartamentos(){
		return departamentoServiceImpl.listarDepartamentos();
	}
	
	@PostMapping("/departamentos")
	public Departamento añadirDepartamento(@RequestBody Departamento departamento) {
		return departamentoServiceImpl.añadirDepartamento(departamento);
	}
	
	@GetMapping("/departamentos/{codigo}")
	public Departamento getDepartamentoXId(@PathVariable(name = "codigo") Long codigo) {
		return departamentoServiceImpl.getDepartamentoXCodigo(codigo);
	}
	
	@PutMapping("/departamentos/{codigo}")
	public Departamento actualizarDepartamento(@PathVariable(name = "codigo") Long codigo, @RequestBody Departamento departamento) {
		Departamento ptDepartamento = new Departamento();
		
		ptDepartamento = departamentoServiceImpl.getDepartamentoXCodigo(codigo);
		
		ptDepartamento.setNombre(departamento.getNombre());
		
		return departamentoServiceImpl.actualizarDepartamento(ptDepartamento);
	}
	
	@DeleteMapping("/departamentos/{codigo}")
	public void eliminarDepartamento(@PathVariable(name = "codigo") Long codigo) {
		departamentoServiceImpl.eliminarDepartamento(codigo);
	}
}
