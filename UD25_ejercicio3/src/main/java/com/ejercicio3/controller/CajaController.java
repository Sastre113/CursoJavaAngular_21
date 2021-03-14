/**
 * 
 */
package com.ejercicio3.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ejercicio3.dto.Caja;
import com.ejercicio3.service.CajaServiceImpl;

/**
 * @author Miguel A. Sastre
 *
 */
@RestController
@RequestMapping("/api")
public class CajaController {

	@Autowired
	CajaServiceImpl cajaServiceImpl;
	
	@GetMapping("/cajas")
	public List<Caja> listarCajas() {
		return cajaServiceImpl.listarCajas();
	}

	@PostMapping("/cajas")
	public Caja añadirCajas(@RequestBody Caja caja) {
		return cajaServiceImpl.añadirCajas(caja);
	}

	@PutMapping("/cajas/{num}")
	public Caja actualizarCajas(@PathVariable(name="num")String numReferencia,Caja caja) {
		Caja ptCaja = new Caja();
		
		ptCaja = cajaServiceImpl.getCajasXId(numReferencia);
		
		ptCaja.setContenido(caja.getContenido());
		ptCaja.setValor(caja.getValor());
		ptCaja.setAlmacen(caja.getAlmacen());
		
		return cajaServiceImpl.actualizarCajas(ptCaja);
	}

	@DeleteMapping("/cajas/{num}")
	public void eliminarCajas(@PathVariable(name="num")String numReferencia ) {
		cajaServiceImpl.eliminarCajas(numReferencia);
	}

	@GetMapping("/cajas/{num}")
	public Caja getCajasXId(@PathVariable(name="num") String numReferencia) {
		return cajaServiceImpl.getCajasXId(numReferencia);
	}

	
}
