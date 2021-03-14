/**
 * 
 */
package com.ejercicio3.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ejercicio3.dto.Venta;
import com.ejercicio3.service.VentaServiceImpl;

/**
 * @author Miguel A. Sastre
 *
 */
@RestController
@RequestMapping("/api")
public class VentaController {

	@Autowired
	VentaServiceImpl ventaServiceImpl;
	
	@GetMapping("/venta")
	public List<Venta> listarVenta() {
		return ventaServiceImpl.listarVenta();
	}

	@PostMapping("/venta")
	public Venta añadirVenta(@RequestBody Venta venta) {
		return ventaServiceImpl.añadirVenta(venta);
	}

	@PutMapping("/venta/{id}")
	public Venta actualizarVenta(@PathVariable(name="id")Long id,Venta venta) {
		Venta ptVenta = new Venta();
		
		ptVenta = ventaServiceImpl.getVentaXId(id);
		
		ptVenta.setCajero(venta.getCajero());
		ptVenta.setMaquinaRegistradora(venta.getMaquinaRegistradora());
		ptVenta.setProducto(venta.getProducto());
		return ventaServiceImpl.actualizarVenta(ptVenta);
	}

	@DeleteMapping("/venta/{id}")
	public void eliminarVenta(@PathVariable(name="id") Long id) {
		ventaServiceImpl.eliminarVenta(id);
	}

	@GetMapping("/venta/{id}")
	public Venta getVentaXId(@PathVariable(name="id") Long id) {
		return ventaServiceImpl.getVentaXId(id);
	}

	
}
