/**
 * 
 */
package com.ejercicio3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ejercicio3.dto.MaquinaRegistradora;
import com.ejercicio3.service.MaquinaRegistradoraServiceImpl;

/**
 * @author Miguel A. Sastre
 *
 */

@RestController
@RequestMapping("/api")
public class MaquinaRegistradoraController {

	@Autowired
	MaquinaRegistradoraServiceImpl maquinaRegistradoraServiceImpl;
	
	@GetMapping("/maquinaRegistradora")
	public List<MaquinaRegistradora> listarMaquinaRegistradoras(){
		return maquinaRegistradoraServiceImpl.listarMaquinaRegistradoras();
	}
	
	@PostMapping("/maquinaRegistradora")
	public MaquinaRegistradora añadirMaquinaRegistradora(@RequestBody MaquinaRegistradora maquinaRegistradora) {
		return maquinaRegistradoraServiceImpl.añadirMaquinaRegistradora(maquinaRegistradora);
	}
	
	@GetMapping("/maquinaRegistradora/{id}")
	public MaquinaRegistradora getMaquinaRegistradoraXId(@PathVariable(name = "id") Long id) {
		return maquinaRegistradoraServiceImpl.getMaquinaRegistradoraXId(id);
	}
	
	@PutMapping("/maquinaRegistradora/{id}")
	public MaquinaRegistradora actualizarMaquinaRegistradora(@PathVariable(name = "id") Long id, @RequestBody MaquinaRegistradora maquinaRegistradora) {
		MaquinaRegistradora ptMaquinaRegistradora = new MaquinaRegistradora();
		
		ptMaquinaRegistradora = maquinaRegistradoraServiceImpl.getMaquinaRegistradoraXId(id);
		
		ptMaquinaRegistradora.setCodigo(maquinaRegistradora.getCodigo());
		ptMaquinaRegistradora.setPiso(maquinaRegistradora.getPiso());
		
		return maquinaRegistradoraServiceImpl.actualizarMaquinaRegistradora(ptMaquinaRegistradora);
	}
	
	@DeleteMapping("/maquinaRegistradora/{id}")
	public void eliminarMaquinaRegistradora(@PathVariable(name = "id") Long id) {
		maquinaRegistradoraServiceImpl.eliminarMaquinaRegistradora(id);
	}
}
