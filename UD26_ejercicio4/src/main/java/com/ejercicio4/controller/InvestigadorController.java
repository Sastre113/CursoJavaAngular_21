/**
 * 
 */
package com.ejercicio4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ejercicio4.dto.Investigador;
import com.ejercicio4.service.InvestigadorServiceImpl;

/**
 * @author Miguel A. Sastre
 *
 */

@RestController
@RequestMapping("/api")
public class InvestigadorController {

	@Autowired
	InvestigadorServiceImpl investigadorServiceImpl;
	
	@GetMapping("/investigadores")
	public List<Investigador> listarInvestigadors(){
		return investigadorServiceImpl.listarInvestigadores();
	}
	
	@PostMapping("/investigadores")
	public Investigador añadirInvestigador(@RequestBody Investigador investigador) {
		return investigadorServiceImpl.añadirInvestigador(investigador);
	}
	
	@GetMapping("/investigadores/{id}")
	public Investigador getInvestigadorXId(@PathVariable(name = "id") String id) {
		return investigadorServiceImpl.getInvestigadorXId(id);
	}
	
	@PutMapping("/investigadores/{id}")
	public Investigador actualizarInvestigador(@PathVariable(name = "id") String id, @RequestBody Investigador investigador) {
		Investigador ptInvestigador = new Investigador();
		
		ptInvestigador = investigadorServiceImpl.getInvestigadorXId(id);
		
		ptInvestigador.setDni(investigador.getDni());
		ptInvestigador.setNomapels(investigador.getNomapels());
		
		return investigadorServiceImpl.actualizarInvestigador(ptInvestigador);
	}
	
	@DeleteMapping("/investigadores/{id}")
	public void eliminarInvestigador(@PathVariable(name = "id") String id) {
		investigadorServiceImpl.eliminarInvestigador(id);
	}
}
