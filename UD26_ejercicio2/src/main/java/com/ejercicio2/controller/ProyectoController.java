/**
 * 
 */
package com.ejercicio2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ejercicio2.dto.Proyecto;
import com.ejercicio2.service.ProyectoServiceImpl;

/**
 * @author Miguel A. Sastre
 *
 */

@RestController
@RequestMapping("/api")
public class ProyectoController {

	@Autowired
	ProyectoServiceImpl proyectoServiceImpl;
	
	@GetMapping("/proyectos")
	public List<Proyecto> listarProyectos(){
		return proyectoServiceImpl.listarProyectos();
	}
	
	@PostMapping("/proyectos")
	public Proyecto añadirProyecto(@RequestBody Proyecto proyecto) {
		return proyectoServiceImpl.añadirProyecto(proyecto);
	}
	
	@GetMapping("/proyectos/{id}")
	public Proyecto getProyectoXId(@PathVariable(name = "id") String id) {
		return proyectoServiceImpl.getProyectoXId(id);
	}
	
	@PutMapping("/proyectos/{id}")
	public Proyecto actualizarProyecto(@PathVariable(name = "id") String id, @RequestBody Proyecto proyecto) {
		Proyecto ptProyecto = new Proyecto();
		
		ptProyecto = proyectoServiceImpl.getProyectoXId(id);
		
		ptProyecto.setId(proyecto.getId());
		ptProyecto.setNombre(proyecto.getNombre());
		ptProyecto.setHoras(proyecto.getHoras());
		
		
		return proyectoServiceImpl.actualizarProyecto(ptProyecto);
	}
	
	@DeleteMapping("/proyectos/{id}")
	public void eliminarProyecto(@PathVariable(name = "id") String id) {
		proyectoServiceImpl.eliminarProyecto(id);
	}
}
