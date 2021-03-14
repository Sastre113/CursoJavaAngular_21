/**
 * 
 */
package com.ejercicio3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ejercicio3.dto.Producto;
import com.ejercicio3.service.ProductoServiceImpl;

/**
 * @author Miguel A. Sastre
 *
 */

@RestController
@RequestMapping("/api")
public class ProductoController {

	@Autowired
	ProductoServiceImpl productoServiceImpl;
	
	@GetMapping("/productos")
	public List<Producto> listarProductos(){
		return productoServiceImpl.listarProductoes();
	}
	
	@PostMapping("/productos")
	public Producto añadirProducto(@RequestBody Producto producto) {
		return productoServiceImpl.añadirProducto(producto);
	}
	
	@GetMapping("/productos/{id}")
	public Producto getProductoXId(@PathVariable(name = "id") Long id) {
		return productoServiceImpl.getProductoXId(id);
	}
	
	@PutMapping("/productos/{id}")
	public Producto actualizarProducto(@PathVariable(name = "id") Long id, @RequestBody Producto producto) {
		Producto ptProducto = new Producto();
		
		ptProducto = productoServiceImpl.getProductoXId(id);
		
		ptProducto.setNombre(producto.getNombre());
		ptProducto.setPrecio(producto.getPrecio());
		
		return productoServiceImpl.actualizarProducto(ptProducto);
	}
	
	@DeleteMapping("/productos/{id}")
	public void eliminarProducto(@PathVariable(name = "id") Long id) {
		productoServiceImpl.eliminarProducto(id);
	}
}
