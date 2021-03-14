/**
 * 
 */
package com.ejercicio1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ejercicio1.dto.Proveedor;
import com.ejercicio1.service.ProveedorServiceImpl;

/**
 * @author Miguel A. Sastre
 *
 */

@RestController
@RequestMapping("/api")
public class ProveedorController {

	@Autowired
	ProveedorServiceImpl proveedorServiceImpl;
	
	@GetMapping("/proveedores")
	public List<Proveedor> listarProveedors(){
		return proveedorServiceImpl.listarProveedores();
	}
	
	@PostMapping("/proveedores")
	public Proveedor añadirProveedor(@RequestBody Proveedor proveedor) {
		return proveedorServiceImpl.añadirProveedor(proveedor);
	}
	
	@GetMapping("/proveedores/{id}")
	public Proveedor getProveedorXId(@PathVariable(name = "id") String id) {
		return proveedorServiceImpl.getProveedorXId(id);
	}
	
	@PutMapping("/proveedores/{id}")
	public Proveedor actualizarProveedor(@PathVariable(name = "id") String id, @RequestBody Proveedor proveedor) {
		Proveedor ptProveedor = new Proveedor();
		
		ptProveedor = proveedorServiceImpl.getProveedorXId(id);
		
		ptProveedor.setNombre(proveedor.getNombre());
		
		return proveedorServiceImpl.actualizarProveedor(ptProveedor);
	}
	
	@DeleteMapping("/proveedores/{id}")
	public void eliminarProveedor(@PathVariable(name = "id") String id) {
		proveedorServiceImpl.eliminarProveedor(id);;
	}
}
